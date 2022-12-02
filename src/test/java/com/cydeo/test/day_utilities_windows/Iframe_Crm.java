package com.cydeo.test.day_utilities_windows;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe_Crm extends TestBase {
    /*
        2- Go to:  https://login2.nextbasecrm.com/
    3- Login Homepage ( Login with valid username and
    password)
    4- Click the MORE tab and select APPRECIATION
    5- Write an Appreciation message
    6- Click the SEND button
    7- Verify the Appreciation message is displayed on
    the feed

     */

    @Test
    public void appreciation(){
        driver.get("https://login2.nextbasecrm.com/");

        WebElement userName = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        userName.sendKeys("helpdesk1@cybertekschool.com");

        WebElement password = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));
        loginBtn.click();
    }

}
