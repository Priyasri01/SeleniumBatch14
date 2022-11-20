package com.syntax.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitsDemo02 {

    public static void main(String[] args) throws InterruptedException {
        // set the path to the driver to link it with our class (note: on mac u dont need ".exe" on windows u need ".exe")
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance

        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); /*note we don't need this implicit wait in here for these two seneario(task 1 & task 2).
       but it's good to have in all the class/selenium code like how we have the max. */

      // goto syntax project /checkbox demo
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
      // maximize
        driver.manage().window().maximize();

        //   Tas01     click on the button that pops up the alert
        WebElement button1 = driver.findElement(By.xpath("//button[@id='alert']"));
        button1.click();
    /*becuase we don't have a webElement associated with the alert in the DOM, as we know we can't inspect the alert.
      so there is no purpose of using implicit wait (whihc waits for the webElement to be found)
            so we use explicit wait in this scenarios */

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent()); //note in here we are not giving any web element inside the constructor(),because alert is not associated with any web element.


        // in here we are handle the alert
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(3000); //given this time just to  see the alert page.
        alert1.accept();


        /*Task 02 click on the button ,see the button is not displayed there so we have find the element and click
       (line 43 & 44)  then we have to put a time and condition(in here the condition is wiat for the button to be visible then click that button).
        so we are using explict */

        WebElement button2   =driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button2.click();



        /* as the button appears up after some time so in order to click it or get text from
      it we need to define some explicit wait */

        WebDriverWait wait1=new WebDriverWait(driver,20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']"))); //passing the web inside () , so that driver will wait until the expected condition in a given time frame


        WebElement visibleBtn = driver.findElement(By.xpath("//button[@id='hidden']")); //once given the wait , now we are found the element and doing the action
        visibleBtn.click(); //action completed.

    }
    }

