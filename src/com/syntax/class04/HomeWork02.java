package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {
    public static void main(String[] args) {
        /*
        HW 2
HRMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.

Hint:
you can use if else condition for verification of message

         */
// //  set the path to the driver to link it with our class. and note on mac u dont need '.exe' on windows u need '.exe'
System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");


//created WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        driver.manage().window().maximize();
//find the unquies elements, and store the webelements to 'vaildName' reference variable.
        WebElement vaildName= driver.findElement(By.xpath("//input[contains(@id,'txtUser') ]"));

        //this method-- this simulate typing into an elements
        vaildName.sendKeys("Admin");

            WebElement login= driver.findElement(By.xpath("//input[starts-with(@id,'btnLo')]"));

            login.click();

            WebElement passw= driver.findElement(By.xpath("//span[contains(text(),'Password cannot be')]"));

            String message= passw.getText();


            if(message.isEmpty()){

                System.out.println(message + " not displayed");
            }else{

                System.out.println(message + " is displayed");

            }



    }
}
