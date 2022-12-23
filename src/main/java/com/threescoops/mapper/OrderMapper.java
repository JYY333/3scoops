package com.threescoops.mapper;

import java.util.List;

import com.threescoops.model.MealkitVO;
import com.threescoops.model.MemberVO;
import com.threescoops.model.OrderDTO;
import com.threescoops.model.OrderItemDTO;
import com.threescoops.model.OrderPageItemDTO;

public interface OrderMapper {

	/* 주문 상품 정보(주문 페이지) */	
	public OrderPageItemDTO getGoodsInfo(int mealkitId);	
	
	/* 주문 상품 정보(주문 처리) */	
	public OrderItemDTO getOrderInfo(int mealkitId);
	
	/* 주문 테이블 등록 */
	public int enrollOrder(OrderDTO ord);	

	/* 주문 아이템 테이블 등록 */
	public int enrollOrderItem(OrderItemDTO orid);
	
	/* 주문 금액 차감 */
	public int deductMoney(MemberVO member);	
	
	/* 주문 재고 차감 */
	public int deductStock(MealkitVO mealkit);	
	
	/* 주문 취소 */
	public int orderCancle(String orderId);
	
	/* 주문 상품 정보(주문취소) */
	public List<OrderItemDTO> getOrderItemInfo(String orderId);
	
	/* 주문 정보(주문취소) */
	public OrderDTO getOrder(String orderId);
	
	
}
