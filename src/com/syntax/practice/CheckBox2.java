package com.syntax.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {
    public static void main(String[] args) {
       // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntax project /checkbox demo
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
//        maximize
        driver.manage().window().maximize();



    }
}

