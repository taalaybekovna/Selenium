package com.cydeo.test.day5_find_elements;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElements {
    /*
    1- Open a Chrome browser
    2- Go to: https://practice.cydeo.com/abtest
    3- Locate all the links in the page.
    4- Print out the number of the links on the page.
    5- Print out the texts of the links.
    6- Print out the HREF attribute values of the links

     */
    public static void main(String[] args) {

        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        System.out.println("webElements.size() = " + webElements.size()); // webElements.size() = 2

        for (WebElement webElement : webElements) {
            System.out.println("Text of each link = " + webElement.getText());
            System.out.println("Href values = " + webElement.getAttribute("href"));
        }


    }
}
