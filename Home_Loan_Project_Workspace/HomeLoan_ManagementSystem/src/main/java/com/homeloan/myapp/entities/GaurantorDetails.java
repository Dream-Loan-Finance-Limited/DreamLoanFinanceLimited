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
public class GaurantorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gaurantorId;
	
    private String gaurantorName;
    private String gaurantorAge;
    private String gaurantorGender;
    private String gaurantorRelation;
    private Long gaurantorContactNumber;
    private Long gaurantorAdharNumber;
    private String gaurantorPanNumber;
    private String gaurantorAddress;
}
