package com.test.biz;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.stumanagement.biz.StudentBiz;
import com.stumanagement.entity.PageResult;
import com.stumanagement.entity.Student;

import util.SpringTool;

class test {

	@Test
	void test() {
		StudentBiz biz = (StudentBiz)SpringTool.getBean(StudentBiz.class);
		PageResult<Student> page =new PageResult<Student>();
		page.setRowCount(biz.getCount());
		page.setPageSize(3);
		List<Student> list = biz.getAll(page);
		for (Student student : list) {
			System.out.println(student.getSname());
		}
	}

}
