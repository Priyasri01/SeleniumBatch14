package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {

    public static void main(String[] args) {
        // //  set the path to the driver to link it with our class. and note on mac u dont need '.exe' on windows u need '.exe'
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //Create a webDriver instance
        WebDriver driver = new ChromeDriver();
        //go to ebay
        driver.get("https://www.ebay.com/");
        //maximize the window
        driver.manage().window().maximize();

     //  get all the links i.e anchor tags from the website

        List<WebElement> ebayLinks=driver.findElements(By.tagName("a")) ;

        System.out.println(ebayLinks.size());

        for(WebElement ebayLink:ebayLinks){

           String link = ebayLink.getAttribute("href");

            System.out.println(link);



        }


    }
}
