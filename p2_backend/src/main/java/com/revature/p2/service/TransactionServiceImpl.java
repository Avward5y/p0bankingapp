package com.revature.p2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.revature.p2.model.Transaction;
import com.revature.p2.repo.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public List<Transaction> viewTransactions(int ownerId) {
		// TODO Auto-generated method stub
		return transactionRepository.findByOwnerId(ownerId);
	}

	@Override
	public List<Transaction> findById(int transId) {
		// TODO Auto-generated method stub
		return transactionRepository.findById(transId);
	}

	
}
