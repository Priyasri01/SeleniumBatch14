package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClass {


    public static class class11 {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.get("http://amazon.com/");

         WebElement enHover =driver.findElement(By.xpath("//div[text()='EN']"));

        Actions action =new Actions(driver);

        action.moveToElement(enHover).perform();

        }
    }
}
