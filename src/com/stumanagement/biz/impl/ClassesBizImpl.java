package com.stumanagement.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stumanagement.biz.ClassesBiz;
import com.stumanagement.dao.ClassesDao;
import com.stumanagement.entity.Classes;
@Transactional
@Service
public class ClassesBizImpl implements ClassesBiz{
	@Resource
	private ClassesDao dao;
	
	@Override
	public List<Classes> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	
}
