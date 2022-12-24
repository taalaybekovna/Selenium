package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Action_hover_google {

    @Test
    public void action_google(){
        //1. Go to  https://www.google.com
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

        //2. Hover over on Search button
        //3. Hover over on Feeling Lucky button

        WebElement searchBtn = Driver.getDriver().findElement(By.xpath("/input[@id='gbqfbb']/preceding-sibling::input"));
        WebElement feelingLuckyBtn = Driver.getDriver().findElement(By.id("gbqfbb"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(searchBtn).perform();
        actions.moveToElement(feelingLuckyBtn).perform();





    }



}
