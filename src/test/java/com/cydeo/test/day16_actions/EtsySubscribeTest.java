package com.cydeo.test.day16_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtsySubscribeTest {

    @Test
    public void etsySubscribe(){
    // 1. Go to https://www.etsy.com
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));

    //2. Scroll down
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        // window.scrollBy(x, y)  ; x(right or left) stands for horizontal line and y stands for vertical line(up or down)
        js.executeScript("window.scrollBy(0, 5000)");

        WebElement email = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        js.executeScript("arguments[0].scrollIntoView(true)",email);

        //         Generate random email and enter into subscribe box
        //         Click on Subscribe
        Faker faker = new Faker();
        email.sendKeys(faker.internet().emailAddress() + Keys.ENTER);


//         Verify "Great! We've emailed you to confirm your subscription." is displayed
        WebElement resultMsg = Driver.getDriver().findElement(By.xpath("//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
        Assert.assertEquals(resultMsg.getText(),"Great! We've sent you an email to confirm your subscription.");

    }
}
