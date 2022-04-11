package com.revature.p2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.User;
import com.revature.p2.repo.UserRepository;
import com.revature.p2.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public User userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return userService.userLogin(username, password);
	}
	@GetMapping("/user")
	public User userLogout() {
		// TODO Auto-generated method stub
		return new User();
	}
	@GetMapping("/profile/{username}")
	public User viewUser(String User) {
		// TODO Auto-generated method stub
		return userService.viewUser(User);
	}
	@PutMapping("/profile/{username}")
	public User updateUser(int id, User users) {
		// TODO Auto-generated method stub
		return userService.updateUser(id, users);
	}

}
