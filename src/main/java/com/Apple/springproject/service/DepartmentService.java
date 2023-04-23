package com.Apple.springproject.service;

import java.util.List;

import com.Apple.springproject.model.Department;

public interface DepartmentService {
	void addDept(Department department);
	
	List<Department> getDepartments();
	
	Department getDeptById(int id);
}