package com.lotusmind.edu.build.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="user_account")
public class UserAccount {
	
	@Id
	private int login_u_seq_id;
	private int user_id;
	private int role_id;
	private int org_id;
	private String user_fname;
	private String user_lname;
	private Date user_dob;
	private String gender;
	private String email;
	private String role_name;
	private String org_name;
	private String org_display_name;
	private String city;
	private String county;
	private String country;
	private String state;
	private String postal_code;
	private int mobile;
	
	public int getLogin_u_seq_id() {
		return login_u_seq_id;
	}
	public void setLogin_u_seq_id(int login_u_seq_id) {
		this.login_u_seq_id = login_u_seq_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
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
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getOrg_display_name() {
		return org_display_name;
	}
	public void setOrg_display_name(String org_display_name) {
		this.org_display_name = org_display_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	

}
