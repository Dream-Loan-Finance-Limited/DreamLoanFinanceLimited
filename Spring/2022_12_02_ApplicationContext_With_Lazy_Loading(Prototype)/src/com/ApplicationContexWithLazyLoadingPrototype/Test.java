package com.ApplicationContexWithLazyLoadingPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		System.out.println();
		System.out.println("Application Context with Lazy Loading Prototype");
		System.out.println();
		
		Student s1=(Student) ac.getBean("s");
		System.out.println(s1.hashCode());
		Student s2=(Student) ac.getBean("s");
		System.out.println(s2.hashCode());
	}
}
