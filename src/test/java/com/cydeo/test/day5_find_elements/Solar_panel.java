package com.cydeo.test.day5_find_elements;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Solar_panel {
    /*
    1. Open a Chrome browser
    2. Go to: https://www.tesla.com
    3. Locate Solar Panels header
    4. Verify if it is displayed on the page
         */
    public static void main(String[] args) {

        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");
        WebElement webElement = driver.findElement(By.xpath("(//h1[contains(text(),'Solar Panels')])[1]"));
        System.out.println("webElement.isDisplayed() = " + webElement.isDisplayed());

        driver.close();


    }
}
