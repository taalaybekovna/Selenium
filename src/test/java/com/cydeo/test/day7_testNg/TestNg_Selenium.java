package com.cydeo.test.day7_testNg;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNg_Selenium {

    WebDriver driver; // making global, so each @Test run

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method is running");
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method is running");
        driver.quit();
    }
    @Test

    public void facebookTitle(){
        driver.get("https:www.facebook.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";

        Assert.assertEquals(actualTitle, expectedTitle, "This is facebook title");

    }

    @Test
    public void youtubeTitle(){
        driver.get("https:www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "YouTube";

        Assert.assertEquals(actualTitle, expectedTitle, "This is Youtube title");
    }

    @Test
    public void akipressTitle(){
        driver.get("https:www.akipress.org");
        String actualTitle = driver.getTitle();
        String  expectedTitle = "АКИpress: новости Кыргызстана и Центральной Азии, события, бизнес, базы данных, справочники, информация о Кыргызстане";

        Assert.assertEquals(actualTitle, expectedTitle, "This is Akipress title");
    }
}
