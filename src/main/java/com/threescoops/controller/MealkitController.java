package com.threescoops.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.threescoops.model.AttachImageVO;
import com.threescoops.model.MealkitVO;
import com.threescoops.model.Criteria;
import com.threescoops.model.PageDTO;
import com.threescoops.model.ReplyDTO;
import com.threescoops.service.AttachService;
import com.threescoops.service.MealkitService;
import com.threescoops.service.ReplyService;

@Controller
public class MealkitController {

	private static final Logger logger = LoggerFactory.getLogger(MealkitController.class);
			
	@Autowired
	private AttachService attachService;
	
	@Autowired
	private MealkitService mealkitService;
	
	@Autowired
	private ReplyService replyService;	
	
	//메인 페이지 이동
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public void mainPageGET(Model model) {
		
		logger.info("메인 페이지 진입");
		
		model.addAttribute("cate1", mealkitService.getCateCode1());
		model.addAttribute("cate2", mealkitService.getCateCode2());
		model.addAttribute("ls", mealkitService.likeSelect());		
		
	}
	
	
	/* 이미지 출력 */
	@GetMapping("/display")
	public ResponseEntity<byte[]> getImage(String fileName){
		
		logger.info("getImage()........" + fileName);
		
		File file = new File("c:\\upload\\" + fileName);
		
		ResponseEntity<byte[]> result = null;
		
		try {
			
			HttpHeaders header = new HttpHeaders();
			
			header.add("Content-type", Files.probeContentType(file.toPath()));
			
			result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file), header, HttpStatus.OK);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	
	/* 이미지 정보 반환 */
	@GetMapping(value="/getAttachList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<AttachImageVO>> getAttachList(int mealkitId){
		
		logger.info("getAttachList.........." + mealkitId);
		
		return new ResponseEntity<List<AttachImageVO>>(attachService.getAttachList(mealkitId), HttpStatus.OK);
		
	}
	
	/* 상품 검색 */
	@GetMapping("/search")
	public String searchGoodsGET(Criteria cri, Model model) {
		
		logger.info("cri : " + cri);
		
		List<MealkitVO> list = mealkitService.getGoodsList(cri);
		logger.info("pre list : " + list);
		if(!list.isEmpty()) {
			model.addAttribute("list", list);
			logger.info("list : " + list);
		} else {
			model.addAttribute("listcheck", "empty");
			
			return "search";
		}
		
		model.addAttribute("pageMaker", new PageDTO(cri, mealkitService.goodsGetTotal(cri)));
		
		String[] typeArr = cri.getType().split("");
		
		for(String s : typeArr) {
			if(s.equals("T") || s.equals("A")) {
				model.addAttribute("filter_info", mealkitService.getCateInfoList(cri));		
			}
		}
		
		return "search";
		
	}	
	
	/* 상품 상세 */
	@GetMapping("/goodsDetail/{mealkitId}")
	public String goodsDetailGET(@PathVariable("mealkitId")int mealkitId, Model model) {
		
		logger.info("goodsDetailGET()..........");
		
		model.addAttribute("goodsInfo", mealkitService.getGoodsInfo(mealkitId));
		
		return "/goodsDetail";
	}	
	
	/* 리뷰 쓰기 */
	@GetMapping("/replyEnroll/{memberId}")
	public String replyEnrollWindowGET(@PathVariable("memberId")String memberId, int mealkitId, Model model) {
		MealkitVO mealkit = mealkitService.getmealkitIdName(mealkitId);
		model.addAttribute("mealkitInfo", mealkit);
		model.addAttribute("memberId", memberId);
		
		return "/replyEnroll";
	}	
	
	/* 리뷰 수정 팝업창 */
	@GetMapping("/replyUpdate")
	public String replyUpdateWindowGET(ReplyDTO dto, Model model) {
		MealkitVO mealkit = mealkitService.getmealkitIdName(dto.getmealkitId());
		model.addAttribute("mealkitInfo", mealkit);
		model.addAttribute("replyInfo", replyService.getUpdateReply(dto.getReplyId()));
		model.addAttribute("memberId", dto.getMemberId());
		
		return "/replyUpdate";
	}		
	
	
	
}
