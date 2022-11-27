package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class calenderPagination {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

      WebDriver driver = new ChromeDriver();

      driver.manage().window().maximize();

      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      driver.get("https://www.delta.com/");

    WebElement calTab =driver.findElement(By.xpath("//span[@class='calenderDepartSpan']"));

    calTab.click();

    WebElement month=driver.findElement(By.xpath("dl-datepicker-month-0"));

    boolean isFound = false;

    while(!isFound){

       String monthName= month.getText();


        if(monthName.equalsIgnoreCase("8")){
            System.out.println("found it");
            isFound=true;
            break;

        }else{

           WebElement nextBut =driver.findElement(By.xpath("//span[text()='Next']"));
           nextBut.click();
        }

    }


    }
}
