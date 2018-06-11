package com.lotusmind.edu.build.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="mst_role")
public class Role {
	
	@Id
	private int role_id;
	private String role_name;
	private String role_descr;
	private String role_access_l1;
	private String role_access_l2;
	private Date created_on;
	private Date last_modified_on;
	
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_descr() {
		return role_descr;
	}
	public void setRole_descr(String role_descr) {
		this.role_descr = role_descr;
	}
	public String getRole_access_l1() {
		return role_access_l1;
	}
	public void setRole_access_l1(String role_access_l1) {
		this.role_access_l1 = role_access_l1;
	}
	public String getRole_access_l2() {
		return role_access_l2;
	}
	public void setRole_access_l2(String role_access_l2) {
		this.role_access_l2 = role_access_l2;
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
