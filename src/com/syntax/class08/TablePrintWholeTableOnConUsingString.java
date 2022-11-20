package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TablePrintWholeTableOnConUsingString {

    public static void main(String[] args) {
        // set the path to the driver to link it with our class (note: on mac u dont need ".exe" on windows u need ".exe")
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        goto syntax project /checkbox demo
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
//        maximize
        driver.manage().window().maximize();

        //Task: Print the whole table on the console
//note in here we store all data in one  stirng  , so, it' treat the whole data as single string . so  we have to have too much logic in here inorder to get  specify data from row or coloumn. so this is not a good approach.

       WebElement alltable= driver.findElement(By.xpath("//table[@id='customers']")); // This xpath is at the table level . because it doesn't give row or coloumn. rather it will give as whole table.
       String alltableText =alltable.getText();
        System.out.println(alltableText);
    }
}
