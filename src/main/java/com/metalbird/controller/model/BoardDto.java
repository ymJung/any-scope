package com.metalbird.controller.model;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.metalbird.dao.model.Board;

@JsonIgnoreProperties("userAccount")
public class BoardDto extends Board {
	public BoardDto() {}
	public BoardDto(Board board) {
		BeanUtils.copyProperties(board, this, "userAccount");
	}
	public String getBody() {
		return getContent();
	}
	public Long getUserId() {
		return getCreatedId();
	}
}
