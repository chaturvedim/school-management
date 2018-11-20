package com.school.service;

import java.util.ArrayList;
import java.util.List;

import com.school.data.SchoolInMemoryData;
import com.school.model.ClassInfo;
import com.school.model.School;
import com.school.model.Standard;
import com.school.model.Student;
import com.school.model.Teacher;

public class SchoolInMemoryDataService implements SchoolDataService {

	private final SchoolInMemoryData schoolData;

	public SchoolInMemoryDataService(SchoolInMemoryData schoolData) {
		this.schoolData = schoolData;
	}

	@Override
	public List<Teacher> getTeachers() {
		List<Teacher> teachers = new ArrayList<>();
		for (ClassInfo clazz : schoolData.getSchool().getClasses()) {
			teachers.addAll(clazz.getTeachers());
		}
		return teachers;
	}

	@Override
	public Teacher getTeacher(int id) {
		for (ClassInfo clazz : schoolData.getSchool().getClasses()) {
			for (Teacher teacher : clazz.getTeachers()) {
				if (teacher.getId() == id) {
					return teacher;
				}
			}
		}
		return null;
	}

	@Override
	public List<Teacher> getTeachers(Standard standard) {
		for (ClassInfo clazz : schoolData.getSchool().getClasses()) {
			if (clazz.getStandard() == standard) {
				return clazz.getTeachers();
			}
		}
		return null;
	}

	@Override
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		for (ClassInfo clazz : schoolData.getSchool().getClasses()) {
			students.addAll(clazz.getStudents());
		}
		return students;
	}

	@Override
	public Student getStudent(int id) {
		for (ClassInfo clazz : schoolData.getSchool().getClasses()) {
			for (Student student : clazz.getStudents()) {
				if (student.getId() == id) {
					return student;
				}
			}
		}
		return null;
	}

	@Override
	public List<Student> getStudents(Standard standard) {
		for (ClassInfo clazz : schoolData.getSchool().getClasses()) {
			if (clazz.getStandard() == standard) {
				return clazz.getStudents();
			}
		}
		return null;
	}

	@Override
	public ClassInfo getClass(Standard standard) {
		for (ClassInfo clazz : schoolData.getSchool().getClasses()) {
			if (clazz.getStandard() == standard) {
				return clazz;
			}
		}
		return null;
	}

	@Override
	public School getSchool() {
		return schoolData.getSchool();
	}

	@Override
	public List<ClassInfo> getClasses() {
		return schoolData.getSchool().getClasses();
	}
}
