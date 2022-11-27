package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//goto amazon
        driver.get("http://amazon.com/");
       //find the element
       WebElement enHover=driver.findElement(By.xpath("//div[text()='EN']"));

       /*About Action class: action class is used in selenium to perform mouse and keyBoard Operation,
        by using there methods like(perform(),dragAndDrop(),moveToElment(),clickAndHold(),click(),sendKeys() and so on */

        Actions action= new Actions(driver);

        action.moveToElement(enHover).perform(); /*note inside the move method we have to pass the desire element(variable)
         and ones we selected the mehtod & pass the variable then we have to call the perform method  in order to execute the code*/


    }
}
