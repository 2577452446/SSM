package com.stumanagement.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stumanagement.entity.PageResult;
import com.stumanagement.entity.Student;

public interface StudentDao {
	public List<Student> getAll(@Param("page")PageResult<Student> page);
	
	public int getCount();
	
	public Student beforeUpdate(@Param("id")int id);
	
	public int Update(@Param("stu")Student stu);
}
