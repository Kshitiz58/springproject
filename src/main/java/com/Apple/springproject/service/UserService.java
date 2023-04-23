package com.Apple.springproject.service;

import com.Apple.springproject.model.User;

public interface UserService {
	
	void userSignup(User user);
	
	User userLogin(String un, String psw);
}
