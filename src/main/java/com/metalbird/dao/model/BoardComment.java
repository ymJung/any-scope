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
@Entity(name = "board_comment")
@Table(name = "board_comment", schema = "info")
public class BoardComment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;
	@Column(insertable=false, updatable=false)
	private long boardId;
	@Column
	private String ipAddress;
	@Column
	private String content;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	@Column
	@Temporal(TemporalType.DATE)
	private Date modifiedAt;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="boardId")
	private Board board;


	public long getBoardId() {
		return boardId;
	}


	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}


	public String getIpAddress() {
		return ipAddress;
	}


	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
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


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	
}
