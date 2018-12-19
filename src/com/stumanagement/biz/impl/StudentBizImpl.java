package com.stumanagement.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stumanagement.biz.StudentBiz;
import com.stumanagement.dao.ClassesDao;
import com.stumanagement.dao.StudentDao;
import com.stumanagement.entity.PageResult;
import com.stumanagement.entity.Student;
@Transactional
@Service
public class StudentBizImpl implements StudentBiz{
	@Resource
	private ClassesDao cdao;
	@Resource
	private StudentDao sdao;
	
	
	@Override
	public List<Student> getAll(PageResult<Student> page) {
		// TODO Auto-generated method stub
		return sdao.getAll(page);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return sdao.getCount();
	}
	@Override
	public Student beforeUpdate(int id) {
		// TODO Auto-generated method stub
		return sdao.beforeUpdate(id);
	}
	@Override
	public int Update(Student stu) {
		// TODO Auto-generated method stub
		return sdao.Update(stu);
	}
	
	
	
}
