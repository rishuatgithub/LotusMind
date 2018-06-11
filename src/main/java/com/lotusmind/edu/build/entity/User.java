package com.lotusmind.edu.build.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="user_details")
public class User {
	
	@Id
	private int user_id;
	private String user_fname;
	private String user_lname;
	private Date user_dob;
	private String gender;
	private String email;
	private int role_id;
	private Date created_on;
	private Date last_modifed_on;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_fname() {
		return user_fname;
	}
	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}
	public String getUser_lname() {
		return user_lname;
	}
	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}
	public Date getUser_dob() {
		return user_dob;
	}
	public void setUser_dob(Date user_dob) {
		this.user_dob = user_dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Date getLast_modifed_on() {
		return last_modifed_on;
	}
	public void setLast_modifed_on(Date last_modifed_on) {
		this.last_modifed_on = last_modifed_on;
	}
	
	
	

}
