package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.model.MySql;
import com.model.Oracle;

public class Test {

	public void classPath()
	{
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		Oracle o=(Oracle) ac.getBean("o");
		MySql m=(MySql) ac.getBean("m");
		
		System.out.println("*****Class Path*****");
		System.out.println();
		o.data();
		o.con();
		System.out.println();
		m.data();
		m.con();
		
	}
	
	public void fileSystem()
	{
		ApplicationContext ac=new FileSystemXmlApplicationContext("D:\\Java\\Spring files\\Spring.xml");
		Oracle o=(Oracle) ac.getBean("o");
		MySql m=(MySql) ac.getBean("m");
		
		System.out.println("*****File System*****");
		System.out.println();
		o.data();
		o.con();
		System.out.println();
		m.data();
		m.con();
		
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.classPath();
		System.out.println();
		System.out.println("========================================");
		
		t.fileSystem();
		
	}
	
}
