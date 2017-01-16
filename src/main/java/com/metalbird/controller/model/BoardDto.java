package com.metalbird.controller.model;

import org.springframework.beans.BeanUtils;

import com.metalbird.dao.model.Board;

public class BoardDto extends Board {
	public BoardDto() {}
	public BoardDto(Board board) {
		BeanUtils.copyProperties(board, this, "userAccount");
	}
}
