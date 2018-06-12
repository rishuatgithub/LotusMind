package com.lotusmind.edu.build.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="login")
public class Login {
	
	@Id
	private int login_u_seq_id;
	private int org_id;
	private int user_id;
	private String login_u_password;	
	private Date created_on;
	private Date last_modified_on;
	
	
	public int getLogin_u_seq_id() {
		return login_u_seq_id;
	}
	public void setLogin_u_seq_id(int login_u_seq_id) {
		this.login_u_seq_id = login_u_seq_id;
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getLogin_u_password() {
		return login_u_password;
	}
	public void setLogin_u_password(String login_u_password) {
		this.login_u_password = login_u_password;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Date getLast_modified_on() {
		return last_modified_on;
	}
	public void setLast_modified_on(Date last_modified_on) {
		this.last_modified_on = last_modified_on;
	}
	
	

}
