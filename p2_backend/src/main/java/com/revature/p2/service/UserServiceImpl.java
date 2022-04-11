package com.revature.p2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p2.model.User;
import com.revature.p2.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUsernameAndPassword(username, password);
	}

	@Override
	public User userLogout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User viewUser(String User) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUsername(User);
	}

	@Override
	public User updateUser(int id, User users) {
		// TODO Auto-generated method stub
		return userRepository.save(users);
	}

}
