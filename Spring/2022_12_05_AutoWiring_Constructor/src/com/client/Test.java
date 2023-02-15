package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		Student s=(Student) ac.getBean("s");
		
		System.out.println(s);
		
		
		
	}
	
}
