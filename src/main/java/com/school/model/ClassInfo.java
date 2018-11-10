package com.school.model;

import java.util.ArrayList;
import java.util.List;

public class ClassInfo {
	private int id;
	private static int ID = 1;
	private Standard standard;
	private List<Teacher> teachers;
	private List<Student> students;

	public ClassInfo(Standard standard) {
		this.standard = standard;
		this.id = ID;
		ID++;
	}

	public int getId() {
		return id;
	}

	public Standard getStandard() {
		return standard;
	}

	public List<Teacher> getFaculties() {
		return teachers;
	}

	public List<Subject> getSubjects() {
		List<Subject> listSubject = new ArrayList<>();
		for (Teacher teacher : teachers) {
			listSubject.add(teacher.getSubject());
		}
		return listSubject;
	}

	public boolean isTaught(Subject subject) {
		for (Teacher teacher : teachers) {
			if (teacher.getSubject().equals(subject)) {
				return true;
			}
		}
		return false;
	}

	public boolean teaches(Teacher teacher) {
		for (Teacher t : teachers) {
			if (t.equals(teacher)) {
				return true;
			}
		}
		return false;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void addStudent(Student student) {
		students.add(student);
	}
}
