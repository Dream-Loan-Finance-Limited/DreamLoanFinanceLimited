package com.homeloan.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//to be finalized
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Installments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer installmentId;
	
	
	
}
