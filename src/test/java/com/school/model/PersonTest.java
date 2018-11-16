package com.school.model;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {

	private static final String ADDRESS = "SomeAddress";
	private static final String NAME = "MyName";
	private static final int AGE = 10;
	private static Person PERSON = new Person(NAME, AGE, ADDRESS);

	@AfterClass
	public static void beforeClass(){
		Person.reset();
	}

	@Test
	public void getId() {
		Assert.assertEquals(1, PERSON.getId());
	}

	@Test
	public void getName() {
		Assert.assertEquals(NAME, PERSON.getName());
	}

	@Test
	public void getAge() {
		Assert.assertEquals(AGE, PERSON.getAge());
	}

	@Test
	public void getAddress() {
		Assert.assertEquals(ADDRESS, PERSON.getAddress());
	}
}
