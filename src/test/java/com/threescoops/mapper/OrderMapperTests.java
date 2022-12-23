package com.threescoops.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.threescoops.mapper.OrderMapper;
import com.threescoops.model.MealkitVO;
import com.threescoops.model.MemberVO;
import com.threescoops.model.OrderDTO;
import com.threescoops.model.OrderItemDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class OrderMapperTests {

	@Autowired
	private OrderMapper mapper;
	
	/* 상품 정보(주문 처리) */
	@Test
	public void getOrderInfoTest() {
		
		 OrderItemDTO orderInfo = mapper.getOrderInfo(61);
		 
		 System.out.println("result : " + orderInfo);
	}
	
	/* threescoops_order 테이블 등록 */
	@Test
	public void enrollOrderTest() {
		
		OrderDTO ord = new OrderDTO();
		List<OrderItemDTO> orders = new ArrayList();
		
		OrderItemDTO order1 = new OrderItemDTO();
		
		order1.setmealkitId(61);
		order1.setmealkitCount(5);
		order1.setmealkitPrice(70000);
		order1.setmealkitDiscount(0.1);
		order1.initSaleTotal();
		
		
		
		ord.setOrders(orders);
		
		ord.setOrderId("2021_test1");
		ord.setAddressee("test");
		ord.setMemberId("admin");
		ord.setMemberAddr1("test");
		ord.setMemberAddr2("test");
		ord.setMemberAddr3("test");
		ord.setOrderState("배송중비");
		ord.getOrderPriceInfo();
		ord.setUsePoint(1000);
		
		mapper.enrollOrder(ord);		
		
	}
	
	/* threescoops_itemorder 테이블 등록 */
	@Test
	public void enrollOrderItemTest() {
		
		OrderItemDTO oid = new OrderItemDTO();
		
		oid.setOrderId("2021_test1");
		oid.setmealkitId(61);
		oid.setmealkitCount(1);
		oid.setmealkitPrice(70000);
		oid.setmealkitDiscount(0.1);
				
		oid.initSaleTotal();
		
		mapper.enrollOrderItem(oid);
		
	}	
	
	/* 회원 돈, 포인트 정보 변경 */
	@Test
	public void deductMoneyTest() {
		
		MemberVO member = new MemberVO();
		
		member.setMemberId("admin");
		member.setMoney(500000);
		member.setPoint(10000);
		
		mapper.deductMoney(member);
	}
	
	/* 상품 재고 변경 */
	@Test
	public void deductStockTest() {
		MealkitVO mealkit = new MealkitVO();
		
		mealkit.setmealkitId(61);
		mealkit.setmealkitStock(77);
		
		mapper.deductStock(mealkit);
	}	
		

	
}
