package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathDemo {
//-- close() --> it will close the current tab only
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

    System.out.println("************1)xpath to indentify  by attributes in line 18 *************");
        driver.findElement(By.xpath("//button[@value='Print First']")).click();
        Thread.sleep(8000);
      driver.quit(); // after the browser closed  it's won't  open again when i asked to go for facebook in line 22. so before that line we want to create any another instance for chromDirver.then we have to specify the website which we want to go for.
        System.out.println("************1)Xpath to identify by text in line 20 *************");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.facebook.com/");
        //Thread.sleep(8000);
        driver1.findElement(By.xpath("//a[text()='Forgot password?']")).click();
       // Thread.sleep(8000);
        driver1.navigate().back();
        System.out.println("************2)Xpath to identify by contain attributes in line 20 *************");
        //note try to have 70% of attribute value.s
        driver1.findElement(By.xpath("//button[contains(@data-testid,'royal')]")).click();
        driver1.navigate().back();
   System.out.println("************3)Xpath to identify by contain text in line 34 *************");
        driver1.get("https://www.facebook.com/");
       driver1.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
        driver1.navigate().back();
        Thread.sleep(3000);
        //System.out.println("************4)Xpath to identify by start-with in line 34 *************");
        driver1.findElement(By.xpath("//input[starts-with(@placeholder,'Email')]")).sendKeys("abcd");


    }
}
