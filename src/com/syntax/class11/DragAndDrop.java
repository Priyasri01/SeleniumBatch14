package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://jqueryui.com/droppable/");

//        switch the focus to the iframe
        driver.switchTo().frame(0);

//        dragable
        WebElement dragableElement = driver.findElement(By.xpath("//div[@id='draggable']"));
//        drop location
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action= new Actions(driver);

     //  action.dragAndDrop(dragableElement,dropLocation).perform();
 /*note: the same thing(line 35) we can  do in another way how we manualy do in mouse  like click&hold the  dragable element
         and move to drop location and release the  element in line 38 and note: when we chain multiple method together,
         we have to use another method called .build() which is going to actually combine all of  them and after that we use perform */
        action.clickAndHold(dragableElement).moveToElement(dropLocation).release().build().perform();

    }

    }


