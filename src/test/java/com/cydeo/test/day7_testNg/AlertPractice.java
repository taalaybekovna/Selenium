package com.cydeo.test.day7_testNg;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {
    /*
        1. Open browser
    2. Go to website: http://practice.cydeo.com/javascript_alerts
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Verify “You successfully clicked an alert” text is displayed.
         */
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method is running");
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method is running");
        driver.quit();
    }

    @Test
    public void alert(){
        WebElement jsBtn = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement textDisplay = driver.findElement(By.id("result"));
        Assert.assertTrue(textDisplay.isDisplayed());

        String actualText = textDisplay.getText();
        String expectedText = "You successfully clicked an alert";

        Assert.assertEquals(actualText, expectedText, "Text is not verified");

        }

    }

