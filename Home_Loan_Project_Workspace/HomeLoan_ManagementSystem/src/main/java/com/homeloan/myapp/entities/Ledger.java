package com.homeloan.myapp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ledger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ledgerId;
	
	@CreationTimestamp
	private Date ledgerCreatedDate;
	@UpdateTimestamp
	private Date ledgerUpdatedDate;
	private Double totalSanctionedLoanAmount;
	private Double disbursementAmount;
	private Double remainingAmount;
	private Integer tenure;
	private Double monthlyEmi;
	private Integer defaultEmiCount;
	private String loanStatus;
	
	//private List<Installments> installments;
}
