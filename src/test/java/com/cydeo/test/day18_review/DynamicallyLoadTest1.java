package com.cydeo.test.day18_review;

import com.cydeo.pages.Dynamically_Loaded_page_1;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicallyLoadTest1 {
    @Test
    public void dynamicallyLoadTest(){
        //    1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        Dynamically_Loaded_page_1 dynamically_loaded_page_1 = new Dynamically_Loaded_page_1();

        //2. Click to start
        dynamically_loaded_page_1.startBtn.click();

        //3. Wait until loading bar disappears
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 50);
        wait.until(ExpectedConditions.invisibilityOf(dynamically_loaded_page_1.loadingBar));


        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamically_loaded_page_1.username.isDisplayed());

        //5. Enter username: tomsmith
        dynamically_loaded_page_1.username.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamically_loaded_page_1.password.sendKeys("incorrectpassword");

        //7. Click to Submit button
        dynamically_loaded_page_1.submitBtn.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamically_loaded_page_1.errorSign.isDisplayed());


    }

}
