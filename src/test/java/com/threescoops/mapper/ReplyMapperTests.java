package com.threescoops.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.threescoops.mapper.ReplyMapper;
import com.threescoops.model.ReplyDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ReplyMapperTests {
	
	@Autowired
	private ReplyMapper mapper;

	
	@Test
	public void replyEnrollTest() {
		
		String id = "admin";
		int mealkitId = 95;
		double rating = 3.5;
		String content = "댓글 테스트";
		
		ReplyDTO dto = new ReplyDTO();
		dto.setmealkitId(mealkitId);
		dto.setMemberId(id);
		dto.setRating(rating);
		dto.setContent(content);
		
		mapper.enrollReply(dto);
		
		
	}
	
	
}
