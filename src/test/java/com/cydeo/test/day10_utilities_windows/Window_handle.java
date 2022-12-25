package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Window_handle extends TestBase {

    /*
    2. Go to : https://practice.cydeo.com/windows
    3. Assert: Title is “Windows”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
     */
    @Test
    public void widowHandle(){
        driver.get("https://practice.cydeo.com/windows");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not verify");

        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowsHandles) {  // use shortcut -> variable name which is - (allWindowsHandles.iter) and enter
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "New Window";

        Assert.assertEquals(actualTitle2, expectedTitle2, "Title did not appear");


    }

}
