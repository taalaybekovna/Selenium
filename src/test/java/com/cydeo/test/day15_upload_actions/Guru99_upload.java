package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru99_upload {
    @Test
    public void upload_file_test() throws InterruptedException {

        //1. Go to  “http://demo.guru99.com/test/upload”
        Driver.getDriver().get(ConfigurationReader.getProperty("guru99.upload.url"));

    //2. Upload file into Choose File
        WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
       chooseFile.sendKeys("C:\\Users\\MSI GS76\\Downloads\\some-file.txt");

    //3. Click terms of service check box

        WebElement terms = Driver.getDriver().findElement(By.id("terms"));
        terms.click();


    //4. Click Submit File button
        WebElement submitBtn = Driver.getDriver().findElement(By.id("submitbutton"));
        submitBtn.click();

    //5. Verify expected message appeared. Expected: “1 file

        WebElement message = Driver.getDriver().findElement(By.id("res"));
        String actualText = message.getText();
        String expectedText = "1 file\nhas been successfully uploaded.";
        Thread.sleep(3000);
        Assert.assertEquals(actualText, expectedText, "The text did not appear!");

    //has been successfully uploaded.

        Driver.closeDriver();



    }
}
