package com.woolies.qa.steps;

import com.woolies.qa.config.Constants;
import com.woolies.qa.drivermanager.DriverManager;
import com.woolies.qa.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps {

    DriverManager driverManager = new DriverManager();
    HomePage homePage;

    @Given("^I am on shopping home page$")
    public void iAmOnShoppingHomePage() {
        driverManager.getDriver().get(Constants.getTestUrl());
    }

    @When("^I navigate to \"([^\"]*)\" from \"([^\"]*)\" tab$")
    public void iClickOnTShirtsTab() {
        homePage = new HomePage(driverManager.getDriver());
        homePage.selectSubcategoryFromSection("t-shirts", "women");
    }

    @Then("^I should be able to see products$")
    public void iShouldBeAbleToSeeProducts() {
        homePage.itemsDisplayed();
    }

    @When("^I add first item to the cart$")
    public void iAddItemToTheCart() {

    }

    @Then("^validate pop up product successfully added to your shopping cart$")
    public void validatePopUpProductSuccessfullyAddedToYourShoppingCart() {
    }

    @And("^validate the item details$")
    public void validateTheItemDetails() {
    }

    @When("^I click on continue shopping$")
    public void iClickOnContinueShopping() {
    }

    @And("^search for item \"([^\"]*)\"$")
    public void searchForItem(String arg0) {
    }

    @And("^sort by lowest first price$")
    public void sortByLowestFirstPrice() {
    }

    @When("^I click on proceed to checkout$")
    public void iClickOnProceedToCheckout() {
    }
}
