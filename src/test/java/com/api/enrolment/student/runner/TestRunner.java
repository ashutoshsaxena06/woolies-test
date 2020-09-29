package com.api.enrolment.student.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber",
        "json:target/cucumber.json"},
        features = {"src/test/resources/Features/"},
        glue = {"com.api.enrolment.student.steps"},
        monochrome = true,
        tags = {"@regression"})


public class TestRunner {
}
