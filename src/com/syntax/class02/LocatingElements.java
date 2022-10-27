package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) throws InterruptedException {

        //got to FB.COM
        //E

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");
        //maximize  the  window
        driver.manage().window().maximize();

        //enter the username in textbox
        //1. locate the elements and send the keys

        driver.findElement(By.id("email")).sendKeys("abrcwde");
        driver.findElement(By.id("pass")).sendKeys("abc234");

        //click the login
     driver.findElement(By.name("login")).click();

     //in case if you need to check  the following task to work please make sure that you comment(meaning //)the login functionality line item 30.

        //task:2

        //click on forget password using linKktext

       // driver.findElement(By.linkText("Forgot password?")).click();

        //   in case if you need to check  the following task to work  please make sure to comment the task2 and login functionality line 30 & 38

        //task 3 click on forget password using partial linkText locator , teh partial linktext suppose to be around 30 to 40%
       // driver.findElement(By.partialLinkText("Forgot")).click();
 Thread.sleep(4000);
driver.quit();

    }
}
