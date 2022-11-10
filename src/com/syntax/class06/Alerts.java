package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {


        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
     //  goto syntax project /checkbox demo
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
    //  maximize
        driver.manage().window().maximize();

        //find the button click me for the alert and click on it.
      WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
      simpleAlert .click();
      Thread.sleep(3000);
      //Handling the simple Alert
        Alert simpleAlert1 = driver.switchTo().alert(); //switch focus to alert page
        simpleAlert1.accept(); // since it's simple alert  we just accepted, because we don't have another choice than accept.

        //find the button for confirmation alert and click on it.
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();

        ///Handling the confirmation Alert
        Alert confirmationAlert1 = driver.switchTo().alert(); //Switch focus to Alert confirmation page
        confirmationAlert1.dismiss();// since it's confirmation alert, we have two choice either we have to accept or we dismiss. based on the requirement we can use it

        //find the button prompt alert and click on it.
          WebElement PromptAlert   = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
          PromptAlert.click();
          //Handling prompt alert
        Alert PromptAlert1= driver.switchTo().alert();//Switch focus to Prompt Alert page
        PromptAlert1.sendKeys("abradabra"); // since it's prompt alert, we don't have any choice we have to send a text and we have to accept inorder to close the alert page
        simpleAlert1.accept();




    }
}
