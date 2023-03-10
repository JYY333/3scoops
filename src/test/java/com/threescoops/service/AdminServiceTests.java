package com.threescoops.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.threescoops.model.AttachImageVO;
import com.threescoops.model.MealkitVO;
import com.threescoops.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AdminServiceTests {

	@Autowired
	private AdminService service;
	
	
	/* 상품 등록 & 상품 이미지 등록 테스트 */
	@Test
	public void mealkitEnrollTEsts() {

		MealkitVO mealkit = new MealkitVO();
		// 상품 정보
		mealkit.setmealkitName("service 테스트");
		mealkit.setAuthorId(27);
		mealkit.setPubleYear("2021-03-18");
		mealkit.setPublisher("출판사");
		mealkit.setCateCode("202001");
		mealkit.setmealkitPrice(20000);
		mealkit.setmealkitStock(300);
		mealkit.setmealkitDiscount(0.23);
		mealkit.setmealkitIntro("상품 소개 ");
		mealkit.setmealkitContents("상품 목차 ");

		// 이미지 정보
		List<AttachImageVO> imageList = new ArrayList<AttachImageVO>(); 
		
		AttachImageVO image1 = new AttachImageVO();
		AttachImageVO image2 = new AttachImageVO();
		
		image1.setFileName("test Image 1");
		image1.setUploadPath("test image 1");
		image1.setUuid("test11112");
		
		image2.setFileName("test Image 2");
		image2.setUploadPath("test image 2");
		image2.setUuid("test22222");
		
		imageList.add(image1);
		imageList.add(image2);
		
		
		mealkit.setImageList(imageList);
		
		// mealkitEnroll() 메서드 호출
		service.mealkitEnroll(mealkit);
		
		System.out.println("등록된 VO : " + mealkit);
		
		
	}
	
}
