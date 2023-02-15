package com.homeloan.myapp.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	private String permanentHouseNumber;
	private String permanentAreaName;
	private String permanentStreetName;
	private String permanentCityName;
	private String permanentDistrict;
	private Integer permanentPinCode;
	private String permanentState;

}
