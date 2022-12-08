package com.cydeo.test.day12_properties;

import org.testng.annotations.Test;

public class LearningProperties {
    @Test

    public void java_properties() {
        // key value


        // System.getProperty("os.name") = Windows 10
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));

        // System.getProperty("user.name") = MSI GS76
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }
}