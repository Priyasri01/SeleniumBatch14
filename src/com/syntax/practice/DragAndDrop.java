package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");

        //switch the focus to the frame
        driver.switchTo().frame(0);

        WebElement dragElement=driver.findElement(By.xpath("//div[@id='draggable']"));

      WebElement dropLocation =driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);

       //action.dragAndDrop(dragElement,dropLocation).perform(); //we need to drap and drop operation, so we can do with the help of Action class.

        /*note: the same thing(line 35) we can  do in another way how we manualy do in mouse  like click&hold the  dragable element
         and move to drop location and release the  element in line 38 and note: when we chain multiple method together,
         we have to use another method called .build() which is going to actually combine all of  them and after that we use perform */

        action.clickAndHold(dragElement).moveToElement(dropLocation).release().build().perform();
    }
}
