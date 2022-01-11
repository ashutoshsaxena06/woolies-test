package com.woolies.qa.steps;

import com.woolies.qa.framework.BaseApi;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.springframework.beans.factory.annotation.Autowired;

public class CommonSteps {
    @Autowired
    BaseApi baseApi;

    @Then("^status code \"([^\"]*)\" must be validated$")
    public void statusCodeMustBeValidated(String status) {
        MatcherAssert.assertThat("status code mismatch"
                , baseApi.getResponse().getStatusCode()
                , Matchers.equalTo(Integer.parseInt(status)));
    }

    @And("^error message \"([^\"]*)\" is received$")
    public void errorMessageIsReceived(String error) {
        MatcherAssert.assertThat("error mismatch"
                , baseApi.getResponse().getBody().path("error")
                , Matchers.equalTo(error));
    }

}
