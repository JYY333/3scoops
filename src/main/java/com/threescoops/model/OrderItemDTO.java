package com.threescoops.model;

public class OrderItemDTO {

	/* 주문 번호 */
	private String orderId;
	
	/* 상품 번호 */
    private int mealkitId;
    
	/* 주문 수량 */
    private int mealkitCount;
    
	/* threescoops_orderItem 기본키 */
    private int orderItemId;
    
	/* 상품 한 개 가격 */
    private int mealkitPrice;
    
	/* 상품 할인 율 */
    private double mealkitDiscount;
    
	/* 상품 한개 구매 시 획득 포인트 */
    private int savePoint;
    
	/* DB테이블 존재 하지 않는 데이터 */
    
	/* 할인 적용된 가격 */
    private int salePrice;
    
	/* 총 가격(할인 적용된 가격 * 주문 수량) */
    private int totalPrice;
    
	/* 총 획득 포인트(상품 한개 구매 시 획득 포인트 * 수량) */
    private int totalSavePoint;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getmealkitId() {
		return mealkitId;
	}

	public void setmealkitId(int mealkitId) {
		this.mealkitId = mealkitId;
	}

	public int getmealkitCount() {
		return mealkitCount;
	}

	public void setmealkitCount(int mealkitCount) {
		this.mealkitCount = mealkitCount;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getmealkitPrice() {
		return mealkitPrice;
	}

	public void setmealkitPrice(int mealkitPrice) {
		this.mealkitPrice = mealkitPrice;
	}

	public double getmealkitDiscount() {
		return mealkitDiscount;
	}

	public void setmealkitDiscount(double mealkitDiscount) {
		this.mealkitDiscount = mealkitDiscount;
	}

	public int getSavePoint() {
		return savePoint;
	}

	public void setSavePoint(int savePoint) {
		this.savePoint = savePoint;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalSavePoint() {
		return totalSavePoint;
	}

	public void setTotalSavePoint(int totalSavePoint) {
		this.totalSavePoint = totalSavePoint;
	}

	@Override
	public String toString() {
		return "OrderItemDTO [orderId=" + orderId + ", mealkitId=" + mealkitId + ", mealkitCount=" + mealkitCount + ", orderItemId="
				+ orderItemId + ", mealkitPrice=" + mealkitPrice + ", mealkitDiscount=" + mealkitDiscount + ", savePoint="
				+ savePoint + ", salePrice=" + salePrice + ", totalPrice=" + totalPrice + ", totalSavePoint="
				+ totalSavePoint + "]";
	}
	
	public void initSaleTotal() {
		this.salePrice = (int) (this.mealkitPrice * (1-this.mealkitDiscount));
		this.totalPrice = this.salePrice*this.mealkitCount;
		this.savePoint = (int)(Math.floor(this.salePrice*0.05));
		this.totalSavePoint =this.savePoint * this.mealkitCount;
	}		
    
    
	
}
