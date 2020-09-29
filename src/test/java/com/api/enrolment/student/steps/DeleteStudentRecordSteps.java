package com.api.enrolment.student.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DeleteStudentRecordSteps {
    @Given("^I use the student ID \"([^\"]*)\" to remove the record$")
    public void iUseTheStudentIDToRemoveTheRecord(String ID)  {


    }

    @When("^trigger the delete student record$")
    public void triggerTheDeleteStudentRecord() {
    }

    @And("^student record with student ID \"([^\"]*)\" is not found in database$")
    public void studentRecordWithStudentIDIsNotFoundInDatabase(String arg0)  {


    }
}
