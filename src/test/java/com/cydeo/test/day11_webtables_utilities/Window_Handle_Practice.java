package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.base.TestBase;
import com.cydeo.test.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Window_Handle_Practice extends TestBase {
    /*
    2. Go to : https://www.amazon.com
    3. Copy and paste the lines from below into your class
    4. Create a logic to switch to the tab where Etsy.com is open
    5. Assert: Title contains “YouTube”
         */
    @Test
    public void windowHandleTest() {

        driver.get("https://www.akipress.org");

        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://mail.ru','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://youtube.com','_blank');");

        Set<String> setAllWindows = driver.getWindowHandles();

        for (String eachWindow : setAllWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("akipress")) {
                break;
            }

            String actualTitle = driver.getTitle();
            String expectedTitle = "mail";
            Assert.assertEquals(actualTitle, expectedTitle, "Verification is failed!");

            // BrowserUtils.switchWindow(driver, "akipress", "akipress");


        }

    }

}

