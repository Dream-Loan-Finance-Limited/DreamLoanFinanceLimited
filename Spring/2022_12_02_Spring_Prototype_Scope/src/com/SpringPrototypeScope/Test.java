package com.SpringPrototypeScope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("Spring.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		System.out.println("Before");
		Student s1=(Student) bf.getBean("s");
		System.out.println(s1.hashCode());
		Student s2=(Student) bf.getBean("s");
		System.out.println(s2.hashCode());
		
		System.out.println();
		System.out.println("***************************");
		System.out.println();
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
		System.out.println("Before");
		Student s3=(Student) ac.getBean("s");
		System.out.println(s3.hashCode());
		Student s4=(Student) ac.getBean("s");
		System.out.println(s4.hashCode());
		
	}
	
}
