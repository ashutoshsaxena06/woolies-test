package com.woolies.qa.drivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverManager {

    private WebDriver driver;

    public WebDriver getDriver() {
        if (this.driver == null) {
           setDriver("");
        }
        return this.driver;
    }

    public void setDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().mac().setup();
                this.driver = new ChromeDriver();
                break;
            case "ff":
                WebDriverManager.firefoxdriver().mac().setup();
                this.driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().mac().setup();
                this.driver = new EdgeDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().mac().setup();
                this.driver = new OperaDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().mac().setup();
                this.driver = new InternetExplorerDriver();
                break;
            default:
                System.out.println("provided browser config not available.. selecting default .. chrome"); // can change to logger
                WebDriverManager.chromedriver().mac().setup();
                this.driver = new ChromeDriver();
                break;
        }
        this.driver.manage().window().maximize();
    }
}
