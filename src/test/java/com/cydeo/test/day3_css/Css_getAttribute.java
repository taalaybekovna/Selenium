package com.cydeo.test.day3_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_getAttribute {
    public static void main(String[] args) {
        /*
            1- Open a Chrome browser
    2- Go to: https://login1.nextbasecrm.com/
    3- Verify “Log in” button text is as expected:
    Expected: Log In
             */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement webElement = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String actualText = webElement.getAttribute("value");
        String expectedText = "Log In";

        if (actualText.equals(expectedText)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        driver.close();






    }
}