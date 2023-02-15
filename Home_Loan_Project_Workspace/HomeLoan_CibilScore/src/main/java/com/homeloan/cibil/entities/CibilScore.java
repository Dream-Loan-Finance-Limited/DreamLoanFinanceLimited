package com.homeloan.cibil.entities;

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
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CibilScore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cibilScoreId;
	
	private String firstName;
	private String lastName;
	private String panNumber;
	private Integer cibilScore;
	private String status;

	@CreationTimestamp
	private Date cibilScoreCreatedOnDate;
	@UpdateTimestamp
	private Date cibilScoreUpdatedOnDate;

}
