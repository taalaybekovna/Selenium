package com.cydeo.test.day8_dropdown_alert;

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

public class Select_date {

    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    //3. Select “December 1st, 1923” and verify it is selected.
    // Select year using   : visible text
    //Select month using    : value attribute Select
    //day using : index number

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method is running");
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method is running");
        driver.quit();
    }
    @Test
    public void selectYear(){
        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        year.selectByVisibleText("1923");

        String actualYear = year.getFirstSelectedOption().getText();
        String expectedYear = "1923";

        Assert.assertEquals(actualYear, expectedYear, "Year is not verified");
    }

    @Test
    public void selectMonth(){
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByValue("11");

        String actualMonth = month.getFirstSelectedOption().getText();
        String expectedMonth = "December";

        Assert.assertEquals(actualMonth, expectedMonth, "Month is not verified");
    }

    @Test
    public void selectDay(){
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);

        String actualDay = day.getFirstSelectedOption().getText();
        String expectedDay = "1";

    }















}


