package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Transaction;
import com.revature.p2.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;

	@GetMapping("/transactions")
	public List<Transaction> viewTransactions(int transOwnerId) {
		// TODO Auto-generated method stub
		return transactionService.viewTransactions(transOwnerId);
	}
	@GetMapping("/transactions/{transId}")
	public List<Transaction> findById(int transId) {
		// TODO Auto-generated method stub
		return transactionService.findById(transId);
	}
}
