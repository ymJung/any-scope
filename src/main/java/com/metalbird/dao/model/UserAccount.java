/**
 * 
 */
package com.metalbird.dao.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author YoungMin
 * User information entity.
 */
@Entity(name="info")
@Table(name="user_account")
public class UserAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(unique=true)
	private String account;
	
	@Column
	private String password;
	
	@Column
	@Enumerated(EnumType.ORDINAL)
	private Live live;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Grade grade;
	
	@Column
	private String role;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date date;
	
	enum Grade {
		NORMAL, HEAVY, ADMIN
	}
	enum Live {
		NORMAL, DELETE
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Live getLive() {
		return live;
	}
	public void setLive(Live live) {
		this.live = live;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getId() {
		return id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}