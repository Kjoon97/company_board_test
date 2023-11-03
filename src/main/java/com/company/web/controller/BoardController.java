package com.company.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	//게시물 목록
	@RequestMapping(value = {"/board"}, method= RequestMethod.GET)
	public String getBoardPage() throws Exception {
		
		
		return "board/board_list";
	}
	
	//게시물 등록
	@RequestMapping(value = {"/board/register"}, method = RequestMethod.GET)
	public String registerBoard() throws Exception {
		return "board/board_regsiter";
	}
	
}
