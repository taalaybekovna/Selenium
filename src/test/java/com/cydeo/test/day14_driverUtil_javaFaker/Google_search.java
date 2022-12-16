package com.cydeo.test.day14_driverUtil_javaFaker;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google_search {
    @Test
    public void google_search(){
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf']"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        searchBox.sendKeys("apple" + Keys.ENTER);

        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        String expectedTitle = "apple - Google Search";

        Assert.assertEquals(actualTitle, expectedTitle, "Title did not appear");


    }
}
