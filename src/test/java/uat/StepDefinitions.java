package uat;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

    @Given("^School has (\\d+)th standard$")
    public void schoolHasStandard(int standard) throws Exception {
        //throw new PendingException();
    }

    @When("^I get all students in the class$")
    public void getStudents() throws Exception {
        //throw new PendingException();
    }

    @Then("^I get (\\d+) students$")
    public void assertStudents(int studentCount) throws Exception {
        //throw new PendingException();
    }
}
