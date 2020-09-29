package com.api.enrolment.student.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GetStudentDetailsSteps {
    @Given("^I provide the class name \"([^\"]*)\" to fetch bulk records$")
    public void iProvideTheClassNameToFetchBulkRecords(String arg0)  {


    }

    @When("^trigger the get student enrolment request$")
    public void triggerTheGetStudentEnrolmentRequest() {
    }

    @And("^student records are fetched from response$")
    public void studentRecordsAreFetchedFromResponse() {
    }

    @And("^compare the records from the database using class name \"([^\"]*)\"$")
    public void compareTheRecordsFromTheDatabaseUsingClassName(String arg0)  {


    }

    @Given("^I provide the student ID \"([^\"]*)\" to fetch single record$")
    public void iProvideTheStudentIDToFetchSingleRecord(String arg0)  {


    }

    @And("^only one record is received$")
    public void onlyOneRecordIsReceived() {
    }

    @And("^student record are fetched from response$")
    public void studentRecordAreFetchedFromResponse() {
    }

    @And("^compare the record from the database using student ID \"([^\"]*)\"$")
    public void compareTheRecordFromTheDatabaseUsingStudentID(String arg0)  {


    }
}
