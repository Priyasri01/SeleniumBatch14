package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JsExecutorHighlight {
    public static void main(String[] args) {

        /*
        about javaScript Using JavaScriptExecutor we can perform:
● Click on some elements
● Scroll page
● Refresh page
● Highlight an element
JavaScriptExecutor provides “execute script” &
"executeAsyncScript" methods, to run JavaScript in the
context of the currently selected frame or window.
         */
        

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//        find the webEelment username
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

//        using js Executor
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='pink'",username); //for highlight the feild



    }
}
