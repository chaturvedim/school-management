package com.school.model;

import org.junit.Test;

import junit.framework.Assert;

public class TeacherTest {
	private static final String NAME = "some name";
	private static final String ADDRESS = "some address";
	private static final int AGE = 30;
	private static final Subject SUBJECT = Subject.MATHS;

	private static Teacher TEACHER = new Teacher(SUBJECT, NAME, AGE, ADDRESS);

	@Test
	public void getName() {
		Assert.assertEquals(NAME, TEACHER.getName());
	}

	@Test
	public void getAddress() {
		Assert.assertEquals(ADDRESS, TEACHER.getAddress());
	}

	@Test
	public void getAge() {
		Assert.assertEquals(AGE, TEACHER.getAge());
	}

	@Test
	public void getSubject() {
		Assert.assertEquals(SUBJECT, TEACHER.getSubject());
	}

}
