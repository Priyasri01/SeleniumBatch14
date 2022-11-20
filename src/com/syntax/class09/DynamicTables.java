package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class (note: on mac u dont need ".exe" on windows u need ".exe")
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        goto syntax project /checkbox demo
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
//        maximize
        driver.manage().window().maximize();
       WebElement usename= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
       usename.sendKeys("Tester");
       WebElement password=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
       password.sendKeys("test");
       WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
       button.click();

        //        check the checkBox that contains "screen saver" as a product
        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
//        traverse through the list

        for(int i=0; i<secondColumn.size();i++){
//    i=0
            String columnText = secondColumn.get(i).getText();   //ScreenSaver
//            check for the desired value
            if(columnText.equalsIgnoreCase("ScreenSaver")){
//   print out the index of the column/row which contains the Screen saver
                System.out.println("the index of the row which contains the Screen Saver is "+ (i+1));

                //
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
                checkBox.click();

/*
since our logic works based on the  secodColumn.size().
 even if there is any changes in table it won't affect our logic
 */

            }
            }
        }

    }


