package com.sprindDemo.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DemoApplication {

	public static void main(String[] args) {

		//Triangle t=new Triangle();
		BeanFactory factory=new ClassPathXmlApplicationContext("./spring.xml");
		Triangle triangle =(Triangle) factory.getBean("Triangle");
		triangle.draw();


	}

}
