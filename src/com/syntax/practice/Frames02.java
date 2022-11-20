package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames02 {
    public static void main(String[] args) {

 /*   1.check the checkBox
        2.Select BabyCat from drop dwon
        3. Send text in text box "DONE"
                */

        // set the path to the driver to link it with our class (note: on mac u dont need ".exe" on windows u need ".exe")
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntax project /checkbox demo
        driver.get("https://chercher.tech/practice/frames");
//        maximize
        driver.manage().window().maximize();

      driver.switchTo().frame("frame1");
      driver.switchTo().frame(0);
      WebElement checkBox=driver.findElement(By.id("a"));
      checkBox.click();

      driver.switchTo().defaultContent();

    WebElement webElement=  driver.findElement(By.xpath("//iframe[@id='frame2']"));

    driver.switchTo().frame(webElement);






      ///////input[@id='a']
    }
}
