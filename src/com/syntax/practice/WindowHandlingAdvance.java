package com.syntax.practice;

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
//        goto syntax gmial sin
        driver.get("http://accounts.google.com/signup");
//        maximize
        driver.manage().window().maximize();

        WebElement helpBtn =driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacy=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();
/*my title of my desired page is "Google Account Help"---> this tile i getting manually(by just going to the page
insecpt under DOM 1)cntrl+f 2) typed "//title" copied the title and paste it here */
        Set<String> allWindow=driver.getWindowHandles();

        for(String handle:allWindow){

            driver.switchTo().window(handle);
            String title =driver.getTitle();

            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println("the current page under focus is");
                break;
            }
        }

      WebElement comm=  driver.findElement(By.xpath("//a[text()='Community']"));
        comm.click();

    }
}
