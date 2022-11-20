package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePrintWhloeRowandCloumData {

    public static void main(String[] args) {

        // set the path to the driver to link it with our class (note: on mac u dont need ".exe" on windows u need ".exe")
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        goto syntax project /checkbox demo
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
//        maximize
        driver.manage().window().maximize();

        //print all the rows of the table.
        //modify taskprint all the rows which has "Google" company , so we need to pass the condtion.

        //we have find elements in here because we want all the data from the row
      List<WebElement> row= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")); // This is called row level access to the table. because our xpath is for row .


      for(WebElement rows:row){

          String rowText =rows.getText();

          //  System.out.println(rowText);
          // System.out.println("_______________________________________");


          if(rowText.contains("Google")){ // note in here we can't use equals because the row contains more than one data in single row, so in this senario we have to use contains.
                 System.out.println(rowText);
                }

      }
// print all the individual colums of the table




    }
}
