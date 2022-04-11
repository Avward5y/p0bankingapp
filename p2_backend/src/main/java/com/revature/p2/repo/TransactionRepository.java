package com.revature.p2.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

	public List<Transaction> findById(int accountsId);
	
	public List<Transaction> findByOwnerId(int ownerId);
	
}
