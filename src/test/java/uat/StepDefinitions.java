package uat;

import org.junit.Assert;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.school.model.ClassInfo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	private ClassInfo clazz;

	@Given("^School has (\\d+)th standard$")
	public void schoolHasStandard(int standard) throws Exception {
		Response response = RestAssured.when().get("http://localhost:8080/school/classes/{standard}", standard);
		Assert.assertEquals("application/json;charset=UTF-8", response.contentType());
		Assert.assertEquals(200, response.statusCode());
		Assert.assertNotNull(response.getBody());
		clazz = response.as(ClassInfo.class);
	}

	@When("^I get all students in the class$")
	public void getStudents() throws Exception {
		Assert.assertFalse(clazz.getStudents().isEmpty());
	}

	@Then("^I get (\\d+) students$")
	public void assertStudents(int studentCount) throws Exception {
		Assert.assertEquals(studentCount, clazz.getStudents().size());
	}
}
