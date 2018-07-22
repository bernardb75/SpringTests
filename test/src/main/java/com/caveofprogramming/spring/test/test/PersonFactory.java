package com.caveofprogramming.spring.test.test;

public class PersonFactory {
public Person createPerson(int id, String name) {
	System.out.println("Powstał przez użycie create person.");
	return new Person(id, name);
	
}
}
