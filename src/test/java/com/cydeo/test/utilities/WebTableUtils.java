package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
    /*
    1. Create a new class called WebTableUtils.
    2. Create two methods to verify order


    Method #1 info:
    • Name: returnOrderDate ()
    • Return type: String
    • Arg1: WebDriver driver
    • Arg2: String costumerName
    This method should accept a costumerName and return the costumer order date
    as a String.
         */

    public static String returnOrderDate(WebDriver driver, String CustomerName){

        String locator = "//td[.='"+ CustomerName +"']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();

    }

    public static String returnOrderDate2(WebDriver driver, String CustomerName){

        return driver.findElement(By.xpath("//td[.='\"+ CustomerName +\"']/following-sibling::td[3]")).getText();

    }

    /*
        Method #2 info:
    • Name: orderVerify ()
    • Return type: void
    • Arg1: WebDriver driver
    • Arg2: String costumerName
    • Arg3: String expectedOrderDate
    This method should accept above-mentioned arguments and internally assert
    expectedOrderDate matching actualOrderDate.

     */

    public static void orderVerify (WebDriver driver, String costumerName, String expectedOrderDate){

        String locator = "//td[.='"+ costumerName +"']/following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        Assert.assertEquals(customerDateCell.getText(), expectedOrderDate);
    }
}
