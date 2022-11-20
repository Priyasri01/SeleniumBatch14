package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class (note: on mac u dont need ".exe" on windows u need ".exe")
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        goto syntax project /checkbox demo

        //  go to the website
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        //        enter the username in the text box
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        //        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        List<WebElement> productColum=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[3]"));

        for(int i=0; i<productColum.size();i++){

            String list=productColum.get(i).getText();

            if(list.equalsIgnoreCase("ScreenSaver")){

                int row=i+1;

                WebElement selectedlist = driver.findElement(By.xpath(  "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+(row+1)+ "]/td[1]"));
                selectedlist.click();

            }
        }


    }
}
