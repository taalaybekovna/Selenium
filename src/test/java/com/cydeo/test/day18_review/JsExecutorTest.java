package com.cydeo.test.day18_review;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JsExecutorTest {
    @Test
    public void jsExecutorTest() throws InterruptedException {
        // Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,750)"); // window.scrollBy(x,/y)


    //        Thread.sleep(3000);
    //        js.executeScript("window.scrollBy(0,750)");
    //        Thread.sleep(3000);
    //        js.executeScript("window.scrollBy(0,750)");
    //        Thread.sleep(3000);
    //        js.executeScript("window.scrollBy(0,750)");
    //        Thread.sleep(3000);
    //        js.executeScript("window.scrollBy(0,750)");
    //        Thread.sleep(3000);
    //        js.executeScript("window.scrollBy(0,750)");


        //        a.  750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,750)"); // window.scrollBy(x,y)
        }



        //                b.  750 pixels up 10 times

        for(int i=0; i<10; i++){

            //Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,-750)"); // window.scrollBy(x,y)

        }

        Driver.getDriver().close();
    }
}
