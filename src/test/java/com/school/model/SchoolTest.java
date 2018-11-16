package com.school.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class SchoolTest {
	private static final String NAME = "my name";
	private static final List<ClassInfo> CLASSES = new ArrayList<>();
	private School school = new School(NAME);
	private static final ClassInfo class1 = new ClassInfo(Standard.EIGHTH);

	@Test
	public void getName() {
		Assert.assertEquals(NAME, school.getName());
	}

	@Test
	public void getClasses() {
		Assert.assertEquals(CLASSES, school.getClasses());
	}

	@Test
	public void addClasses() {
		school.addClass(class1);
		Assert.assertEquals(1, school.getClasses().size());
	}
}
