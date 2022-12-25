package com.cydeo.test.day9_iframe;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Iframe_practice extends TestBase {
    /*
    1- Open a Chrome browser
    2- Go to: https://practice.cydeo.com/iframe
    3- Clear text from comment body
    4- Type "Hello World" in comment body
    5- Verify "Hello World" text is written in comment body
    6- Verify header "An iFrame containing the TinyMCE
    WYSIWYG Editor" is displayed
     */

    @Test
    public void helloWorld() throws InterruptedException {
        driver.get("https://practice.cydeo.com/iframe");

        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        Thread.sleep(3000);

        WebElement body = driver.findElement(By.id("tinymce"));
        body.clear();

        body.sendKeys("Hello World");
        assertEquals(body.getText(), "Hello World");

        driver.switchTo().defaultContent();
       // or you can use -> driver.switchTo().parentFrame();

        WebElement header = driver.findElement(By.tagName("h3"));
        assertTrue(header.isDisplayed());

        String actual = header.getText();
        String expected = "An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertEquals(actual, expected, "text did not verify");



    }

}
