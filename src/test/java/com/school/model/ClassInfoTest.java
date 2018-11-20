package com.school.model;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClassInfoTest {
	private static final Standard STANDARD = Standard.SEVENTH;
	private static final Teacher TEACHER = new Teacher(Subject.ARTS, "MyName", 24, "MyAddress");
	private static final Teacher TEACHERNEGATIVE = new Teacher(Subject.GEOGRAPHY, "name", 40, "address");
	private static final Student STUDENT = new Student(STANDARD, "my name", 29, "my address");
	private final static ClassInfo CLASS_INFO = new ClassInfo(STANDARD);

	@AfterClass
	public static void beforeClass() {
		Person.reset();
	}

	@Test
	public void getId() {
		Assert.assertTrue(CLASS_INFO.getId() > 0);
	}

	@Test
	public void getStandard() {
		Assert.assertEquals(STANDARD, CLASS_INFO.getStandard());
	}

	@Test
	public void addAndGetTeacher() {
		CLASS_INFO.addTeacher(TEACHER);
		List<Teacher> teachers = CLASS_INFO.getTeachers();
		Assert.assertEquals(1, teachers.size());
		Assert.assertEquals(TEACHER, teachers.get(0));
	}

	@Test
	public void addAndGetStudent() {
		CLASS_INFO.addStudent(STUDENT);
		List<Student> students = CLASS_INFO.getStudents();
		Assert.assertEquals(1, students.size());
		Assert.assertEquals(STUDENT, students.get(0));
	}

	@Test
	public void isTaught() {
		Assert.assertTrue(CLASS_INFO.isTaught(Subject.ARTS));
	}

	@Test
	public void isTaughtNegative() {
		Assert.assertFalse(CLASS_INFO.isTaught(Subject.HISTORY));
	}

	@Test
	public void teaches() {
		Assert.assertTrue(CLASS_INFO.teaches(TEACHER));
	}

	@Test
	public void teachesNagative() {
		Assert.assertFalse(CLASS_INFO.teaches(TEACHERNEGATIVE));
	}
}
