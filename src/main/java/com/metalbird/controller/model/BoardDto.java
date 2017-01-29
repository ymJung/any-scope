package com.metalbird.controller.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.metalbird.dao.model.Board;

@JsonIgnoreProperties("userAccount")
public class BoardDto extends Board {
	private List<BoardCommentDto> boardCommentDtoList = new ArrayList<>();
	private List<BoardImageDto> boardImageDtoList = new ArrayList<>();
	public BoardDto() {}
	public BoardDto(Board board) {
		BeanUtils.copyProperties(board, this, "userAccount", "boardCommentList", "boardImageList");
		boardCommentDtoList = board.getBoardCommentList().stream().map(each -> new BoardCommentDto(each)).collect(Collectors.toList());
		boardImageDtoList = board.getBoardImageList().stream().map(each -> new BoardImageDto(each)).collect(Collectors.toList());
	}
	
	public List<BoardCommentDto> getBoardCommentDtoList() {
		return boardCommentDtoList;
	}
	public List<BoardImageDto> getBoardImageDtoList() {
		return boardImageDtoList;
	}
}
