package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTable3 {
    public static void main(String[] args) {

         /*
        got to the url
click on PIM
click on Employee List
from the table choose one id (it must be from the first page)
and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
the user name is
admin
the password is
Hum@nhrm123
          */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().window().maximize();


       WebElement userName= driver.findElement(By.xpath("//input[@name='txtUsername']"));
       userName.sendKeys("admin");
       WebElement loginpass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
       loginpass.sendKeys("Hum@nhrm123");
       WebElement loginbut=driver.findElement(By.xpath("//input[@id='btnLogin']"));
       loginbut.click();
       WebElement pimbut = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimbut.click();
        WebElement employee_list = driver.findElement(By.linkText("Employee List"));
        employee_list.click();

        //Task retrieving all elements from row

        List<WebElement>  alllist =driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        System.out.println(alllist.size()); //50


        for(int i=0 ; i<=alllist.size(); i++){


            String allPeople=alllist.get(i).getText();
            int row=i+1;

            if(allPeople.contains("Employee")){

//table[@id='resultTable']/tbody/tr[38]/td[1]

                 //System.out.println("Syntax employe's  -->" +allPeople);
                // task 2 from the list select all the people  who are "Employee" in syntax

   WebElement emplyeeName=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (row) + "]/td[1]"));
   emplyeeName.click();



            }


        }



    }
}
