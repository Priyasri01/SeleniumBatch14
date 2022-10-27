package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {
    public static void main(String[] args) throws InterruptedException {
        /*
        navigate to fb.com
click on create new account
fill up all the textboxes

close the pop up
close the browser
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
      Thread.sleep(2000); //page doesn't load till that point, so tha't why we put timer
        driver.findElement(By.name("firstname")).sendKeys("Priyasri");
        driver.findElement(By.name("lastname")).sendKeys("Murugesan");
        Thread.sleep(9000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();



    }
}
