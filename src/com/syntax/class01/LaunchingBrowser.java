package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

    public static void main(String[] args) {
// The purpose of setProperty function is to link the webdrive in this class/Programme.in first prameter "" we have to put name of the driver and in second parameter "" path/location the drivers are
       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//create a webDriver instance/object
        WebDriver driver =new ChromeDriver(); //this is upcasting
     //use the get() funtion to open up the required website
        driver.get("https://www.google.com/");
//Get the url of the website
       String url= driver.getCurrentUrl();
      //print the url
        System.out.println(url);
        String title = driver.getTitle();
//print the title
        System.out.println(title);

//close the chrome
        driver.quit(); //all tap will close, meaning it will

        //note:
        /*

			Comparison

driver.get()  =======  driver.navigate().to()


-- driver.get() is going to wait for the page to fully load before proceeding further
where as driver.navigate() will not wait for the page to fully load

         */

    }

    public static class MaximizeWindow {
        public static void main(String[] args) throws InterruptedException {

            //go googl
            // maximize your window

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            //create instacne of WebDriver
            WebDriver driver= new ChromeDriver();
          //goto google.com
            driver.get("https://www.facebook.com/");//
            //maximize
            driver.manage().window().maximize();
            Thread.sleep(2000);

            //fullscreen
            driver.manage().window().fullscreen(); //shows nothing but the website , we won't see url or anything
            Thread.sleep(2000);
            //quit
            driver.quit();
        }
    }
}
