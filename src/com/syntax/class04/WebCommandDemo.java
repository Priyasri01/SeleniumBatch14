package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCommandDemo {

    public static void main(String[] args) throws InterruptedException {

        //1.launch the chrome Browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        //2.open the url
       //driver.get("https://www.amazon.com/s?k=online+shopping+prime&gclid=CjwKCAjwh4ObBhAzEiwAHzZYU4RRVtBZ9AwnaDk2Qys");
driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //3.maxmize the page
        driver.manage().window().maximize();

        //Enter username and password
        driver.findElement(By.id("txtUsername")).sendKeys("Priya");
        driver.findElement(By.id("txtPassword")).sendKeys("abc@123");
        Thread.sleep(2000);

        //clear the username and password
        driver.findElement(By.id("txtUsername")).clear();
        driver.findElement(By.id("txtPassword")).clear();

        // click login
        driver.findElement(By.id("btnLogin")).click();

    }
}
