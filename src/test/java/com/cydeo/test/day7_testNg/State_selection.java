package com.cydeo.test.day7_testNg;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class State_selection {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method is running");
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    /*
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/dropdown
    3. Verify “Simple dropdown” default selected value is correct
    Expected: “Please select an option”
    4. Verify “State selection” default selected value is correct
    Expected: “Select a State”
         */
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method is running");
        driver.quit();
    }

    @Test
    public void simpleDropdown(){
        driver.get("https://practice.cydeo.com/dropdown");
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));

        String actualSelect = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSelect = "Please select an option";

        Assert.assertEquals(actualSelect, expectedSelect, "Please select an option is verified");

        Select simpleDropdown2 = new Select(driver.findElement(By.id("state")));
        String actual = simpleDropdown2.getFirstSelectedOption().getText();
        String expected = "Select a State";

        Assert.assertEquals(actual, expected, "Select a State verified");
    }

}
