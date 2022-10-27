package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1

{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
        //tag & id combination , tag and id always seperate with #
       // driver.findElement(By.cssSelector("input#email")).sendKeys("priyasri");
       // only with id , since tag is optional. both line 22 & 24 will provide the same out put.
        //driver.findElement(By.cssSelector("#email")).sendKeys("priyasri");

        //tag & class combination.tag and class  always seperate with .
        //Both line 28 & 29 will provide the same out put.
       // driver.findElement(By.cssSelector("input.inputtext")).sendKeys("priyasri"); //note the same class name available for the multiple emlements, since we used only findElement not as findElements. so  the html will select the frist elements.
      //  driver.findElement(By.cssSelector(".inputtext")).sendKeys("priyasri");

        //tag & attributes combination. tag and attribute always seperate with[]
      //  driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Priya");
        //only with attribute

        driver.findElement(By.cssSelector("[name=email]")).sendKeys("Priya");

        //tag& class & attributes
        driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("123@abc");





    }
}
