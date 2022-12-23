package com.threescoops.model;

import java.util.List;

public class CartDTO {
	
    private int cartId;
    
    private String memberId;
    
    private int mealkitId;
    
    private int mealkitCount;
    
    //mealkit
    
    private String mealkitName;
    
    private int mealkitPrice;
    
    private double mealkitDiscount;
    
    // 추가
    private int salePrice;
    
    private int totalPrice;
    
    private int point;
    
    private int totalPoint;  
    
	/* 상품 이미지 */
	private List<AttachImageVO> imageList;	    
    

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public int getTotalPrice() {
		return totalPrice;
	}	
	
	public int getPoint() {
		return point;
	}

	public int getTotalPoint() {
		return totalPoint;
	}
	
	public List<AttachImageVO> getImageList() {
		return imageList;
	}

	public void setImageList(List<AttachImageVO> imageList) {
		this.imageList = imageList;
	}	

	public void initSaleTotal() {
		this.salePrice = (int) (this.mealkitPrice * (1-this.mealkitDiscount));
		this.totalPrice = this.salePrice*this.mealkitCount;
		this.point = (int)(Math.floor(this.salePrice*0.05));
		this.totalPoint =this.point * this.mealkitCount;		
	}

	@Override
	public String toString() {
		return "CartDTO [cartId=" + cartId + ", memberId=" + memberId + ", mealkitId=" + mealkitId + ", mealkitCount="
				+ mealkitCount + ", mealkitName=" + mealkitName + ", mealkitPrice=" + mealkitPrice + ", mealkitDiscount=" + mealkitDiscount
				+ ", salePrice=" + salePrice + ", totalPrice=" + totalPrice + ", point=" + point + ", totalPoint="
				+ totalPoint + ", imageList=" + imageList + "]";
	}

	    
	
	
    
}

