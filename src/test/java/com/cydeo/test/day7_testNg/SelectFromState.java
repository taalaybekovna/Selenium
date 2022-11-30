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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectFromState {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method is running");
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method is running");
        driver.quit();
    }

    /*
    1. Open Chrome browser
    2. Go to http://practice.cybertekschool.com/dropdown
    3. Select Illinois
    4. Select Virginia
    5. Select California
    6. Verify final selected option is California.
    Use all Select options. (visible text, value, index)
         */

    @Test
    public void selectState(){
        Select states = new Select(driver.findElement(By.id("state")));
        states.selectByValue("IL");
        states.selectByVisibleText("Virginia");
        states.selectByVisibleText("California");

        String actual = states.getOptions().get(5).getText();
        String expected = "California";

        Assert.assertEquals(actual, expected, "This is state California");

    }
    /*
    2. Go to https://practice.cydeo.com/dropdown
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.
         */

    @Test
    public void selectAll() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");
        Select languages = new Select(driver.findElement(By.name("Languages")));
        System.out.println("languages.isMultiple() = " + languages.isMultiple());
        languages.selectByValue("java");
        languages.selectByVisibleText("JavaScript");
        languages.selectByIndex(2);
        languages.selectByVisibleText("Python");
        languages.selectByIndex(4);
        languages.selectByVisibleText("C");

        List<WebElement> allOptions = languages.getOptions();

        for (WebElement each: allOptions){
            each.click();
            Thread.sleep(3000);
            System.out.println("each.getText() = " + each.getText());
        }

        Thread.sleep(3000);
        languages.deselectAll();
    }

}
