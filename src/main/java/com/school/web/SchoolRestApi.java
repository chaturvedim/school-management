package com.school.web;

import java.util.List;

import com.school.model.ClassInfo;
import com.school.model.Standard;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.service.SchoolDataService;

public class SchoolRestApi {
	public SchoolDataService schoolDataService;

	ClassInfo classInfo = new ClassInfo(Standard.EIGHTH);

	public SchoolRestApi(SchoolDataService schoolDataService) {
		super();
		this.schoolDataService = schoolDataService;
	}

	public List<Teacher> getTeachers() {
		return schoolDataService.getTeachers();
	}

	public Teacher getTeacher(int id) {
		return schoolDataService.getTeacher(id);
	}

	public List<Teacher> getTeacher(Standard standard) {
		return schoolDataService.getTeachers(standard);
	}

	public List<Student> getStudents() {
		return schoolDataService.getStudents();
	}

	public Student getStudent(int id) {
		return schoolDataService.getStudent(id);
	}

	public List<Student> getStudents(Standard standard) {
		return schoolDataService.getStudents(standard);
	}

}
