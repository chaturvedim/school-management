package com.school.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Student extends Person {
	private final Standard standard;

	public Student(Standard standard, String name, int age, String address) {
		super(name, age, address);
		this.standard = standard;
	}

	public Standard getStandard() {
		return standard;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
