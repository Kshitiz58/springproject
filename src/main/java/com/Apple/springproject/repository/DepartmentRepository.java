package com.Apple.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Apple.springproject.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
}
