package com.cydeo.test.day17_pom;

import com.cydeo.pages.Dynamically_Loaded_Page_Elements7;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicallyLoadTest {

    @Test
    public void dynamicallyLoadTest(){

    //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        Dynamically_Loaded_Page_Elements7 dynamically_loaded_page_elements7 = new Dynamically_Loaded_Page_Elements7();

    //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));


    //3. Assert: Message “Done!” is displayed.
        Assert.assertEquals(dynamically_loaded_page_elements7.doneMessage.getText(), "Done!");

    //4. Assert: Image is displayed.
    //Note: Follow POM
        Assert.assertTrue(dynamically_loaded_page_elements7.image.isDisplayed());

    }
}
