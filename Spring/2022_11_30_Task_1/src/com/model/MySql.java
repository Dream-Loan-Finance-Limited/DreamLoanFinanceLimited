package com.model;

public class MySql implements Connection{

	@Override
	public void data() {
		System.out.println("MySql data method");
		
	}

	@Override
	public void con() {
		System.out.println("Mysql con method");
		
	}

	
}
