package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //using tag & id combination both line 18&19 will give same output
       // driver.findElement(By.cssSelector("input#email")).sendKeys("priyasri"); //since tag is optional , we removed .
       // driver.findElement(By.cssSelector("#email")).sendKeys("priyasri");

        //using tag & class combination both line 23&24 will give same output
        //note the same class name available for the multiple elements, since we used only findElement not as findElements. so  the html will select the frist elements.
       // driver.findElement(By.cssSelector("input.inputtext" )).sendKeys("priyasri");
      driver.findElement(By.cssSelector(".inputtext" )).sendKeys("priyasri"); //since tag is optional , we removed .

        //Tag,class & Attribute combination
        driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("abc@123");

        //Tag & Attributescombination both line 27&28 will give same output
        //driver.findElement(By.cssSelector("a[rel=async]")).click();
        driver.findElement(By.cssSelector("[rel=async]")).click();//since tag is optional , we removed .


//use contains, when the value is long, using a short version of it to get it
    }
}
