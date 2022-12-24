package com.threescoops.mapper;

import java.util.List;

import com.threescoops.model.MealkitVO;
import com.threescoops.model.CateFilterDTO;
import com.threescoops.model.CateVO;
import com.threescoops.model.Criteria;
import com.threescoops.model.SelectDTO;

public interface MealkitMapper {

	/* 상품 검색 */
	public List<MealkitVO> getGoodsList(Criteria cri);
	
	/* 상품 총 갯수 */
	public int goodsGetTotal(Criteria cri);		
	
	/* 배송지 id 리스트 요청 */
	public String[] getAuthorIdList(String keyword);	
	
	/* 국내 카테고리 리스트 */
	public List<CateVO> getCateCode1();
	
	/* 외국 카테고리 리스트 */
	public List<CateVO> getCateCode2();		
	
	/* 검색 대상 카테고리 리스트 */
	public String[] getCateList(Criteria cri);
	
	/* 카테고리 정보(+검색대상 갯수) */
	public CateFilterDTO getCateInfo(Criteria cri);	
	
	/* 상품 정보 */
	public MealkitVO getGoodsInfo(int mealkitId);	
	
	/* 상품 id 이름 */
	public MealkitVO getmealkitIdName(int mealkitId);	
	
	/* 평줌순 상품 정보 */
	public List<SelectDTO> likeSelect();	
	
}
