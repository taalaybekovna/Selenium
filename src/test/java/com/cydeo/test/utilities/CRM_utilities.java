package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_utilities {
    /*
        1. Create a new method for login
    2. Create a method to make CRM Login test logic re-usable
    3. When method is called, it should simply log in

    This method should have at least 2 overloaded versions.

    Method #1 info:
    • Name: login_crm()
    • Return type: void
    • Arg1: WebDriver

         */

    public static void crm_login(WebDriver driver) {

        WebElement userName = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        userName.sendKeys("helpdesk1@cybertekschool.com");

        WebElement password = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));
        loginBtn.click();

    }

    /*
    Method #2 info:
    • Name: login_crm()
    • Return type: void
    • Arg1: WebDriver
    • Arg2: String username
    • Arg3: String password
     */

    public static void crm_login(WebDriver driver, String userName, String password) {

        WebElement userName2 = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        userName2.sendKeys(userName);

        WebElement password2 = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        password2.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));
        loginBtn.click();


    }
}
