package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigate to http://syntaxprojects.com/
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000); //added sleep time for the new window to load
        //Click on start practicing
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(3000);
        //click on simple form demo
      //  driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click(); //note we can use index only if we don't have any choices . Index may get changed later on, as new lines may introduced.
        Thread.sleep(3000); //line 28 and 30 will provide same output, but 30 is perfered
        driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();
        driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("Hello Everyone");
        //click on show message
        driver.findElement(By.xpath("//button[contains(text(),'Show')]")).click();
        driver.quit();

    }
}
