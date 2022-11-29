package com.cydeo.test.day5_find_elements;

import com.cydeo.test.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioBtnAllElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> radioBtn = driver.findElements(By.xpath("//input[@name='sport']"));
        for (WebElement each : radioBtn) {
            Thread.sleep(3000);
            each.click();
        }
        System.out.println("radioBtn.size() = " + radioBtn.size());

        driver.quit();












    }
}
