package com.school.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Teacher extends Person {
	private Subject subject;

	public Teacher() {
		super();
	}

	public Teacher(Subject subject, String name, int age, String address) {
		super(name, age, address);
		this.subject = subject;
	}

	public Subject getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
