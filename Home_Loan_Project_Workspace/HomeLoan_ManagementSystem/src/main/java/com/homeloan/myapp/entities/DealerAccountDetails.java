package com.homeloan.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DealerAccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dealerAccountId;
	
	private String dealerAccountHolderName;
	private Long dealerAccountNumber;
	private String dealerBankName;
	private String dealerBranchName;
	private String dealerBankIfscCode;
	private String dealerAccountType;
	
}
