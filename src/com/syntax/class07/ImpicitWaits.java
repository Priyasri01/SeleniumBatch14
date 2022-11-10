package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImpicitWaits {
    public static void main(String[] args) {
        /*
        Synchronization basically, if your element appears in the Dom and in the UI at the same time ,
        but if it appears in the Dom and takes time to appear in the UI the they are not synced
         */
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //  goto syntax gmial sin
        driver.get("https://www.facebook.com/");
        //  maximize
        driver.manage().window().maximize();
         WebElement createNewAcct= driver.findElement(By.xpath("//a[text()='Create new account']"));
    createNewAcct.click();

     WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
     firstName.sendKeys("acgd");
    }
}
