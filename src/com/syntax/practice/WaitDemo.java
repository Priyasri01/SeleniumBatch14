package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance

        WebDriver driver= new ChromeDriver();

     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

//        goto syntax project /checkbox demo
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//        maximize
        driver.manage().window().maximize();

       WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'Change Text to Selenium')]"));

       button1.click();

       WebElement webDriverText= driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        System.out.println(webDriverText.getText());


        WebElement button2= driver.findElement(By.xpath("//button[@id='display-other-button']"));

        button2.click();

        //need explicit wait

        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));

      WebElement visible=  driver.findElement(By.xpath("//button[@id='hidden']"));
      visible.click();


    }
}
