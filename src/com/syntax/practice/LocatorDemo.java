package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

    public static void main(String[] args) throws InterruptedException {

        //Launch browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Go to the webpage
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        //id & name locator
        WebElement webelement =driver.findElement(By.id("search_query_top"));
        webelement.sendKeys("T-shirt");


        Thread.sleep(5000);
        driver.findElement(By.name("submit_search")).click();

        //linktext and partial linktext

    driver.findElement(By.linkText("Printed Chiffon Dress")).click();
    Thread.sleep(5000);
    driver.navigate().back();
    driver.findElement(By.partialLinkText("Faded Short Sleeve")).click();
    driver.navigate().back();
    driver.navigate().back();
    //line 38 used to find web elements by using className locator
//note passing the className value as "homeslider-container" .beucause when we look for multiple elements then we have to take value which are common among all the className value.
        int sliders= driver.findElements(By.className("homeslider-container")).size();//find elements is method will return multiple webelements or empty list if nothing matching.

        System.out.println(sliders);

        //line  used to find web elements by using tagName locator.. find out how many links available on the webpage.

      int links= driver.findElements(By.tagName("a")).size();
        System.out.println(links);
        driver.quit();
    }
}
