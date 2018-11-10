package com.school.model;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
	private static final String NAME = "my name";
	private static final String ADDRESS = "some address";
	private static final int AGE = 20;
	private static final Standard STANDARD = Standard.EIGHTH;

	private static Student STUDENT = new Student(STANDARD, NAME, AGE, ADDRESS);

	@Test
	public void getName() {
		Assert.assertEquals(NAME, STUDENT.getName());
	}

	@Test
	public void getAddress() {
		Assert.assertEquals(ADDRESS, STUDENT.getAddress());
	}

	@Test
	public void getAge() {
		Assert.assertEquals(AGE, STUDENT.getAge());
	}

	@Test
	public void getStandard() {
		Assert.assertEquals(STANDARD, STUDENT.getStandard());
	}

}
