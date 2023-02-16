package com.homeloan.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//to be updated
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleMail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer simpleMailId;
	
	public String toEmail;
	public String fromEmail;
	private String subject;
	private String text;
	
}
