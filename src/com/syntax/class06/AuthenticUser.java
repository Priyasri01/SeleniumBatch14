package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticUser {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //to handle the Authentication alert
        //note in line item 12 we given only username admin since user password or same.
        // in case if it's different then we have to follow line 16.
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth//");
        //username:admin  & Password:password
        //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth////username:password@"

    }

    public static class Alerts {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            // create a WebDriver instance
            WebDriver driver= new ChromeDriver();
    //        goto syntax gmial sin

            driver.get("https://demoqa.com/alerts");
    //        maximize
            driver.manage().window().maximize();

        WebElement simpleAlt = driver.findElement(By.xpath("//button[@id='alertButton']"));
        simpleAlt.click();


         Alert alert=driver.switchTo().alert();

         alert.accept();

        WebElement confirmAlt= driver.findElement(By.id("confirmButton"));
        confirmAlt.click();

        alert.dismiss();

        WebElement promtAlt= driver.findElement(By.id("promtButton"));

        promtAlt.click();

      Alert sentext= driver.switchTo().alert(); //instead of create new variable for  switch to "alert" we can simply call
            // the same variable which we created earlier  in here and pass the method it will work too(line 45 & 46).
            // it is possible becuase at time we will have only one alter in the webpage. so, it's possible to reuse.
      sentext.sendKeys("ABRCADRAME");
      sentext.accept();
      //alert.sendKeys("ABRCADRAME");
      //alert.accept();



        }
    }
}
