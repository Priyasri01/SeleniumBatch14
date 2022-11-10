package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        //       set a path to the diver to link it our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the fb.com
        driver.get("https://www.facebook.com/");

        WebElement creatAct = driver.findElement(By.xpath("//a[contains(text(),'Create new ')]"));
        creatAct.click();
        Thread.sleep(300);

      WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));

        Select sel = new Select(month);
       sel.selectByIndex(4);
        //sel.selectByVisibleText("Aug");
        sel.selectByValue("9");

    WebElement day  = driver.findElement(By.xpath("//select[@name='birthday_day']"));

    Select selq = new Select(day);
   selq.selectByVisibleText("25");

 List<WebElement> allMonths = sel.getOptions();

 //note both loops will work
 /*for(int i=0; i<allMonths.size();i++){
    String months = allMonths.get(i).getText(); //getText(), will return the visible text of this elements
     System.out.println(months);
 }*/
        for(WebElement mon:allMonths){

           String months= mon.getText();

            System.out.println(months);
        }



    }
}
