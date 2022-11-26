package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextBaseCRM {
        /*
        1- Open a Chrome browser
    2- Go to: https://login1.nextbasecrm.com/
    3- Enter incorrect username: “incorrect”
    4- Enter incorrect password: “incorrect”
    5- Click to log in button.
    6- Verify error message text is as expected:
    Expected: Incorrect login or password
         */
        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://login1.nextbasecrm.com/");
            WebElement webElement = driver.findElement(By.name("USER_LOGIN"));
            webElement.sendKeys("incorrect");
            Thread.sleep(3000);

            WebElement webElement1 = driver.findElement(By.name("USER_PASSWORD"));
            webElement1.sendKeys("incorrect");
            Thread.sleep(3000);

            WebElement webElement2 = driver.findElement(By.className("login-btn"));
            webElement2.click();

            Thread.sleep(3000);

            String actualText = driver.findElement(By.className("errortext")).getText();
            String expectedText = "Incorrect login or password";

            if (actualText.contains(expectedText)){
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            driver.close();



        }
}
