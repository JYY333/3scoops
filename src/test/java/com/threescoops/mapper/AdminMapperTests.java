package com.threescoops.mapper;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.threescoops.mapper.AdminMapper;
import com.threescoops.model.AttachImageVO;
import com.threescoops.model.MealkitVO;
import com.threescoops.model.Criteria;
import com.threescoops.model.OrderDTO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AdminMapperTests {

	@Autowired
	private AdminMapper mapper;
	
	/* 상품 등록 */

	@Test
	public void mealkitEnrollTest() throws Exception{
		
		MealkitVO mealkit = new MealkitVO();
		mealkit.setmealkitName("mealkit01");
		mealkit.setAuthorId(1);
		mealkit.setPubleYear("2022-12-22");
		mealkit.setPublisher("kosa_최경호");
		mealkit.setCateCode("202001");
		mealkit.setmealkitPrice(15000);
		mealkit.setmealkitStock(120);
		mealkit.setmealkitDiscount(0.23);
		mealkit.setmealkitIntro("참조기 매운탕");
		mealkit.setmealkitContents("참조기 매운탕");
		
		System.out.println("Before mealkitVO :" + mealkit);
		
		mapper.mealkitEnroll(mealkit);
		
		System.out.println("After mealkitVO :" + mealkit);
		
	}

	
	/* 카테고리 리스트 */
	/*
	@Test
	public void cateListTest() throws Exception{
		
		System.out.println("cateList()..........." + mapper.cateList());
		
	}
	*/
	
	/* 상품 리스트 & 상품 총 개수*/
	/*
	@Test
	public void goodsGetListTests() {
		
		Criteria cri = new Criteria();
		
		cri.setKeyword("test");
		
		// 상품 리스트 
		List list = mapper.goodsGetList(cri);
		for(int i = 0; i < 10; i++) {
			System.out.println("result..........." +i + " : " + list.get(i) );
		}
		
		
		
		/// 상품 총 개수 
		//int result = mapper.goodsGetTotal(cri);
		//System.out.println("resout........." + result);
		
	}
	*/
	
	/* 상품 조회 페이지 */
	/*
	@Test
	public void goodsGetDetailTest() {
		
		int mealkitId = 134;
		
		mealkitVO result = mapper.goodsGetDetail(mealkitId);
		
		System.out.println("상품 상페 결과 : " + result);
		
		
	}
	*/
	
	/* 상품 정보 수정 */
	/*
	@Test
	public void goodsModifyTest() {
		
		mealkitVO mealkit = new mealkitVO();
		
		mealkit.setmealkitId(95);
		mealkit.setmealkitName("mapper 테스트");
		mealkit.setAuthorId(94);
		mealkit.setPubleYear("2021-03-18");
		mealkit.setPublisher("출판사");
		mealkit.setCateCode("103002");
		mealkit.setmealkitPrice(20000);
		mealkit.setmealkitStock(300);
		mealkit.setmealkitDiscount(0.23);
		mealkit.setmealkitIntro("상품 내용1 ");
		mealkit.setmealkitContents("상품 내용2 ");
		
		mapper.goodsModify(mealkit);
		
	}
	*/
	
	/* 상품 정보 삭제 */
	/*
	@Test
	public void goodsDeleteTest() {
		
		int mealkitId = 169;
		
		int result = mapper.goodsDelete(mealkitId);
		
		if(result == 1) {
			System.out.println("삭제 성공");
		}
		
	}
	*/	
	
	/* 이미지 등록 */
	/*
	@Test
	public void imageEnrollTest() {
		
		AttachImageVO vo = new AttachImageVO();
		
		vo.setmealkitId(137);
		vo.setFileName("test");
		vo.setUploadPath("test");
		vo.setUuid("test2");
		
		mapper.imageEnroll(vo);
		
	}
	*/
	
	/* 지정 상품 이미지 삭제 */
	/*
	@Test
	public void deleteImageAllTest() {
		
		int mealkitId = 3124;
		
		mapper.deleteImageAll(mealkitId);
		
	}
	*/
	
	/* 어제자 날짜 이미지 리스트 */
	/*
	@Test
	public void checkImageListTest() {
		
		mapper.checkFileList();
		
	}
	*/
	
	/* 지정 상품 이미지 정보 얻기 */
	/*
	@Test
	public void getAttachInfoTest() {
		
		int mealkitId = 3141;
		
		List<AttachImageVO> list = mapper.getAttachInfo(mealkitId);
		
		System.out.println("list : " + list);
		
	}		
	*/
	
	/* 주문 현황 리스트 */
//	@Test
//	public void getOrderList() {
//		
//		Criteria cri = new Criteria();
//		
//		//String memberId = "admin";
//		//String memberId = "";
//		String memberId = null;
//		cri.setKeyword(memberId);
//		
//		List<OrderDTO> orderList = mapper.getOrderList(cri);
//		mapper.getOrderTotal(cri);
//		
//		for(OrderDTO dto : orderList) {
//			System.out.println("dto : " + dto);
//		}
//		
//	}	
	
	
}
