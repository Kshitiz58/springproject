package com.Apple.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.Apple.springproject.model.Employee;
import com.Apple.springproject.service.DepartmentService;
import com.Apple.springproject.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private DepartmentService service;
	
	
	@GetMapping("/employee")
	public String getEmployee(Model model) {
		model.addAttribute("deptList", service.getDepartments());
		
		return "AddEmployee";
	}
	
	
	
	@PostMapping("/employee")
	public String postEmployee(@ModelAttribute Employee employee) {
		
		empService.addEmp(employee);
		
		return "redirect:/employee";
	}
	
	@GetMapping("/emplist")
	public String showEmployee(Model model) {
		model.addAttribute("elist", empService.getAllEmp());
		return "ListEmployee";
	}
	
	@GetMapping("/editEmp")
	public String editEmp(@RequestParam long id, Model model) {
		model.addAttribute("empmodel", empService.getEmpById(id));
		return "EditEmployee";
	}
	
	@PostMapping("/updateEmp")
	public String updateEmp(@ModelAttribute Employee employee) {
		empService.addEmp(employee);
		return "redirect:/emplist";
	}
	
	@GetMapping("/deleteEmp")
	public String deleteEmp(@RequestParam Long id) {
		empService.deleteEmp(id);
		return "redirect:/emplist";
	}
	
	
}

