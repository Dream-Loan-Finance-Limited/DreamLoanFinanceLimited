package com.homeloan.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
