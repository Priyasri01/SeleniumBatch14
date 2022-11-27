package com.syntax.class10;

import Util.ConfigRead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CalenderPagination {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        goto syntax project /checkbox demo
        driver.get("https://www.delta.com/");
//        maximize
        driver.manage().window().maximize();

        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));

        calander.click();

        //Task go to website and select March 20 -2022 from data.

        //        get the month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));

      boolean isFound = false; // since we didn't find desire method we given as false
        while (!isFound) {
            String monthText = month.getText();
            if (monthText.equalsIgnoreCase("March")) {
                List<WebElement> Dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
                for (WebElement date : Dates) {
                    String currentDate = date.getText();
                    if (currentDate.equalsIgnoreCase("20")) {
                        date.click();
                        break;
                    }

                }
                isFound = true;
            } else {

                nextBtn.click();
            }

        }

    }
}