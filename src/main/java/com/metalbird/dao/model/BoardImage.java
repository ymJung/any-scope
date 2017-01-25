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
	private String src;
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
}
