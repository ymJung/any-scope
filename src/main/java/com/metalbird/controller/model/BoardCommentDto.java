/**
 * 
 */
package com.metalbird.controller.model;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.metalbird.dao.model.BoardComment;

/**
 * @author YoungMin
 *
 */
@JsonIgnoreProperties("board")
public class BoardCommentDto extends BoardComment {
	public BoardCommentDto(){}
	public BoardCommentDto(BoardComment boardComment) {
		BeanUtils.copyProperties(boardComment, this, "board");
	}

}
