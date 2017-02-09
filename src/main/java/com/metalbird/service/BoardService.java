package com.metalbird.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.metalbird.controller.model.BoardCommentDto;
import com.metalbird.controller.model.BoardDto;
import com.metalbird.dao.BoardCommentRepository;
import com.metalbird.dao.BoardRepository;
import com.metalbird.dao.model.Board;
import com.metalbird.dao.model.BoardComment;

import javassist.NotFoundException;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	@Autowired
	private BoardCommentRepository boardCommentRepository;

	@Transactional
	public BoardDto getById(long id) throws NotFoundException {
		Board board = boardRepository.findOneById(id);
		if (board == null) {
			throw new NotFoundException("invalid board id");
		}
		return new BoardDto(board);
	}
	
	@Transactional
	public List<BoardCommentDto> getBoardCommentByBoardId(long boardId) throws NotFoundException {
		List<BoardComment> list = boardCommentRepository.findAllByBoardId(boardId);
		if (CollectionUtils.isEmpty(list)) {
			throw new NotFoundException("invalid board id");
		}
		List<BoardCommentDto> dtos = list.stream()
				.map(each -> new BoardCommentDto(each)).collect(Collectors.toList());
		return dtos;
	}
}
