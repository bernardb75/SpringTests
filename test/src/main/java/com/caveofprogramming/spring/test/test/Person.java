package com.caveofprogramming.spring.test.test;

public class Person {
	private int id;
	private String name;

	private int taxId;
	private Address address;

	public Person() {

	}
	public static Person getInstance(int id, String name) {
		System.out.println("Stworzył Person używając metode factory");
		return new Person(id, name);
	}

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public void onCreate() {
		System.out.println("Person stworzył: "+this);
	}
	
	public void onDestroy() {
		System.out.println("Person zniszczył: ");
	}
	public void speak() {

		// TODO Auto-generated method stub
		System.out.println("Mówię lalallalala....");

	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	
	

}
