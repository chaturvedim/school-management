package com.school.service;

import java.util.List;

import com.school.model.ClassInfo;
import com.school.model.School;
import com.school.model.Standard;
import com.school.model.Student;
import com.school.model.Teacher;

public interface SchoolDataService {

	School getSchool();

	List<ClassInfo> getClasses();

	List<Teacher> getTeachers();

	Teacher getTeacher(int id);

	List<Teacher> getTeachers(Standard standard);

	List<Student> getStudents();

	Student getStudent(int id);

	List<Student> getStudents(Standard standard);

	ClassInfo getClass(Standard standard);
}
