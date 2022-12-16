package com.cydeo.test.day14_driverUtil_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {
    @Test
    public void java_faker_test(){

        // Java faker is for random fake tests
        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.numerify(\"### ### ####\") = " + faker.numerify("### ### ####"));
        System.out.println("faker.numerify(\"610 ### 9088\") = " + faker.numerify("610 ### 9088"));
        System.out.println("faker.letterify(\"????????????????????\") = " + faker.letterify("????????????????????"));
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard().replaceAll(\"-\", \"\") = " + faker.finance().creditCard().replaceAll("-", ""));
        System.out.println("faker.bothify(\"### ????? ####\") = " + faker.bothify("### ????? ####"));
        System.out.println("faker.chuckNorris() = " + faker.chuckNorris());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\", \"Muezza\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muezza"));
    }
}
