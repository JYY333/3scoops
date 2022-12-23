package com.threescoops.model;

import java.util.List;

public class OrderPageItemDTO {
	
	/* 뷰로부터 전달받을 값 */
    private int mealkitId;
    
    private int mealkitCount;
    
	/* DB로부터 꺼내올 값 */
    private String mealkitName;
    
    private int mealkitPrice;
    
    private double mealkitDiscount;
    
	/* 만들어 낼 값 */
    private int salePrice;
    
    private int totalPrice;
    
    private int point;
    
    private int totalPoint;
    
	/* 상품 이미지 */
	private List<AttachImageVO> imageList;	    

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

	public String getmealkitName() {
		return mealkitName;
	}

	public void setmealkitName(String mealkitName) {
		this.mealkitName = mealkitName;
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

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getTotalPoint() {
		return totalPoint;
	}

	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}    

	public void initSaleTotal() {
		this.salePrice = (int) (this.mealkitPrice * (1-this.mealkitDiscount));
		this.totalPrice = this.salePrice*this.mealkitCount;
		this.point = (int)(Math.floor(this.salePrice*0.05));
		this.totalPoint =this.point * this.mealkitCount;
		
	}

	public List<AttachImageVO> getImageList() {
		return imageList;
	}

	public void setImageList(List<AttachImageVO> imageList) {
		this.imageList = imageList;
	}

	@Override
	public String toString() {
		return "OrderPageItemDTO [mealkitId=" + mealkitId + ", mealkitCount=" + mealkitCount + ", mealkitName=" + mealkitName
				+ ", mealkitPrice=" + mealkitPrice + ", mealkitDiscount=" + mealkitDiscount + ", salePrice=" + salePrice
				+ ", totalPrice=" + totalPrice + ", point=" + point + ", totalPoint=" + totalPoint + ", imageList="
				+ imageList + "]";
	}

	
    
}
