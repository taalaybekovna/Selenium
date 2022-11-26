package com.cydeo.test.day3_css;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_getText {
    /*
        1- Open a Chrome browser
    2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
    3- Verify “Reset password” button text is as expected:
    Expected: Reset password
         */
    public static void main(String[] args) {


        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        WebElement webElement = driver.findElement(By.className("login-btn"));

        String actualText = webElement.getText();
        String expectedText = "Reset password";

        if (actualText.equals(expectedText)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        driver.quit();







    }
}
