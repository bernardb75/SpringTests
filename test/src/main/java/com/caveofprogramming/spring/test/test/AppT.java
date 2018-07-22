package com.caveofprogramming.spring.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppT {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/test/beans/beans.xml");
		

		FruitBasket basket=(FruitBasket)context.getBean("basket");
		System.out.println(basket);
		
		Jungle jungle =(Jungle)context.getBean("jungle");
		System.out.println(jungle);
		((ClassPathXmlApplicationContext)context).close();
	}

}
