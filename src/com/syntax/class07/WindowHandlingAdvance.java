package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlingAdvance {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        //  goto syntax gmial sin
        driver.get("http://accounts.google.com/signup");
        //  maximize
        driver.manage().window().maximize();
       WebElement helpBut= driver.findElement(By.xpath("//a[text()='Help']"));
       helpBut.click();
        WebElement privacy= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        // the title of my desired page is    Google Account Help

//        get all the window handles
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
//            switching the focus to the current handle from list
            driver.switchTo().window(handle);
//            get the title of the window to which the driver has switched
            String title = driver.getTitle();

//            compare if the title is of the help
            if(title.equalsIgnoreCase("Google Account Help")){

                System.out.println("the current page under focus is :"+title);
                break;
            }

        }

        //find the communite button and click on it.

        WebElement communite  =driver.findElement(By.xpath("//a[text()='Community']"));

        communite.click();




    }

}
