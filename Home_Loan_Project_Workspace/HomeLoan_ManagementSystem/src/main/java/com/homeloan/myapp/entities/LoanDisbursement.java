package com.homeloan.myapp.entities;

import java.util.Date;

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
public class LoanDisbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loanId;
	
	private Long loanAccountNumber;
	private String loanApplicantName;
	private Double totalDisbursementAmount;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyDealer propertyDealerDetails;
	
}
