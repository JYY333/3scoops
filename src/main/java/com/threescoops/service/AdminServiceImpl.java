package com.threescoops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.threescoops.mapper.AdminMapper;
import com.threescoops.model.AttachImageVO;
import com.threescoops.model.MealkitVO;
import com.threescoops.model.CateVO;
import com.threescoops.model.Criteria;
import com.threescoops.model.OrderDTO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;	
	
	/* 상품 등록 */
	@Transactional
	@Override
	public void mealkitEnroll(MealkitVO mealkit) {
		
		log.info("(srevice)mealkitEnroll........");
		
		adminMapper.mealkitEnroll(mealkit);
		
		if(mealkit.getImageList() == null || mealkit.getImageList().size() <= 0) {
			return;
		}
		
		mealkit.getImageList().forEach(attach ->{
			
			attach.setmealkitId(mealkit.getmealkitId());
			adminMapper.imageEnroll(attach);
			
		});
		
		
	}

	/* 카테고리 리스트 */
	@Override
	public List<CateVO> cateList() {
		
		log.info("(service)cateList........");
		
		return adminMapper.cateList();
	}

	/* 상품 리스트 */
	@Override
	public List<MealkitVO> goodsGetList(Criteria cri) {
		
		log.info("goodsGetTotalList()..........");
		
		return adminMapper.goodsGetList(cri);
	}

	/* 상품 총 갯수 */
	public int goodsGetTotal(Criteria cri) {
		
		log.info("goodsGetTotal().........");
		
		return adminMapper.goodsGetTotal(cri);
	}	
	
	/* 상품 조회 페이지 */
	@Override
	public MealkitVO goodsGetDetail(int mealkitId) {
		
		log.info("(service)mealkitGetDetail......." + mealkitId);
		
		return adminMapper.goodsGetDetail(mealkitId);
	}	
	
	/* 상품 정보 수정 */
	@Transactional
	@Override
	public int goodsModify(MealkitVO vo) {

		int result = adminMapper.goodsModify(vo);
		
		if(result == 1 && vo.getImageList() != null && vo.getImageList().size() > 0) {
			
			adminMapper.deleteImageAll(vo.getmealkitId());
			
			vo.getImageList().forEach(attach -> {
				
				attach.setmealkitId(vo.getmealkitId());
				adminMapper.imageEnroll(attach);
				
			});
			
		}
		
		return result;
	}	
	
	
	/* 상품 정보 삭제 */
	@Override
	@Transactional
	public int goodsDelete(int mealkitId) {

		log.info("goodsDelete..........");
		
		adminMapper.deleteImageAll(mealkitId);			
		
		return adminMapper.goodsDelete(mealkitId);
	}		
	
	
	/* 지정 상품 이미지 정보 얻기 */
	@Override
	public List<AttachImageVO> getAttachInfo(int mealkitId) {
		
		log.info("getAttachInfo........");
		
		return adminMapper.getAttachInfo(mealkitId);
	}
	
	/* 주문 상품 리스트 */
	@Override
	public List<OrderDTO> getOrderList(Criteria cri) {
		return adminMapper.getOrderList(cri);
	}
	
	/* 주문 총 갯수 */
	@Override
	public int getOrderTotal(Criteria cri) {
		return adminMapper.getOrderTotal(cri);
	}		
	
	
}
