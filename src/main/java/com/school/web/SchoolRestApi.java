package com.school.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.ClassInfo;
import com.school.model.School;
import com.school.model.Standard;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.service.SchoolDataService;

@RestController
@RequestMapping("/school")
public class SchoolRestApi {

	public SchoolDataService schoolDataService;

	public SchoolRestApi(SchoolDataService schoolDataService) {
		this.schoolDataService = schoolDataService;
	}

	@GetMapping
	public School getSchool() {
		return schoolDataService.getSchool();
	}

	@GetMapping(path = "/classes")
	public List<ClassInfo> getClasses() {
		return schoolDataService.getClasses();
	}

	@GetMapping(path = "/teachers")
	public List<Teacher> getTeachers() {
		return schoolDataService.getTeachers();
	}

	@GetMapping(path = "/teachers/{id}")
	public Teacher getTeacher(@PathVariable int id) {
		return schoolDataService.getTeacher(id);
	}

	@GetMapping(path = "/classes/{standard}/teachers")
	public List<Teacher> getTeacherByStandard(@PathVariable int standard) {
		return schoolDataService.getTeachers(Standard.from(standard));
	}

	@GetMapping(path = "/students")
	public List<Student> getStudents() {
		return schoolDataService.getStudents();
	}

	@GetMapping(path = "/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return schoolDataService.getStudent(id);
	}

	@GetMapping(path = "/classes/{standard}/students")
	public List<Student> getStudents(@PathVariable int standard) {
		return schoolDataService.getStudents(Standard.from(standard));
	}

	@GetMapping(path = "/classes/{standard}")
	public ClassInfo getClass(@PathVariable int standard) {
		return schoolDataService.getClass(Standard.from(standard));
	}
}
