package com.Apple.springproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apple.springproject.model.Department;
import com.Apple.springproject.repository.DepartmentRepository;
import com.Apple.springproject.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository deptRepo;
	
	@Override
	public void addDept(Department department) {
		deptRepo.save(department);
		
	}

	@Override
	public List<Department> getDepartments() {
		
		return deptRepo.findAll();
	}

	@Override
	public Department getDeptById(int id) {
		return deptRepo.findById(id).get();
		
	}

}
