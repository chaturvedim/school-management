package com.school.service;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.school.data.SchoolInMemoryData;
import com.school.model.Person;
import com.school.model.Standard;

public class SchoolInMemoryDataServiceTest {
	public static SchoolInMemoryDataService schoolInMemoryDataService = new SchoolInMemoryDataService(
			new SchoolInMemoryData());

	@AfterClass
	public static void beforeClass(){
		Person.reset();
	}
	
	@Test
	public void getTeachers() {
		Assert.assertEquals(6, schoolInMemoryDataService.getTeachers().size());
	}

	@Test
	public void getTeachersNegative() {
		Assert.assertFalse(schoolInMemoryDataService.getTeachers().isEmpty());
	}

	@Test
	public void getTeacherId() {
		Assert.assertEquals(1, schoolInMemoryDataService.getTeacher(1).getId());
	}

	@Test
	public void getTeacherIdNegative() {
		Assert.assertNull(schoolInMemoryDataService.getTeacher(999));
	}

	@Test
	public void getTeacherStandard() {
		Assert.assertEquals(2, schoolInMemoryDataService.getTeachers(Standard.SIXTH).size());
	}

	@Test
	public void getTeacherStandardNegative() {
		Assert.assertNotEquals(0, schoolInMemoryDataService.getTeachers(Standard.SIXTH).size());
	}

	@Test
	public void getStudents() {
		Assert.assertEquals(9, schoolInMemoryDataService.getStudents().size());
	}

	@Test
	public void getStudentsNegative() {
		Assert.assertFalse(schoolInMemoryDataService.getStudents().isEmpty());
	}

	@Test
	public void getStudentsId() {
		Assert.assertNotNull(schoolInMemoryDataService.getStudent(3));
	}

	@Test
	public void getStudentsIdNegative() {
		Assert.assertNull(schoolInMemoryDataService.getStudent(999));
	}

	@Test
	public void getStudentsStandard() {
		Assert.assertEquals(3, schoolInMemoryDataService.getStudents(Standard.SIXTH).size());
	}

	@Test
	public void getStudentsStandardNegative() {
		Assert.assertFalse(schoolInMemoryDataService.getStudents(Standard.SIXTH).isEmpty());
	}

}
