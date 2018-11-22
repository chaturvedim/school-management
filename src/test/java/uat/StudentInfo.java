package uat;

import org.junit.Assert;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.school.model.Student;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInfo {
	private Student[] students;
	private Student student;

	@When("^There are students enrolled in the school$")
	public void getStudent() throws Exception {
		Response response = RestAssured.when().get("http://localhost:8080/school/students");
		Assert.assertEquals("application/json;charset=UTF-8", response.contentType());
		Assert.assertEquals(200, response.statusCode());
		Assert.assertNotNull(response.getBody());
		students = response.as(Student[].class);
	}

	@Then("^I get (\\d+) students$")
	public void assertStudents(int count) throws Exception {
		Assert.assertEquals(count, students.length);

	}

	@When("^I retrive students with id (\\d+) from school$")
	public void getStudentsById(int id) throws Exception {
		Response response = RestAssured.when().get("http://localhost:8080/school/students/{ID}", id);
		Assert.assertEquals("application/json;charset=UTF-8", response.contentType());
		Assert.assertEquals(200, response.statusCode());
		student = response.as(Student.class);
	}

	@Then("^I get student with id (\\d+)$")
	public void assertStudentsById(int id) throws Exception {
		Assert.assertEquals(id, student.getId());
	}

	@When("^I retrive students with standard (\\d+) from school$")
	public void getStudentsByStandard(int standard) throws Exception {
		Response response = RestAssured.when().get("http://localhost:8080/school/classes/{Standard}/students",
				standard);
		Assert.assertEquals("application/json;charset=UTF-8", response.contentType());
		Assert.assertEquals(200, response.statusCode());
		students = response.as(Student[].class);
	}

}
