package com.cydeo.test.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //  driver.get("https:mail.ru");
        driver.navigate().to("https:www.mail.ru"); //  driver.get("https:mail.ru"); these two are same
        driver.navigate().back(); // goes back
        Thread.sleep(3000);
        driver.navigate().forward(); // goes forward
        Thread.sleep(3000);
        driver.navigate().refresh(); // refreshes
        System.out.println("driver.getTitle() = " + driver.getTitle()); // Mail.ru: почта, поиск в интернете, новости, игры
        //String getTitle = driver.getTitle();
        driver.get("https:www.akipress.org");
        String  getTitle = driver.getTitle();
        System.out.println("getTitle = " + getTitle); // getTitle = АКИpress: новости Кыргызстана и Центральной Азии,
        // события, бизнес, базы данных, справочники, информация о Кыргызстане
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.close(); // closes the page
    }
}
