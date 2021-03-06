/**
 * 
 */
package com.metalbird.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.metalbird.controller.model.BoardDto;
import com.metalbird.controller.model.BoardCommentDto;
import com.metalbird.service.BoardService;

import javassist.NotFoundException;

/**
 * @author YoungMin
 *
 */
@RestController
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/board/view", method=RequestMethod.GET)
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView("open/view");
		mav.addObject("message", "hello ^^");
		mav.addObject("time", new Date());
		return mav;
	}
	@RequestMapping(value="/board/{id}", method=RequestMethod.GET)
	public BoardDto board(@PathVariable long id) {
		try {
			return boardService.getById(id);		
		} catch (NotFoundException e) {
			return new BoardDto();
		}
	}
	@RequestMapping(value="/board/comment/{boardId}", method=RequestMethod.GET)
	public List<BoardCommentDto> commentList(@PathVariable long boardId) {
		try {
			return boardService.getBoardCommentByBoardId(boardId);	
		} catch (NotFoundException e) {
			return new ArrayList<>();
		}
	}
}
