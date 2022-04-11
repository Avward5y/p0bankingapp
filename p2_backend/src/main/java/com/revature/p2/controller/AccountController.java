package com.revature.p2.controller;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Account;
import com.revature.p2.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@GetMapping("/{ownerId}/accounts/{accountId}")
	public Account findById(Integer accountId) {
		// TODO Auto-generated method stub
		return accountService.findById(accountId);
	}

	@GetMapping("/{ownerId}/accounts")
	public List<Account> findByOwnerId(Integer ownerId) {
		// TODO Auto-generated method stub
		return accountService.findByOwnerId(ownerId);
	}

	@PutMapping("/accounts/withdraw")
	public Account withdraw(Integer accountId, Double balance, Double withdrawAmount) {
		Account account = null;
		account = findById(accountId);
		if (account != null) {
			account.setBalance(balance - withdrawAmount);
			accountService.saveAccount(account);
		}
		return account;
	}

	@PutMapping("/accounts/deposit")
	public Account deposit(Integer accountId, Double balance, Double depositAmount) {
		Account account = null;
		account = findById(accountId);
		if (account != null) {
			account.setBalance(balance + depositAmount);
			accountService.saveAccount(account);
		}
		return account;
	}

	@PutMapping("/accounts/transfer")
	public Account transfer(Integer accountId, Integer receivingActId, Double balance, Double transferAmount) {
		Account sendingAccount = null;
		Account receivingAccount = null;
		sendingAccount = findById(accountId);
		receivingAccount = findById(receivingActId);
		if(sendingAccount != null || receivingAccount != null) {
			sendingAccount.setBalance(balance - transferAmount);
			receivingAccount.setBalance(balance + transferAmount);
		}
	 return null;
	}
	
	@PostMapping("/accounts/new")
	public Account openAccount(Account newAccount) {
		return accountService.saveAccount(newAccount);
	}
	
	@PutMapping("/accounts")
	public void saveAccount(Account account) {
		// TODO Auto-generated method stub
	}

}
