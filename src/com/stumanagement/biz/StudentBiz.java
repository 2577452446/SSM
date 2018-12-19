package com.stumanagement.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.stumanagement.entity.PageResult;
import com.stumanagement.entity.Student;

public interface StudentBiz {
	public List<Student> getAll(PageResult<Student> page);
	
	public int getCount();
	
	public Student beforeUpdate(int id);
	
	public int Update(@Param("stu")Student stu);
}
