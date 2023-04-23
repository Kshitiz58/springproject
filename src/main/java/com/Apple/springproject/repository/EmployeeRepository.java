package com.Apple.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Apple.springproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
}
