package com.threescoops.model;

import java.util.Date;
import java.util.List;

public class MealkitVO {

	/* 상품 id */
	private int mealkitId;
	
	/* 상품 이름 */
	private String mealkitName;
	
	/* 소매자 id */
	private int authorId;
	
	/* 소매자 이름 */
	private String authorName;
	
	/* 출판일 */
	private String publeYear;
	
	/* 출판사 */
	private String publisher;
	
	/* 카테고리 코드 */
	private String cateCode;
	
	/* 카테고리 이름 */
	private String cateName;
	
	/* 상품 가격 */
	private int mealkitPrice;
	
	/* 상품 재고 */
	private int mealkitStock;
	
	/* 상품 할인률(백분율) */
	private double mealkitDiscount;
	
	/* 상품 소개 */
	private String mealkitIntro;
	
	/* 상품 목차 */
	private String mealkitContents;
	
	/* 등록 날짜 */
	private Date regDate;
	
	/* 수정 날짜 */
	private Date updateDate;
	
	/* 이미지 정보 */
	private List<AttachImageVO> imageList;

	public int getmealkitId() {
		return mealkitId;
	}

	public void setmealkitId(int mealkitId) {
		this.mealkitId = mealkitId;
	}

	public String getmealkitName() {
		return mealkitName;
	}

	public void setmealkitName(String mealkitName) {
		this.mealkitName = mealkitName;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPubleYear() {
		return publeYear;
	}

	public void setPubleYear(String publeYear) {
		this.publeYear = publeYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCateCode() {
		return cateCode;
	}

	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public int getmealkitPrice() {
		return mealkitPrice;
	}

	public void setmealkitPrice(int mealkitPrice) {
		this.mealkitPrice = mealkitPrice;
	}

	public int getmealkitStock() {
		return mealkitStock;
	}

	public void setmealkitStock(int mealkitStock) {
		this.mealkitStock = mealkitStock;
	}

	public double getmealkitDiscount() {
		return mealkitDiscount;
	}

	public void setmealkitDiscount(double mealkitDiscount) {
		this.mealkitDiscount = mealkitDiscount;
	}

	public String getmealkitIntro() {
		return mealkitIntro;
	}

	public void setmealkitIntro(String mealkitIntro) {
		this.mealkitIntro = mealkitIntro;
	}

	public String getmealkitContents() {
		return mealkitContents;
	}

	public void setmealkitContents(String mealkitContents) {
		this.mealkitContents = mealkitContents;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public List<AttachImageVO> getImageList() {
		return imageList;
	}

	public void setImageList(List<AttachImageVO> imageList) {
		this.imageList = imageList;
	}

	@Override
	public String toString() {
		return "mealkitVO [mealkitId=" + mealkitId + ", mealkitName=" + mealkitName + ", authorId=" + authorId + ", authorName="
				+ authorName + ", publeYear=" + publeYear + ", publisher=" + publisher + ", cateCode=" + cateCode
				+ ", cateName=" + cateName + ", mealkitPrice=" + mealkitPrice + ", mealkitStock=" + mealkitStock + ", mealkitDiscount="
				+ mealkitDiscount + ", mealkitIntro=" + mealkitIntro + ", mealkitContents=" + mealkitContents + ", regDate=" + regDate
				+ ", updateDate=" + updateDate + ", imageList=" + imageList + "]";
	}

}
