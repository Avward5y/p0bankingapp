package com.revature.p2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.p2.model.Transaction;

@Service
public interface TransactionService {

	public List<Transaction> viewTransactions(int ownerId);
	
	public List<Transaction> findById(int transId);
	
}
