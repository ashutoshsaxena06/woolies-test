package com.woolies.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@id='block_top_menu']//a[text()='Women']")
    private WebElement btnTabWomen;
    @FindBy(how = How.XPATH, using = "//a[text()='Tops']/following-sibling::*//a[text()='T-shirts']")
    private WebElement lnkTshirts;
    @FindAll(@FindBy(how = How.XPATH, using = ""))
    private List<WebElement> i;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToSection(String sectionName) {
        switch (sectionName.toLowerCase()){
            case "women":
                waitForElementToAppear(btnTabWomen).click();
                break;
            default:
                System.out.println("not implemented");
                break;
        }
    }

    public void selectSubcategoryFromSection(String subCategory, String section) {
        navigateToSection(section);
        navigateToSubCategory(subCategory);
    }

    public void navigateToSubCategory(String subCategory) {
        switch (subCategory.toLowerCase()){
            case "t-shirts":
                waitForElementToAppear(lnkTshirts).click();
                break;
            default:
                System.out.println("not implemented");
                break;
        }
    }

    public void itemsDisplayed() {

    }
}
