package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {


        //go to google .com
        // go to fb.com

        // note driver.get() = driver.navigate().to(); both funtion are same it will take u to the url u mentioned

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com/");

        //introduce some sleep which is wait  or pause for 2000 milli seconds(2 sec) before goes to next code


        Thread.sleep(2000); //Will pass the execution for seconds.

        driver.navigate().back(); //this will take back to the google.chrom from facebook tap


        Thread.sleep(2000);
        // go back to fb.com
        driver.navigate().forward();

        //wait for 2 sec
        Thread.sleep(2000);
        //refersh the page
        driver.navigate().refresh();

        driver.quit();

        //

    }

}