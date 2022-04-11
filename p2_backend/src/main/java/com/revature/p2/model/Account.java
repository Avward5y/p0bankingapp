package com.revature.p2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name= "accounts")
@Data
public class Account {
	
	public static enum AccountType {
		CHECKING, SAVINGS
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="accounts_Id")
	private Integer accountId;
	@Column(name="accountsowner_Id")
	private Integer ownerId;
	@Column(name="accountsbalance")
	private Double balance;
	@Column(name="accountstype")
	private AccountType type;
	@Column(name="accountsapproved")
	private boolean approved;

	

}
