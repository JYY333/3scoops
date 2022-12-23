package com.threescoops.service;

import java.util.List;

import com.threescoops.model.MealkitVO;
import com.threescoops.model.CateFilterDTO;
import com.threescoops.model.CateVO;
import com.threescoops.model.Criteria;
import com.threescoops.model.SelectDTO;

public interface MealkitService {

	/* 상품 검색 */
	public List<MealkitVO> getGoodsList(Criteria cri);
	
	/* 상품 총 갯수 */
	public int goodsGetTotal(Criteria cri);	
	
	/* 국내 카테고리 리스트 */
	public List<CateVO> getCateCode1();
	
	/* 외국 카테고리 리스트 */
	public List<CateVO> getCateCode2();	
	
	/* 검색결과 카테고리 필터 정보 */
	public List<CateFilterDTO> getCateInfoList(Criteria cri);
	
	/* 상품 정보 */
	public MealkitVO getGoodsInfo(int mealkitId);	
	
	/* 상품 id 이름 */
	public MealkitVO getmealkitIdName(int mealkitId);
	
	/* 평줌순 상품 정보 */
	public List<SelectDTO> likeSelect();	
	
}
