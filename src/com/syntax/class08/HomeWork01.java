package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeWork01 {
    public static void main(String[] args) {

        /*
        go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
         */

        // set the path to the driver to link it with our class (note: on mac u dont need ".exe" on windows u need ".exe")
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        goto syntax project /checkbox demo
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//        maximize
        driver.manage().window().maximize();

       WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
       checkBox.click();
       WebElement removeBt=driver.findElement(By.xpath("//button[text()='Remove']"));
       removeBt.click();

       //pass explict wait


        //"//p[contains(text(), 'gone!')]")); & //p[text()= "It's gone!"]   ---> this will work too.
       WebElement text =driver.findElement(By.xpath("//p[@id='message']"));
       String visibleText = text.getText();
        System.out.println(visibleText);



    }
}
