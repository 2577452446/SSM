package com.stumanagement.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stumanagement.biz.ClassesBiz;
import com.stumanagement.biz.StudentBiz;
import com.stumanagement.entity.Classes;
import com.stumanagement.entity.PageResult;
import com.stumanagement.entity.Student;

@Controller
@RequestMapping("/stu")
public class StudentController {
	@Resource
	private ClassesBiz cbiz;
	@Resource
	private StudentBiz sbiz;
	
	@RequestMapping("/list")
	public String getAll(Model model) {
		PageResult<Student> page =new PageResult<Student>();
		page.setPageSize(3);
		page.setRowCount(sbiz.getCount());
		
		List<Student> list = sbiz.getAll(page);
		page.setData(list);
		model.addAttribute("pageResult", page);
		return "/list";
	}
	
	@RequestMapping("/page/{pageNo}")
	public String page(@PathVariable int pageNo,Model model) {
		/*System.out.println(pageNo);*/
		PageResult<Student> page =new PageResult<Student>();
		page.setPageSize(3);
		page.setRowCount(sbiz.getCount());
		page.setPageNo(pageNo);
		
		List<Student> list = sbiz.getAll(page);
		page.setData(list);
		model.addAttribute("pageResult", page);
		return "/list";
	}
	
	@RequestMapping("/beformUpdate")
	public String beformUpdate(int id,Model model) {
		Student stu = sbiz.beforeUpdate(id);
		model.addAttribute("stu",stu);
		List<Classes> list = cbiz.getAll();
		model.addAttribute("list",list);
		return "/update";
	}
	
	@RequestMapping("/update")
	public String update(Student stu,Model model) {
		sbiz.Update(stu);
		return "redirect:list.action";
	}
	
}
