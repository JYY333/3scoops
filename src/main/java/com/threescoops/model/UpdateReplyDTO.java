package com.threescoops.model;

public class UpdateReplyDTO {

	private int mealkitId;
	
	private double ratingAvg;

	public int getmealkitId() {
		return mealkitId;
	}

	public void setmealkitId(int mealkitId) {
		this.mealkitId = mealkitId;
	}

	public double getRatingAvg() {
		return ratingAvg;
	}

	public void setRatingAvg(double ratingAvg) {
		this.ratingAvg = ratingAvg;
	}

	@Override
	public String toString() {
		return "UpdateReplyDTO [mealkitId=" + mealkitId + ", ratingAvg=" + ratingAvg + "]";
	}
	
	
	
}
