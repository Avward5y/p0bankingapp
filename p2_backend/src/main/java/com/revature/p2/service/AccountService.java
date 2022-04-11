package com.revature.p2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.p2.model.Account;

@Service
public interface AccountService {

	public Account findById(Integer accountId);
	
	public List<Account> findByOwnerId(Integer ownerId);
	
	public Account openAccount(Account newAccount);
	
	public Account withdraw(Integer accountId, Double balance, Double withdrawAmount);
	
	public Account deposit(Integer accountId, Double balance, Double depositAmount);
	
	public Account transfer(Integer accountId, Integer receivingActId, Double balance, Double transferAmount);
	
	public Account saveAccount(Account account);
	
}
