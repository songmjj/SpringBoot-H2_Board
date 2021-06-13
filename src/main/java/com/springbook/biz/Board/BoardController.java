package com.springbook.biz.Board;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("board")
public class BoardController {
	@Autowired
	private BoardService boardService;


	@RequestMapping(value="/insertBoard.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String insertBoard(BoardVO vo) throws IOException {
		
		boardService.insertBoard(vo);
		return "getBoardList.do";
	}

	
	
	@RequestMapping(value="/updateBoard.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}

	
	@RequestMapping(value="/deleteBoard.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}

	
	@RequestMapping(value="/getBoard.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo)); 
		return "getBoard.jsp"; 
	}

	
	@RequestMapping(value="/getBoardList.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String getBoardList(BoardVO vo, Model model) {
		
		model.addAttribute("boardList", boardService.getBoardList(vo));
		return "getBoardList.jsp"; 
	}
}
