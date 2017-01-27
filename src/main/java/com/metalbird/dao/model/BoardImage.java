/**
 * 
 */
package com.metalbird.dao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author YoungMin
 *
 */
@Entity(name = "board_image")
@Table(name = "board_image", schema = "info")
public class BoardImage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;
	@Column(insertable=false, updatable=false)
	private long boardId;
	@Column
	private String displayName;
	@Column
	private String hashValue;
	
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	@Column
	@Temporal(TemporalType.DATE)
	private Date modifiedAt;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="boardId")
	private Board board;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getBoardId() {
		return boardId;
	}


	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}


	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public String getHashValue() {
		return hashValue;
	}


	public void setHashValue(String hashValue) {
		this.hashValue = hashValue;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getModifiedAt() {
		return modifiedAt;
	}


	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}


	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}
	
}
