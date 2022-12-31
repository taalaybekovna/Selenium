package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dynamically_Loaded_page_1 {

    public Dynamically_Loaded_page_1() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath="//button[.='Start']")
        public WebElement startBtn;

    @FindBy(id = "Loading... ")
    public WebElement loadingBar;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "pwd")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy(id = "flash")
    public WebElement errorSign;

}
