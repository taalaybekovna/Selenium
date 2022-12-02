package com.cydeo.test.day_utilities_windows;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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

        WebElement moreBtn = driver.findElement(By.xpath("//span[contains(@id,'link-text')]"));
        moreBtn.click();

        WebElement appreciationBtn = driver.findElement(By.xpath("//span[.='Appreciation']"));
        appreciationBtn.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
        driver.findElement(By.tagName("body")).sendKeys("hello");
        driver.switchTo().parentFrame();

        WebElement sendBtn = driver.findElement(By.xpath("//div[starts-with(@id,'blog_post_body')]"));
        String actualText = sendBtn.getText();
        String expectedText = "Hello!";
        Assert.assertEquals(actualText,expectedText,"Feed message did not appear correctly!");



    }

}
