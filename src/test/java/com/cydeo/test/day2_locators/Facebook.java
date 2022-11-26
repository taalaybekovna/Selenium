package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https:facebook.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.close();


    }
}
