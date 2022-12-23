package com.threescoops.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threescoops.mapper.AdminMapper;
import com.threescoops.mapper.AttachMapper;
import com.threescoops.mapper.MealkitMapper;
import com.threescoops.model.AttachImageVO;
import com.threescoops.model.MealkitVO;
import com.threescoops.model.CateFilterDTO;
import com.threescoops.model.CateVO;
import com.threescoops.model.Criteria;
import com.threescoops.model.SelectDTO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MealkitServiceImpl implements MealkitService{

	@Autowired
	private MealkitMapper mealkitMapper;
	
	@Autowired
	private AttachMapper attachMapper;
	
	@Autowired
	private AdminMapper adminMapper;	
	
	/* 상품 검색 */
	@Override
	public List<MealkitVO> getGoodsList(Criteria cri) {
		
		log.info("getGoodsList().......");
		
		String type = cri.getType();
		String[] typeArr = type.split("");
		String[] authorArr = mealkitMapper.getAuthorIdList(cri.getKeyword());
		
		
		if(type.equals("A") || type.equals("AC") || type.equals("AT") || type.equals("ACT")) {
			if(authorArr.length == 0) {
				return new ArrayList();
			}
		}
		
		for(String t : typeArr) {
			if(t.equals("A")) {
				cri.setAuthorArr(authorArr);
			}
		}		
		
		List<MealkitVO> list = mealkitMapper.getGoodsList(cri);
		
		list.forEach(mealkit -> {
			
			int mealkitId = mealkit.getmealkitId();
			
			List<AttachImageVO> imageList = attachMapper.getAttachList(mealkitId);
			
			mealkit.setImageList(imageList);
			
		});
		
		return list;
	}

	/* 사품 총 갯수 */
	@Override
	public int goodsGetTotal(Criteria cri) {
		
		log.info("goodsGetTotal().......");
		
		return mealkitMapper.goodsGetTotal(cri);
		
	}	
	
	/* 국내 카테고리 리스트 */
	@Override
	public List<CateVO> getCateCode1() {
		
		log.info("getCateCode1().........");
		
		return mealkitMapper.getCateCode1();
	}

	/* 외국 카테고리 리스트 */
	@Override
	public List<CateVO> getCateCode2() {
		
		log.info("getCateCode2().........");
		
		return mealkitMapper.getCateCode2();
	}

	
	/* 검색결과 카테고리 필터 정보 */
	@Override
	public List<CateFilterDTO> getCateInfoList(Criteria cri) {

		List<CateFilterDTO> filterInfoList = new ArrayList<CateFilterDTO>();
		
		String[] typeArr = cri.getType().split("");
		String [] authorArr;
		
		for(String type : typeArr) {
			if(type.equals("A")){
				authorArr = mealkitMapper.getAuthorIdList(cri.getKeyword());
				if(authorArr.length == 0) {
					return filterInfoList;
				}
				cri.setAuthorArr(authorArr);
			}
		}
		
		String[] cateList = mealkitMapper.getCateList(cri);
		
		String tempCateCode = cri.getCateCode();
		
		for(String cateCode : cateList) {
			cri.setCateCode(cateCode);
			CateFilterDTO filterInfo = mealkitMapper.getCateInfo(cri);
			filterInfoList.add(filterInfo);
		}
		
		cri.setCateCode(tempCateCode);
		
		return filterInfoList;
	}		
	
	/* 상품 정보 */
	@Override
	public MealkitVO getGoodsInfo(int mealkitId) {
		
		MealkitVO goodsInfo = mealkitMapper.getGoodsInfo(mealkitId);
		goodsInfo.setImageList(adminMapper.getAttachInfo(mealkitId));
		
		
		return goodsInfo;
	}		
	
	
	@Override
	public MealkitVO getmealkitIdName(int mealkitId) {
		
		return mealkitMapper.getmealkitIdName(mealkitId);
	}

	@Override
	public List<SelectDTO> likeSelect() {
		
		List<SelectDTO> list = mealkitMapper.likeSelect();
		
		list.forEach(dto -> {
			
			int mealkitId = dto.getmealkitId();
			
			List<AttachImageVO> imageList = attachMapper.getAttachList(mealkitId);
			
			dto.setImageList(imageList);
			
		});				
		
		
		return list;	

	}		
	
}
