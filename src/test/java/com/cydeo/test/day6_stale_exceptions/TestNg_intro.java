package com.cydeo.test.day6_stale_exceptions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_intro {

    @Test
    public void test(){
        System.out.println("Testing is starting");
        String actual = "Muezza";
        String expected = "Muezza";
        Assert.assertEquals(actual, expected, "test passed");
    }
    @Test
    public void test2(){
        System.out.println("Testing is going on");
        Assert.assertEquals("Nookat", "Nookat");
    }
}
