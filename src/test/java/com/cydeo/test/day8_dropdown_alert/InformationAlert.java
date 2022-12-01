package com.cydeo.test.day8_dropdown_alert;

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

import static org.testng.Assert.*;


public class InformationAlert {
    /*
        1. Open browser
    2. Go to website: http://practice.cydeo.com/javascript_alerts
    3. Click to “Click for JS Prompt” button
    4. Send “hello” text to alert
    5. Click to OK button from the alert
    6. Verify “You entered:  hello” text is displayed.
         */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
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
    public void jsPrompt(){
        WebElement jsBtn = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

        WebElement displayText = driver.findElement(By.id("result"));

        assertTrue(displayText.isDisplayed(), "result text did not display");
        String actual = displayText.getText();
        String expected = "You entered: hello";

        assertEquals(actual, expected, "The text did not display");
    }
}
