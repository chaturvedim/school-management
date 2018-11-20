package com.school.data;

import com.school.model.ClassInfo;
import com.school.model.School;
import com.school.model.Standard;
import com.school.model.Student;
import com.school.model.Subject;
import com.school.model.Teacher;

public class SchoolInMemoryData {
	public School school = new School("Beersheba");

	public SchoolInMemoryData() {
		school.addClass(getClassSixth());
		school.addClass(getClassSeventh());
		school.addClass(getClassEighth());
	}

	public School getSchool() {
		return school;
	}

	private ClassInfo getClassSixth() {
		ClassInfo classInfo = new ClassInfo(Standard.SIXTH);
		classInfo.addTeacher(new Teacher(Subject.ARTS, "Manjari6", 4, "Burlington"));
		classInfo.addTeacher(new Teacher(Subject.GEOGRAPHY, "Gaurav6", 4, "Burlington"));
		classInfo.addStudent(new Student(Standard.SIXTH, "Ayansh6", 4, "Burlington"));
		classInfo.addStudent(new Student(Standard.SIXTH, "Gaurik6", 4, "Gurgaon"));
		classInfo.addStudent(new Student(Standard.SIXTH, "Ankit6", 4, "Banglore"));
		return classInfo;
	}

	private ClassInfo getClassSeventh() {
		ClassInfo classInfo = new ClassInfo(Standard.SEVENTH);
		classInfo.addTeacher(new Teacher(Subject.MATHS, "Manjari7", 4, "Burlington"));
		classInfo.addTeacher(new Teacher(Subject.HISTORY, "Gaurav7", 4, "Burlington"));
		classInfo.addStudent(new Student(Standard.SEVENTH, "Ayansh7", 4, "Burlington"));
		classInfo.addStudent(new Student(Standard.SEVENTH, "Gaurik7", 4, "Gurgaon"));
		classInfo.addStudent(new Student(Standard.SEVENTH, "Ankit7", 4, "Banglore"));
		return classInfo;
	}

	private ClassInfo getClassEighth() {
		ClassInfo classInfo = new ClassInfo(Standard.EIGHTH);
		classInfo.addTeacher(new Teacher(Subject.MATHS, "Manjari8", 4, "Burlington"));
		classInfo.addTeacher(new Teacher(Subject.GEOGRAPHY, "Gaurav8", 4, "Burlington"));
		classInfo.addStudent(new Student(Standard.EIGHTH, "Ayansh8", 4, "Burlington"));
		classInfo.addStudent(new Student(Standard.EIGHTH, "Gaurik8", 4, "Gurgaon"));
		classInfo.addStudent(new Student(Standard.EIGHTH, "Ankit8", 4, "Banglore"));
		return classInfo;
	}

}
