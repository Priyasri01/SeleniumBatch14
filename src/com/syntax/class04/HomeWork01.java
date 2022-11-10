package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.sql.SQLOutput;

public class HomeWork01 {

    public static void main(String[] args) throws InterruptedException {

        /*
        HW1
Open Chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify the message "Welcome Admin " is there on the top right corner
         */

        //  set the path to the driver to link it with our class. and note on mac u dont need '.exe' on windows u need '.exe'
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //Create a webDriver instance
        WebDriver driver= new ChromeDriver();

        //go to “http://hrm.syntaxtechs.net/

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        //Maximize the size.
        driver.manage().window().maximize();

       //since the findElement  returns webelement, so created reference variable "element" and store the elements to it.
        WebElement element= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        element.sendKeys("Admin");

        //since the findElement  returns webelement, so created reference variable "element" and store the elements to it.
        WebElement passElement= driver.findElement(By.xpath("//input[@id='txtPassword' and @type='password']"));
        passElement.sendKeys("Hum@nhrm123");


        driver.findElement(By.cssSelector("input#btnLogin")).click(); //used css sector. tag#id

        WebElement adminlog= driver.findElement(By.linkText("Welcome Admin"));
        String logDis =adminlog.getText();

        boolean welcomeAdmin =adminlog.isDisplayed();


       if(welcomeAdmin==true){

           System.out.println(" Yes, Welcome Admin  is there on the top right corner");

           System.out.println("The text on the log is: " +logDis);
       }

    }
}
