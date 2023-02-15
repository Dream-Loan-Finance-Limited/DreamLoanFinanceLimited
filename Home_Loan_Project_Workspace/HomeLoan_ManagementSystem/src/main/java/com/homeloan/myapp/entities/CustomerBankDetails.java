package com.homeloan.myapp.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerBankId;
	
	private Long customerAccountNumber;
	private String accountHolderName;
	private String bankName;
	private String accountType;
	private String ifscCode;
	private String branchName;

	
}
