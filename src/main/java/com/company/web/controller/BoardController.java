package com.company.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.web.domain.BoardVO;

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
		return "board/board_register";
	}
	
	//게시물 등록
	@RequestMapping(value = {"/board/register"}, method = RequestMethod.POST)
	public String register(@ModelAttribute BoardVO vo) throws Exception {
		
	}
	
}
