package com.syntax.class11;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
    public static void main(String[] args) throws IOException {


            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");


//        username Text Box
            WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
            userName.sendKeys("Tester", Keys.TAB);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.getStackTrace();

            }
//        password field
            WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
            pass.sendKeys("test", Keys.ENTER);


         TakesScreenshot ss   =(TakesScreenshot)driver;

      File sourceFile  = ss.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(sourceFile,new File("ss/myscreenshot/abc.png")); //copy filr at destination

        }
    }
