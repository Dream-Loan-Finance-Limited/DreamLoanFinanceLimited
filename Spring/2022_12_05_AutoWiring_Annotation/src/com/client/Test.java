package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		Student s=(Student) ac.getBean("s");
		
		System.out.println("Roll No. : "+s.getRollno());
		System.out.println("Name     : "+s.getName());
		System.out.println("AreaName : "+s.getAdr().getAreaname());
		System.out.println("CityName : "+s.getAdr().getCityname());
		
		
		
	}
	
}
