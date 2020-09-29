package com.api.enrolment.student.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostNewStudentEnrolmentSteps {



    @Given("^I use the student details as id \"([^\"]*)\", firstName \"([^\"]*)\", lastName \"([^\"]*)\", className \"([^\"]*)\" and nationality \"([^\"]*)\"$")
    public void iUseTheStudentDetailsAsIdIDFirstNameLastNameClassNameAndNationality(String id, String firstName, String lastName, String className, String nationality) {

    }

    @When("^trigger the create student enrolment request$")
    public void triggerTheCreateStudentEnrolmentRequest() {
    }

    @And("^response contains all the student details$")
    public void responseContainsAllTheStudentDetails() {
    }

    @And("^student record is found in database with provided details$")
    public void studentRecordIsFoundInDatabaseWithProvidedDetails() {
    }


    @Given("^I use the student details as firstName \"([^\"]*)\", lastName \"([^\"]*)\", className \"([^\"]*)\" and nationality \"([^\"]*)\"$")
    public void iUseTheStudentDetailsAsFirstNameLastNameClassNameAndNationality(String firstName, String lastName, String className, String nationality) {


    }

    @When("^trigger the create student enrolment request with PUT method$")
    public void triggerTheCreateStudentEnrolmentRequestWithPUTMethod() {
    }

}
