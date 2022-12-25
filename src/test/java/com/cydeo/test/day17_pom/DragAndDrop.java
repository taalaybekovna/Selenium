package com.cydeo.test.day17_pom;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {
    @Test
    public void drag_and_drop(){
    // 2. Go to: https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();

    //3. Verify expected default text appears on big circle
        //   Expected = "Drag the small circle here."

        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Drag the small circle here.");

    }

    @Test
    public void drop_here_text(){

    //  2.  Go to: https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();

    //3. Click and hold small circle
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeoPracticePage.smallCircle).clickAndHold().pause(2000).moveByOffset(100, 0).pause(2000).perform();


    //4. Verify "Drop here." text appears on big circle
        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Drop here.");

    }
}

