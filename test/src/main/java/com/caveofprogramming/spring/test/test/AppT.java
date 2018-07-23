package com.caveofprogramming.spring.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppT {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/test/beans/beans.xml");
		

		Logger logger=(Logger)context.getBean("logger");
		
		logger.writeConsole("Czesc tam..");
		logger.writeFile("Czesc znowu.");
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
