package com.threescoops.service;

import java.util.List;

import com.threescoops.model.AttachImageVO;

public interface AttachService {
	
	/* 이미지 데이터 반환 */
	public List<AttachImageVO> getAttachList(int mealkitId);	

}
