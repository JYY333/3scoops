package com.threescoops.mapper;

import java.util.List;

import com.threescoops.model.AuthorVO;
import com.threescoops.model.Criteria;

public interface AuthorMapper {

	/* 소매자 등록 */
	public void authorEnroll(AuthorVO author);
	
	/* 소매자 목록 */
	public List<AuthorVO> authorGetList(Criteria cri);
	
	/* 소매자 총 수 */
	public int authorGetTotal(Criteria cri);
	
	/* 소매자 상세 */
	public AuthorVO authorGetDetail(int authorId);	
	
	/* 소매자 정보 수정 */
	public int authorModify(AuthorVO author);	
	
	/* 소매자 정보 삭제 */
	public int authorDelete(int authorId);	
	
}
