package com.school.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {
	private int id;
	private final String name;
	private final int age;
	private final String address;
	private static int ID = 1;

	public Person(String name, int age, String address) {
		this.id = ID;
		this.name = name;
		this.age = age;
		this.address = address;
		ID++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public static void reset(){
		ID = 1;
	}
}
