package com.cydeo.test.day14_driverUtil_javaFaker;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){

        if (word == null){

            System.out.println("Word object is null");
            word = "something";
        } else {
            System.out.println("Word has already assigned  and has value");
        }
        return word;
    }
}
