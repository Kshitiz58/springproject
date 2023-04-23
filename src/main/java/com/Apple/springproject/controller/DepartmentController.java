package com.Apple.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Apple.springproject.model.Department;
import com.Apple.springproject.service.DepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@GetMapping("/department")
	public String getDept() {
		return "AddDepartment";
	}
	
	@PostMapping("/department")
	public String postDept(@ModelAttribute Department dept) {
		service.addDept(dept);
		return "AddDepartment";
	}
	
	@GetMapping("/deptlist")
	public String showTable(Model model) {
		model.addAttribute("dlist",service.getDepartments());
		return "ListDepartment";
	}
	
	@GetMapping("/edit")
	public String editDept(@RequestParam int id, Model model) {
		model.addAttribute("dptmodel", service.getDeptById(id));
		return "EditDepartment";
	}
	
	@PostMapping("/update")
	public String updateDept(@ModelAttribute Department dept) {
		service.addDept(dept);
		return "redirect:/deptlist";
	}
}
