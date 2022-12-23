package com.threescoops.model;

import java.util.List;

public class SelectDTO {
	
	/* 상품 id */
	private int mealkitId;
	
	/* 상품 이름 */
	private String mealkitName;
	
	/* 카테고리 이름 */
	private String cateName;
	
	private double ratingAvg;	
	
	/* 상품 이미지 */
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

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public double getRatingAvg() {
		return ratingAvg;
	}

	public void setRatingAvg(double ratingAvg) {
		this.ratingAvg = ratingAvg;
	}

	public List<AttachImageVO> getImageList() {
		return imageList;
	}

	public void setImageList(List<AttachImageVO> imageList) {
		this.imageList = imageList;
	}

	@Override
	public String toString() {
		return "SelectDTO [mealkitId=" + mealkitId + ", mealkitName=" + mealkitName + ", cateName=" + cateName + ", ratingAvg="
				+ ratingAvg + ", imageList=" + imageList + "]";
	}
	
	
	
}
