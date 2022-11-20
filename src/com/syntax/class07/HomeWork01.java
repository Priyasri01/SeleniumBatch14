package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HomeWork01 {
    public static void main(String[] args) {
        /*
        1.goto
http://accounts.google.com/signup
2.click on help and privacy btn
3.click on community Button
4.goto gmail.com page and enter your user name in form
         */
      //Hint: u can save the window handle in variables for later use

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        //  goto syntax gmial sin
        driver.get("http://accounts.google.com/signup");
        //  maximize
        driver.manage().window().maximize();
        WebElement hepBtn =driver.findElement(By.xpath("//a[text()='Help']"));
        hepBtn.click();
        WebElement privacy =driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();

        //get the parent page title.
String desireWin;
        String parentWindow=driver.getWindowHandle();

        /*need to get title for the desire page,our desire page as
        per the requirement is privacy , we manually got dom and got the title "Google Account Help".
         */
        /*
        what if a page does not have title, is there anyway to deal switching the handles? yes we can check with url
         */
// since we have multiple page, so we are using getWindowHandles(), which provide all windows/tag windowHadle/Unique id and store in reference variable
        Set<String> allHandleWindow = driver.getWindowHandles();

        for(String allHandle:allHandleWindow){

            /*the first and foremost thing we have
             switch to all list window/tag with the help of handle in each iterate.*/
            driver.switchTo().window(allHandle);
             String title =driver.getTitle();
 //compare with exist title in the iteration with my desire title
             if(title.equalsIgnoreCase("Google Account Help")) {

                 desireWin = driver.getWindowHandle();
                 break;

             }
        }

        WebElement community= driver.findElement(By.xpath("//a[text()='Community' ]"));

        community.click();

        driver.switchTo().window(parentWindow);
       WebElement homepage= driver.findElement(By.xpath("//input[@name='firstName']"));
       homepage.sendKeys("Priyasri");

    }
}
