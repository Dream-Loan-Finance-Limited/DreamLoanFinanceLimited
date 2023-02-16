package com.model;

public class Address {

	private String areaname;
	private String cityname;
	public Address(String areaname, String cityname) {
		super();
		this.areaname = areaname;
		this.cityname = cityname;
	}
	@Override
	public String toString() {
		return "Address [areaname=" + areaname + ", cityname=" + cityname + "]";
	}
	
	
	
	
}
