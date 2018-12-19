package com.stumanagement.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Student {
	//id,snamesname,birthday,gender,telephone,email,classid
	private Integer id;
	private String sname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date birthday;
	
	private String gender;
	private String telephone;
	private String email;
	
	private Classes classid = new Classes();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Classes getClassid() {
		return classid;
	}

	public void setClassid(Classes classid) {
		this.classid = classid;
	}

	
	
}
