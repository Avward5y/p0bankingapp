package com.revature.p2.service;

import org.springframework.stereotype.Service;

import com.revature.p2.model.User;

@Service
public interface UserService {
	
	public User userLogin(String username, String password);
	
	public User userLogout();
	
	public User viewUser (String User);
	
	public User updateUser(int id, User users);

}
