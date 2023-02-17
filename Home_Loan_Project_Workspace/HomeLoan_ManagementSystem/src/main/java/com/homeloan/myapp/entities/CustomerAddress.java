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
public class CustomerAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	
	private String localHouseNumber;
	private String loacalAreaName;
	private String localStreetName;
	private String localCityName;
	private String localDistrict;
	private Integer localPinCode;
	private String localState;
	
	private String permanentHouseNo;
	private String permanentAreaName;
	private String permanentStreetName;
	private String permanentCityName;
	private String permanentDistrict;
	private Integer permanentPinCode;
	private String permanentState;

}
