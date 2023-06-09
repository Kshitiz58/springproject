package com.Apple.springproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apple.springproject.model.Employee;
import com.Apple.springproject.repository.EmployeeRepository;
import com.Apple.springproject.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public void addEmp(Employee employee) {
		 empRepo.save(employee);
		
	}

	@Override
	public void deleteEmp(Long id) {
		empRepo.deleteById(id);
	}

	@Override
	public void updateEmp(Employee employee) {
		empRepo.save(employee);
	}

	@Override
	public Employee getEmpById(Long id) {
		 
		return empRepo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmp() {
	 
		return empRepo.findAll();
	}

}
