package com.revature.p2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public User getUserByUsernameAndPassword(String username, String password);
	
	public User getUserByUsername(String username);

	public User save(User users);
	
}
