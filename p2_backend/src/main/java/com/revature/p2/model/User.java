package com.revature.p2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "users")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usersid")
	private int id;
	@Column(name = "usersusername")
	private String username;
	@Column(name = "userspassword")
	private String password;
	@Column(name = "usersfirstname")
	private String firstname;
	@Column(name = "userslastname")
	private String lastname;
	@Column(name = "usersemail")
	private String email;
	@Column(name = "usersmobile")
	private long mobile;
	@SuppressWarnings("unused")
	private enum type {
		Checkings , Savings }

	
}
