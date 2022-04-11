package com.revature.p2.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	public Account findByAccountId(Integer accountId);
	
	public List<Account> findByOwnerId(Integer ownerId);
	
}
