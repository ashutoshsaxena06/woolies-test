package com.woolies.qa.context;

import com.woolies.qa.drivermanager.DriverManager;
import org.springframework.beans.factory.annotation.Autowired;

public class TestContext {
	@Autowired
	DriverManager webDriverManager;

	ScenarioContext scenarioContext;

	public TestContext(){
		scenarioContext = new ScenarioContext();
	}

	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}

}