package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
        // click A/B
       WebElement linkText = driver.findElement(By.linkText("A/B Testing")); // WebElement linkText means I am restoring the element
       linkText.click();
       Thread.sleep(3000);

        // verify title is
        // expected: No A/B Test
        String actualTitle = driver.getTitle();
        String expectedTitle = "No A/B Test";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // go back to home page
        driver.navigate().back();

        Thread.sleep(3000);

        // verify title equals
        // expected: Practice

        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Practice";

        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        driver.close();














    }
}
