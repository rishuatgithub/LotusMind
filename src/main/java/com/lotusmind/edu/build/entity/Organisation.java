package com.lotusmind.edu.build.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="organisation")
public class Organisation {
	
	@Id
	private int org_id;
	private String org_name;
	private String org_display_name;
	private String address_l1;
	private String address_l2;
	private String city;
	private String county;
	private String state;
	private String country;
	private String postal_code;
	private int mobile;
	private int social_id;
	private Date created_on;
	private Date last_modified_on;
	
	
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
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
	public String getAddress_l1() {
		return address_l1;
	}
	public void setAddress_l1(String address_l1) {
		this.address_l1 = address_l1;
	}
	public String getAddress_l2() {
		return address_l2;
	}
	public void setAddress_l2(String address_l2) {
		this.address_l2 = address_l2;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public int getSocial_id() {
		return social_id;
	}
	public void setSocial_id(int social_id) {
		this.social_id = social_id;
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
