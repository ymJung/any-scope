/**
 * 
 */
package com.metalbird.controller.model;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.metalbird.dao.model.BoardImage;

/**
 * @author YoungMin
 *
 */
@JsonIgnoreProperties("board")
public class BoardImageDto extends BoardImage {
	public BoardImageDto() {
	}

	public BoardImageDto(BoardImage boardImage) {
		BeanUtils.copyProperties(boardImage, this, "board");
	}
}
