package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Frames {
    public static void main(String[] args) {

                // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
                System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
                // create a WebDriver instance
                WebDriver driver= new ChromeDriver();
//        goto syntax project /checkbox demo
                driver.get("https://chercher.tech/practice/frames");
//        maximize
                driver.manage().window().maximize();

                //Task 1: print the animals on the screen and Select baby cat form the drop down.

        driver.switchTo().frame(1);
        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
            String text= animalText.getText();
        System.out.println(text);
        WebElement animalList = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel = new Select(animalList);

       List<WebElement> list =sel.getOptions();

       for(WebElement li:list){

           //find the desire one
         String pet = li.getText();

         if(pet.equalsIgnoreCase("Baby Cat")){

             li.click();

             System.out.println(pet);

             break;
         }
       }
//switch back to main page
       driver.switchTo().defaultContent();
//switch back to fram by using id
        driver.switchTo().frame("frame1");

        WebElement input = driver.findElement(By.xpath("//input"));
        input.sendKeys("aofsf");

        //switch back to inner fram by using web element.

        WebElement web = driver.findElement(By.xpath("//iframe[@data-ezsrc='checkbox.html']"));

       driver.switchTo().frame(web);

     WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
     checkBox.click();

            }
}
