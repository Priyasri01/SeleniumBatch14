package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomeWork01 {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        //find the desire element
       WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//need action class to perform rightclick
        Actions action = new Actions(driver);

        //inorder to perform right click we have to use contextclick() method and pass the desire element inside ().
        action.contextClick(rightclick).perform();

     WebElement editBtn  =driver.findElement(By.xpath("//span[text()='Edit']"));
     editBtn.click();
     Alert alert=driver.switchTo().alert();
     alert.accept();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           e.getStackTrace();
        }


        WebElement douClickBtn  =driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

        //using action class to perform the double class
        Actions action2 = new Actions(driver);
       action2.doubleClick(douClickBtn).perform();

       alert.accept();

        TakesScreenshot ss   =(TakesScreenshot)driver;

        File sourceFile  = ss.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile,new File("ss/myscreenshot/class11.png"));
        } catch (IOException e) {
           e.getStackTrace();
        }


    }
}
