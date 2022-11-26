package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        /*
            1- Open a Chrome browser
    2- Go to: https://google.com
    3- Write “apple” in search box
    4- Click google search button
    5- Verify title:
    Expected: Title should start with “apple” word
             */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        WebElement webElement = driver.findElement(By.name("q"));
        webElement.sendKeys("apple" + Keys.ENTER);

        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        driver.close();



    }
}
