package com.Apple.springproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apple.springproject.model.User;
import com.Apple.springproject.repository.UserRepository;
import com.Apple.springproject.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void userSignup(User user) {
		userRepo.save(user);
		
	}
	
	@Override
	public User userLogin(String un, String psw) {
		
		return userRepo.findByUsernameAndPassword(un, psw);
	}
	
		
	

}
