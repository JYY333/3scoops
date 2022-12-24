package com.threescoops.service;

import java.util.List;

import com.threescoops.model.AuthorVO;
import com.threescoops.model.Criteria;

public interface AuthorService {

	/* 배송지 등록 */
	public void authorEnroll(AuthorVO author) throws Exception;
	
	/* 배송지 목록 */
	public List<AuthorVO> authorGetList(Criteria cri) throws Exception;
	
	/* 배송지 총 수 */
	public int authorGetTotal(Criteria cri) throws Exception;
	
	/* 배송지 상세 페이지 */
	public AuthorVO authorGetDetail(int authorId) throws Exception;	
	
	/* 배송지 정보 수정 */
	public int authorModify(AuthorVO author) throws Exception;		
	
	/* 배송지 정보 삭제 */
	public int authorDelete(int authorId);	
	
}
