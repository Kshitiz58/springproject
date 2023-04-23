package com.Apple.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Apple.springproject.model.User;
import com.Apple.springproject.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService service;
		
	@GetMapping({"/","/login"})
	public String getLogin() {
		
		return "Login";
	}
	
	@PostMapping("/login")
	public String doLogin(@ModelAttribute User user , Model model) {
		User usr = service.userLogin(user.getUsername(), user.getPassword());
		
		
		if(usr != null) {
			model.addAttribute("uname", user.getUsername());
			return "Home";
		}
		model.addAttribute("error","User not Exist!!");
		return "Login";
	}
	
	@GetMapping({"/signup"})
	public String getSignup() {
		
		return "Signup";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user) {
		
		service.userSignup(user);
		
		return "Login";
	}
}
