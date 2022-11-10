package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticUser {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //to handle the Authentication alert
        //note in line item 12 we given only username admin since user password or same.
        // in case if it's different then we have to follow line 16.
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth//");
        //username:admin  & Password:password
        //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth////username:password@"

    }
}
