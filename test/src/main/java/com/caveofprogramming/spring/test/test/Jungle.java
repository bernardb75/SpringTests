package com.caveofprogramming.spring.test.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jungle {


	private Map<String, String> foods=new HashMap<String, String>();
	private Map<String, Animal> animals=new HashMap<String, Animal>();
	
	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	
	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}
	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();

		for (Map.Entry<String, String> en : foods.entrySet()) {
			sb.append(en.getKey()+": "+ en.getValue()+"\n");
		}
		for (Map.Entry<String, Animal> en : animals.entrySet()) {
			sb.append(en.getKey()+": "+ en.getValue()+"\n");
		}
		
		return sb.toString();
	}
	
	
}
