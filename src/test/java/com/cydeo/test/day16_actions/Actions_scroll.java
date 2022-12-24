package com.cydeo.test.day16_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_scroll {
    @Test
    public void scroll_test(){
    //        2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get(ConfigurationReader.getProperty("practice.page.url"));

    //3- Scroll down to “Powered by CYDEO”
        WebElement cydeo = Driver.getDriver().findElement(By.linkText("CYDEO"));
    //4- Scroll using Actions class “moveTo(element)” method
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeo).perform();
    //        1- Continue from where the Task 4 is left in the same test.
            WebElement home = Driver.getDriver().findElement(By.linkText("Home"));
    //2- Scroll back up to “Home” link using PageUP button
        // how many times of using Keys.PAGE_UP depends on how long is your web page
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();


    }
}
