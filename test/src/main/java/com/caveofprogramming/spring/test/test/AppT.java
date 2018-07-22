package com.caveofprogramming.spring.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppT {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/caveofprogramming/spring/test/test/beans/beans.xml");
		
//		Person person=(Person)context.getBean("person");
//		person.speak();
//		
//		Address address=(Address)context.getBean("address");
//		System.out.println(address);
		
		//Person person=(Person)context.getBean("person");
		//Person person2=(Person)context.getBean("person");
		
		//person.setTaxId(666);
		
		//System.out.println(person);
		
		//Address address2=(Address)context.getBean("address2");
		FruitBasket basket=(FruitBasket)context.getBean("basket");
		System.out.println(basket);
		
		Jungle jungle =(Jungle)context.getBean("jungle");
		System.out.println(jungle);
		((ClassPathXmlApplicationContext)context).close();
	}

}
