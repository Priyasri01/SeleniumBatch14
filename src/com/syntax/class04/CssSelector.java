package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        driver.manage().window().maximize();
        //in line 19, we are find the elements and  performing action.
        //driver.findElement(By.cssSelector("input[placeholder *='Please enter']")).sendKeys("priyas");

        //in line 22  we are find the elements and store in variable . and in line 23 we're performing the action by calling send key method.
      WebElement textbox= driver.findElement(By.cssSelector("input[placeholder *='Please enter']"));//*= Means partial attribute value
      textbox.sendKeys("priyas");


      //press the button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick*='show']"));
        button.click();



    }
}
