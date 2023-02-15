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
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer enquiryId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String panNumber;
	private String emailId;
	private Long contactNumber;
	private Integer age;
	private String gender;
	private String city;
	private String enquiryStatus;
	private Double requiredLoanAmount;
	private Double annualIncome;
}
