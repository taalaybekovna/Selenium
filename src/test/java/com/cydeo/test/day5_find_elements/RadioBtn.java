package com.cydeo.test.day5_find_elements;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioBtn {
    /*
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/radio_buttons
    3. Click to “Hockey” radio button
    4. Verify “Hockey” radio button is selected after clicking.
     */
    public static void main(String[] args) {

        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement webElement = driver.findElement(By.xpath("//input[@id='hockey']"));
        webElement.click();
        System.out.println("webElement.isSelected() = " + webElement.isSelected());
        driver.quit();


    }
}
