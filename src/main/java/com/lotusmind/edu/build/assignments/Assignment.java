package com.lotusmind.edu.build.assignments;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="mst_assignment")
public class Assignment {

	@Column(nullable=false)
	private int org_id;
	@Column(nullable=false)
	private int a_term_id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false)
	private int a_assignment_id;
	private String assignment_name;
	private String display_name;
	private int a_class_id;
	private int a_subject_id;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date assignment_date = new Date();
	private Date due_date = new Date();
	private int hours_required;
	private boolean is_graded;
	private boolean is_gamified;
	private boolean is_active;
	private Date created_date = new Date();
	private String created_by;
	private Date modified_date = new Date();
	private String modified_by;

	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public int getA_term_id() {
		return a_term_id;
	}
	public void setA_term_id(int a_term_id) {
		this.a_term_id = a_term_id;
	}
	public int getA_assignment_id() {
		return a_assignment_id;
	}
	public void setA_assignment_id(int a_assignment_id) {
		this.a_assignment_id = a_assignment_id;
	}
	public String getAssignment_name() {
		return assignment_name;
	}
	public void setAssignment_name(String assignment_name) {
		this.assignment_name = assignment_name;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public int getA_class_id() {
		return a_class_id;
	}
	public void setA_class_id(int a_class_id) {
		this.a_class_id = a_class_id;
	}
	public int getA_subject_id() {
		return a_subject_id;
	}
	public void setA_subject_id(int a_subject_id) {
		this.a_subject_id = a_subject_id;
	}
	public Date getAssignment_date() {
		return assignment_date;
	}
	public void setAssignment_date(Date assignment_date) {
		this.assignment_date = assignment_date;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public int getHours_required() {
		return hours_required;
	}
	public void setHours_required(int hours_required) {
		this.hours_required = hours_required;
	}
	public boolean isIs_graded() {
		return is_graded;
	}
	public void setIs_graded(boolean is_graded) {
		this.is_graded = is_graded;
	}
	public boolean isIs_gamified() {
		return is_gamified;
	}
	public void setIs_gamified(boolean is_gamified) {
		this.is_gamified = is_gamified;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getModified_date() {
		return modified_date;
	}
	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}



}
