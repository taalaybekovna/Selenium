package com.cydeo.test.day17_pom;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Action_POM_Practices {

    @Test
    public void drag_and_drop_test(){
    // 2. Go to: https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

    //3. Click and hold small circle

    //4. Move it on top of the big circle

    //5. And release on it.
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle, bigCircle).perform();
        actions.moveToElement(smallCircle).clickAndHold().moveToElement(bigCircle).release().perform();

    //6. Verify “You did great!” text appears on big smallCircle
        Assert.assertEquals(bigCircle.getText(), "You did great!");
        Driver.closeDriver();

    }
}
