package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcde");
      //  driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

    }
}
