package com.cydeo.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    /*
    1. Create a new class called BrowserUtils
    2. Create a method to make Multiple Windows logic re-usable
    3. When method is called, it should switch window and verify
    title.


    Method info:
    • Name: switchWindowAndVerify
    • Return type: void
    • Arg1: WebDriver
    • Arg2: String expectedInUrl
    • Arg3: String expectedTitle

     */
    public static void switchWindow(WebDriver driver, String expectedInUrl, String expectedTitle) {

        Set<String> setAllWindows = driver.getWindowHandles();

        for (String eachWindow : setAllWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Verification is failed!");


        }
    }
}
