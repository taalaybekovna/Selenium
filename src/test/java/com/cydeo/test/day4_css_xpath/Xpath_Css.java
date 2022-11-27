package com.cydeo.test.day4_css_xpath;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_Css {
    public static void main(String[] args) {
        /*
        1. Open Chrome browser
    2. Go to https://practice.cydeo.com/forgot_password
    3. Locate all the WebElements on the page using XPATH and/or CSS
    locator only (total of 6)
    a. “Home” link
    b. “Forgot password” header
    c. “E-mail” text
    d. E-mail input box
    e. “Retrieve password” button
    f. Powered by Cydeo text
    4. Verify all web elements are displayed.
         */

        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement homeBtn = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement password = driver.findElement(By.cssSelector("div[class='example']>h2"));
        WebElement emailBtn = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailInput = driver.findElement(By.name("input[name='email']"));
        WebElement retrievePass = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        WebElement cydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        System.out.println("homeBtn.isDisplayed() = " + homeBtn.isDisplayed());
        System.out.println("password.isDisplayed() = " + password.isDisplayed());
        System.out.println("emailBtn.isDisplayed() = " + emailBtn.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("retrievePass.isDisplayed() = " + retrievePass.isDisplayed());
        System.out.println("cydeoText.isDisplayed() = " + cydeoText.isDisplayed());

        driver.close();


    }
}
