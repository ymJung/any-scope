package com.metalbird.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * board info.
 * @author YoungMin
 *
 */
@Entity(name="board")
@Table(name="board", schema="info")
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;
	@Column
	private String title;
	@Column
	private String content;
	@Column
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	@Column
	@Temporal(TemporalType.DATE)
	private Date modifiedAt;
	
	
	@Column(insertable=false, updatable=false)
	private long createdId;
	@Column(nullable = false)
	private long modifiedId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="createdId")
	private UserAccount userAccount;
	
	@OneToMany(mappedBy="board", fetch=FetchType.LAZY)
	private List<BoardComment> boardCommentList = new ArrayList<>();
	@OneToMany(mappedBy="board", fetch=FetchType.LAZY)
	private List<BoardImage> boardImageList = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCreatedId() {
		return createdId;
	}

	public void setCreatedId(long createdId) {
		this.createdId = createdId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public long getModifiedId() {
		return modifiedId;
	}

	public void setModifiedId(long modifiedId) {
		this.modifiedId = modifiedId;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public List<BoardComment> getBoardCommentList() {
		return boardCommentList;
	}

	public void setBoardCommentList(List<BoardComment> boardCommentList) {
		this.boardCommentList = boardCommentList;
	}

	public List<BoardImage> getBoardImageList() {
		return boardImageList;
	}

	public void setBoardImageList(List<BoardImage> boardImageList) {
		this.boardImageList = boardImageList;
	}
	
}
