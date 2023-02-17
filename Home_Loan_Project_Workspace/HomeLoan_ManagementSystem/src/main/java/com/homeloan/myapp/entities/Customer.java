package com.homeloan.myapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
		  
	private String customerFirstName;
	private String customerMiddleName;
	private String customerLastName;
	private Long customerContactNumber;
	private String customerPanNumber;
	private String customerEmailId;
	private Integer customerAge;
	private String customerGender;
	

	  @OneToOne(cascade = CascadeType.ALL) 
	  private CustomerAddress customerAddress;
	  
	  @OneToOne(cascade = CascadeType.ALL) 
	  private CustomerBankDetails customerBankDetails;
	  
	 
	  @OneToOne(cascade = CascadeType.ALL) 
	  private Documents documents;
	  
	  @OneToOne(cascade = CascadeType.ALL) 
	  private GaurantorDetails gaurantorDetails;
//	  
	  @OneToOne(cascade = CascadeType.ALL) 
	  private LoanDisbursement loanDisbursement;
//	  
	  @OneToOne(cascade = CascadeType.ALL) 
	  private Ledger ledger;
//	  
	  @OneToOne(cascade = CascadeType.ALL) 
	  private SanctionLetter sanctionLetter;
	 
}
