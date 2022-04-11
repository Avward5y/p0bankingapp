package com.revature.p2.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "transactions")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Transaction implements Serializable {

	private static final long serialVersionUID = -1641359061244847455L;
	
	public static enum TransactionType {
		DEPOSIT, WITHDRAWAL, TRANSFER
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="transid")
	private Integer transId;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ownerid")
	private User ownerId;
	@Column(name="transactionsfromaccountid")
	private String fromAccountId;
	@Column(name="transactionstoaccountid")
	private String toAccountId;
	@Column(name="transactionsamount")
	private Double amount;
	@Column(name="transactionstype")
	private TransactionType type;
	@Column(name="transactionstimestamp")
	private LocalDateTime timestamp;

	@Column(name="transactionstimestamp", nullable=false,updatable=false,insertable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	Date transactionTimestamp;


}
