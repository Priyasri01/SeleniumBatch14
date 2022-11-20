package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableDemo1 {

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

        WebElement table = driver.findElement(By.xpath("//table[@id='customers']")); // this is table level access
        String tableText = table.getText();
        // System.out.println(tableText);

//        print all the rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")); //this is row level access
        for (WebElement row : rows) {
            String rowText = row.getText();
         //   System.out.println(rowText);
         //   System.out.println("-----------------");

            //modify task: Print only the company

            if(rowText.contains("Google")){
                System.out.println(rowText);
            }

        }

        //        print all the individual columns of the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            String columntext = column.getText();
            System.out.println(columntext);
            System.out.println("-----------------");

            ////table[@id='customers']/tbody/tr[3]/td[2] -->to go for specify
        }
//note : the methodology of dealing with dynamic and static table is same in selenium  .but it's different  when we dealing with java logic with them.
    }
}
