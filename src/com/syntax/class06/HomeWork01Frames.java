package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork01Frames {
    public static void main(String[] args) {
     /*   1.check the checkBox
        2.Select BabyCat from drop dwon
        3. Send text in text box "DONE"
                */

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntax project /checkbox demo
        driver.get("https://chercher.tech/practice/frames");
//        maximize
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");
        WebElement topic = driver.findElement(By.xpath("//input"));
        topic.sendKeys("Done");
        //switch to the inner frame by using webelement
      WebElement innerFrame  =driver.findElement(By.xpath("//iframe[@data-ezsrc='checkbox.html']"));
      driver.switchTo().frame(innerFrame);
      WebElement checkBox  =driver.findElement(By.xpath("//input[@id='a']"));
     checkBox.click();

     //back to main frame/Home Content
        driver.switchTo().defaultContent();

        //switch from main page to other frame by using index
       // driver.switchTo().frame(1);
        driver.switchTo().frame(1);

       WebElement text= driver.findElement(By.xpath("//b[text()='Animals :']"));
        String te= text.getText();
        System.out.println(te);

        WebElement drop = driver.findElement(By.xpath("//select[@id='animals']")) ;

       Select sele = new Select(drop);

        List<WebElement> animals =sele.getOptions();

        for(WebElement ani:animals){

          String pet = ani.getAttribute("value");

          if(pet.equalsIgnoreCase("babycat")){

              ani.click();
              System.out.println(pet);
              break;
          }
        }



    }
}
