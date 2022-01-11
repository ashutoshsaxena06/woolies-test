package com.woolies.qa.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.LocalDateTime;

public class BasePage {

    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    protected WebElement waitForElementToAppear(WebElement webElement) {
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    protected boolean waitForElementToDisappear(WebElement webElement) {
        return wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    protected boolean waitForTextToDisappear(By locator, String text) {
        return wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }

    public void errorScreenshot() {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File(System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + LocalDateTime.now() + ".png")); // System.currentTimeMillis()
        } catch (Exception e) {
            System.out.println("Screenshot failed " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}