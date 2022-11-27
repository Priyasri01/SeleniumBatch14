package com.syntax.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JsExecutorScroll {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://amazon.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window. scrollBy(0,500)"); //if u want to know the command for the javascript just google it, like "java script command for scroll down web page";


    }
}
