package com.BeanFactoryWithLazyLoadingSigleton;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("Spring.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		System.out.println();
		System.out.println("Bean FActory with Lazy Loading Singleton");
		System.out.println();
		
		Student s1=(Student) bf.getBean("s");
		System.out.println(s1.hashCode());
		Student s2=(Student) bf.getBean("s");
		System.out.println(s2.hashCode());
		
	}
	
}
