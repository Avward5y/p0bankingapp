package com.revature.p2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p2.model.Account;
import com.revature.p2.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public Account findById(Integer accountId) {
		// TODO Auto-generated method stub
		return accountRepository.findByAccountId(accountId);
	}

	@Override
	public List<Account> findByOwnerId(Integer ownerId) {
		// TODO Auto-generated method stub
		return accountRepository.findByOwnerId(ownerId);
	}
	
	@Override
	public Account openAccount(Account newAccount) {
		return accountRepository.save(newAccount);
	}

	@Override
	public Account withdraw(Integer accountId, Double balance, Double withdrawAmount) {
		Account account = null;
		account = findById(accountId);
		if (account != null) {
			account.setBalance(balance - withdrawAmount);
			accountRepository.save(account);
		}
		return account;
	}

	@Override
	public Account deposit(Integer accountId, Double balance, Double depositAmount) {
		Account account = null;
		account = findById(accountId);
		if (account != null) {
			account.setBalance(balance + depositAmount);
			accountRepository.save(account);
		}
		return account;
	}

	@Override
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
	
	@Override
	public Account saveAccount(Account account) {
		// TODO Auto-generated method stub
	return account;
	} 
	
}
