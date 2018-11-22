package uat;

import org.junit.Assert;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.school.model.Teacher;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeachersInfo {

	private Teacher[] teachers;
	private Teacher teacher;

	@Given("^There is a school$")
	public void schoolIsThere() throws Exception {
		Response response = RestAssured.when().get("http://localhost:8080/school");
		Assert.assertEquals("application/json;charset=UTF-8", response.contentType());
		Assert.assertEquals(200, response.statusCode());
		Assert.assertNotNull(response.getBody());
	}

	@When("^I retrieve all teachers from school$")
	public void getTeachers() throws Exception {
		Response response = RestAssured.when().get("http://localhost:8080/school/teachers");
		Assert.assertEquals("application/json;charset=UTF-8", response.contentType());
		Assert.assertEquals(200, response.statusCode());
		Assert.assertNotNull(response.getBody());
		teachers = response.as(Teacher[].class);
	}

	@Then("^I get (\\d+) teachers$")
	public void assertTeachers(int count) throws Exception {
		Assert.assertEquals(count, teachers.length);
	}

	@When("^I retrive teachers with id (\\d+) from school$")
	public void getTeachersById(int id) throws Exception {
		Response response = RestAssured.when().get("http://localhost:8080/school/teachers/{id}", id);
		Assert.assertEquals("application/json;charset=UTF-8", response.contentType());
		Assert.assertEquals(200, response.statusCode());
		teacher = response.as(Teacher.class);
	}

	@Then("^I get teacher with id (\\d+)$")
	public void assertTeachersById(int id) throws Exception {
		Assert.assertEquals(id, teacher.getId());
	}

	@When("^I retrive teachers with standard (\\d+) from school$")
	public void getTeachersByStandard(int standard) throws Exception {
		Response response = RestAssured.when().get("http://localhost:8080/school/classes/{Standard}/teachers",
				standard);
		Assert.assertEquals(200, response.statusCode());
		Assert.assertEquals("application/json;charset=UTF-8", response.contentType());
		teachers = response.as(Teacher[].class);

	}

}
