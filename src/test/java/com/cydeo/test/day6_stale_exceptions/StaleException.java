package com.cydeo.test.day6_stale_exceptions;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class StaleException {
    /*
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/add_remove_elements/
    3. Click to “Add Element” button
    4. Verify “Delete” button is displayed after clicking.
    5. Click to “Delete” button.
    6. Verify “Delete” button is NOT displayed after clicking.
         */
    public static void main(String[] args) {

        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement webElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        webElement.click();

        WebElement webElement1 = driver.findElement(By.cssSelector("button[class='added-manually']"));
        System.out.println("webElement1.isDisplayed() = " + webElement1.isDisplayed());
        webElement1.click();

        try {

            System.out.println("webElement1.isDisplayed() = " + webElement1.isDisplayed());

        } catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException e is thrown");

        }

        driver.quit();

    }
}
