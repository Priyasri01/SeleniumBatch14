package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCommandDemo1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.amazon.com/s?k=online+shopping+prime&gclid=CjwKCAjwh4ObBhAzEiwAHzZYU4RRVtBZ9AwnaDk2Qys");
        driver.manage().window().maximize();

        String str=driver.findElement(By.linkText("Amazon Home")).getText();
        System.out.println(str);
        Thread.sleep(2000);
        driver.findElement(By.linkText("New Releases")).click();
    }
}
