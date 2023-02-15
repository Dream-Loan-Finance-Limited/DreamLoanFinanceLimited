package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Doctor;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		Doctor d=(Doctor) ac.getBean("doc");
		System.out.println("Doctor Id          : "+d.getDid());
		System.out.println("Doctor Name        : "+d.getDname());
		System.out.println("Doctor Mobile No.  : "+d.getDmobileno());
		System.out.println("Doctor E-mail Id   : "+d.getDemail());
		System.out.println("Hospital Id        : "+d.getHs().getHid());
		System.out.println("Hospital Name      : "+d.getHs().getHname());
		System.out.println("Hospital Address   : "+d.getHs().getAddress());
		System.out.println("Hospital Phone No. : "+d.getHs().getPhono());
		
		
	}
	
}
