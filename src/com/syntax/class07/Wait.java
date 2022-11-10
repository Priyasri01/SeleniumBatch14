package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //  goto syntax gmial sin
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        //  maximize
        driver.manage().window().maximize();
       WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
       startBtn.click();

      WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String tex =welcomeText.getText();

    }
}
