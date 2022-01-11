package com.woolies.qa.steps;

import com.woolies.qa.config.Constants;
import com.woolies.qa.drivermanager.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Before
    public void setup() {
        driverManager.setDriver("chrome");
        System.out.println("launched chrome ...");
    }

    @After
    public void teardown() {
        driverManager.getDriver().quit();
    }
}
