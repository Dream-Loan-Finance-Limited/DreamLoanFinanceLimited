package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
		// *****Class Path*****
//		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
//		Student s=(Student) ac.getBean("s");
//		s.display();
		
		// *****File System*****
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("D:\\Java\\Spring files\\Spring.xml");
		Student s=(Student) ac.getBean("s");
		s.display();
		
		
	}
}
