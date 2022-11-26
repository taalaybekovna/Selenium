package com.cydeo.test.day3_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
        /*
        1- Open a Chrome browser
    2- Go to: https://practice.cydeo.com/registration_form
    3- Verify header text is as expected:
      Expected: Registration form
    4- Locate “First name” input box
    5- Verify placeholder attribute’s value is as expected:
      Expected: first name
         */
        public static void main(String[] args) {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://practice.cydeo.com/registration_form");

            WebElement headerText = driver.findElement(By.tagName("h2"));
            String actualHeader = headerText.getText();
            String expectedHeader = "Registration form";

            if (actualHeader.contains(expectedHeader)){
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }


            WebElement webElement = driver.findElement(By.name("firstname"));
            String actualText = webElement.getAttribute("placeholder");
            String expectedText = "first name";

            if (actualText.equals(expectedText)){
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

            driver.close();



        }
}
