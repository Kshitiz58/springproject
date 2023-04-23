package com.Apple.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Apple.springproject.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsernameAndPassword(String un, String psw);
	
}
