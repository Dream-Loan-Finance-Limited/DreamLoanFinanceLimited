package com.model;

public class Oracle implements Connection{

	@Override
	public void data() {
		System.out.println("Oracle data method");
		
	}

	@Override
	public void con() {
		System.out.println("Oracle con method");
		
	}

	
}
