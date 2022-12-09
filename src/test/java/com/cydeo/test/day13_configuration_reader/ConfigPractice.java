package com.cydeo.test.day13_configuration_reader;

import com.cydeo.base.TestBase;
import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ConfigPractice extends TestBase {
    @Test
    public void login(){
        // Go to : https://login1.nextbasecrm.com/
        //driver.get("https://login1.nextbasecrm.com/");
        driver.get(ConfigurationReader.getProperty("env"));

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
       // inputUsername.sendKeys("helpdesk1@cybertekschool.com");
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

       // 6. Verify title is as expected:
        //    Expected: Portal
       // BrowserUtils.verifyTitle(driver, "(1) Portal");


    }

     //Enter valid username
    // //inputUsername.sendKeys("hr1@cydeo.com");
    // 4. Enter valid password
    // //inputPassword.sendKeys("UserUser");
    //5. Click to Log In button
    //
    // BrowserUtils.verifyTitle(driver,"(1) Portal");

}
