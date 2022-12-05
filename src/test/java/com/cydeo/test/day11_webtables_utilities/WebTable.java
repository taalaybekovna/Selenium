package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTable extends TestBase {
    @Test
    public void orderName(){
        /*
     1. Go to: https://practice.cydeo.com/web-tables
    2. Verify Bob’s name is listed as expected.
    Expected: “Bob Martin”
    3. Verify Bob Martin’s order date is as expected: 12/31/2021

         */
        driver.get("https://practice.cydeo.com/web-tables");

        WebElement name = driver.findElement(By.xpath("//table[@class='SampleTable']//tr/td[.='Bob Martin']"));

        String actualText = name.getText();
        String expectedText = "Bob Martin";

        Assert.assertEquals(actualText, expectedText, "Text did not appear");

        WebElement date = driver.findElement(By.xpath("//table[@class='SampleTable']//tr/td[.='Bob Martin']/following-sibling::td[3]"));

        String actualDate = date.getText();
        String expectedDate = "12/31/2021";

        Assert.assertEquals(actualDate, expectedDate, "Date did not appear");

        

    }
}
