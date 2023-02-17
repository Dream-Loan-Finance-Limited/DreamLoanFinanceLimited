package com.homeloan.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//to be modified
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmailAttach {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emailId;
	
	private String toEmail;
    private String fromEmail;
    private String subject;
    private String text;
    @Lob
    private String attachment;
    
}
