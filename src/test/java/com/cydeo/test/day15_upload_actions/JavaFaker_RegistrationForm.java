package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JavaFaker_RegistrationForm {
    @Test
    public void registration_form(){

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        Faker faker = new Faker();

        WebElement firstName = Driver.getDriver().findElement(By.name("firstname"));
        firstName.sendKeys(faker.name().firstName());

        WebElement username = Driver.getDriver().findElement(By.name("username"));
        username.sendKeys(faker.name().username());

        WebElement email = Driver.getDriver().findElement(By.name("email"));
        email.sendKeys(faker.internet().emailAddress());

        faker.internet().password();

        faker.numerify("### ### ####");

        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();

        Select office = new Select(Driver.getDriver().findElement(By.xpath("/select[@name='department']")));
        office.selectByIndex(faker.number().numberBetween(1,9));

    }


}
