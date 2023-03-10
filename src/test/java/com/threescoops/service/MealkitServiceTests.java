package com.threescoops.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.threescoops.model.MealkitVO;
import com.threescoops.service.MealkitService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MealkitServiceTests {
	
	@Autowired
	MealkitService service;
	
	/*
	@Test
	public void getCateInfoListTest1() {
		Criteria cri = new Criteria();
	
		String type = "TC";
		//String keyword = "테스트";
		String keyword = "없음";	
		String cateCode="103002";

		cri.setType(type);
		cri.setKeyword(keyword);
		cri.setCateCode(cateCode);
		
		System.out.println("List<CateFilterDTO> : " + service.getCateInfoList(cri));
		
	}
	*/
	
	/*
	@Test
	public void getCateInfoListTest2() {
		Criteria cri = new Criteria();
	
		String type = "AC";
		String keyword = "유홍준";	// 카테고리에 존재하는 배송지
		//String keyword = "머스크";	// 카테고리에 존재하지 않는 배송지
		String cateCode = "103002";

		cri.setType(type);
		cri.setKeyword(keyword);
		cri.setCateCode(cateCode);
		
		System.out.println("List<CateFilterDTO> : " + service.getCateInfoList(cri));
		
	}	
	*/

	/*
	@Test
	public void getCateInfoListTest3() {
		Criteria cri = new Criteria();
	
		String type = "T";
		String keyword = "테스트";
		//String keyword = "없음";	
		

		cri.setType(type);
		cri.setKeyword(keyword);
		
		System.out.println("List<CateFilterDTO> : " + service.getCateInfoList(cri));
		
	}	
	*/
	
	/*
	@Test
	public void getCateInfoListTest4() {
		Criteria cri = new Criteria();
	
		String type = "AC";
		//String keyword = "유홍준";	// 카테고리에 존재하는 배송지
		String keyword = "머스크";	// 카테고리에 존재하지 않는 배송지
		

		cri.setType(type);
		cri.setKeyword(keyword);
		
		System.out.println("List<CateFilterDTO> : " + service.getCateInfoList(cri));
		
	}		
	*/
	
	/*상품 상세 정보*/
	@Test
	public void getGoodsInfoTest() {
		
		int mealkitId = 1166;
		
		MealkitVO goodsInfo = service.getGoodsInfo(mealkitId);
		
		System.out.println("==결과==");
		System.out.println("전체 : " + goodsInfo);
		System.out.println("mealkitId : " + goodsInfo.getmealkitId() );
		System.out.println("이미지 정보 : " + goodsInfo.getImageList().isEmpty());
		
		
	}	
	
	
}
