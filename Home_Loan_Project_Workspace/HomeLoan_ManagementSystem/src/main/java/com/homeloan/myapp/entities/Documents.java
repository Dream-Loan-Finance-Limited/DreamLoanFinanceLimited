package com.homeloan.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Documents {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer documentId;
	
	@Lob
	private byte[] panCard;
	@Lob
	private byte[] adharCard;
	@Lob
	private byte[] photo;
	@Lob
	private byte [] addressProof;
	@Lob
	private byte[] incomeProof;
	@Lob
	private byte[] bankPassBook;
}
