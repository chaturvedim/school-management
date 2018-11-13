package com.school.model;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	private List<ClassInfo> classes = new ArrayList<>();

	public School(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<ClassInfo> getClasses() {
		return classes;
	}

	public void addClass(ClassInfo class1) {
		classes.add(class1);
	}
}
