package com.caveofprogramming.spring.test.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jungle {
	private Animal largest;
	private List<Animal> animals;
	
	private Map<String, String> foods=new HashMap<String, String>();
	
	
	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}
	public Animal getLargest() {
		return largest;
	}
	public void setLargest(Animal largest) {
		this.largest = largest;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		sb.append("Najwieksze zwierze:"+largest);
		sb.append("\n");
		sb.append("Pozostałe zwierzeta:\n");
		
		for (Animal animal : animals) {
			sb.append(animal);
			sb.append("\n");
		}
		for (Map.Entry<String, String> en : foods.entrySet()) {
			sb.append(en.getKey()+": "+ en.getValue()+"\n");
		}
		
		return sb.toString();
	}
	
	
}
