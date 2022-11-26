package com.cydeo.test.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolVerification {
    public static void main(String[] args) {

          /*
          TC #1: Cydeo practice tool verifications
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com
    3. Verify URL contains
    Expected: cydeo
    4. Verify title:
           Expected: Practice
           */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com ");

        String actualUrl = driver.getCurrentUrl();
        String expectedTitle= "cydeo";

        if (actualUrl.contains(expectedTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.close();









    }
}
