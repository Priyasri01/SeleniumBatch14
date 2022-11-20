package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the demoqa Alerts
        driver.get("https://demoqa.com/alerts");

//        click on the button
                WebElement alertBtn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertBtn1.click();
        Thread.sleep(2000);
//Assign reference varaible "Alert1"  so that we can reuse it in the code alert interface
        Alert Alert1 = driver.switchTo().alert();
        Alert1.accept();

//     alert btn 3
        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertBtn3.click();

//   reusing the alert already declared in line item 24. it is possible to reuse it because in every web page will have single alert page at time.
//   and also we store the general syntax which is used to switch the control from current page to alert page (driver.switchTo().alert();). so can we reuse it multiple of times
        Alert1.sendKeys("abracadbra");
        Alert1.accept();

    }
}

