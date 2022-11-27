package com.syntax.class09;

import Util.ConfigRead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String path="Data/Config.Properties";
       Properties properties =ConfigRead.read(path);
       String userName1= properties.get("userName").toString(); // note return is string(userName1) but provided is Object(properties.get("useName")) , so used to string method   to convert objcet to string
       String pass=properties.get("passWord").toString(); //same

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys(userName1);
        WebElement userPass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        userPass.sendKeys(pass);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        WebElement pimbut = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimbut.click();
        WebElement employee_list = driver.findElement(By.linkText("Employee List"));
        employee_list.click();

        List<WebElement> idList = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
/*
while doing the the homework I finally figured out why we have to add 1+i coz the
list of webelements always start with index 0 but the table starts with 1 so even if we i=1 in
the loop that means our loop will miss the first element in the list the only solution is to make it i+1
 */

        for (int i = 0; i <idList.size(); i++) {

            String allid = idList.get(i).getText();


       if(allid.equalsIgnoreCase("45019A")){

           int row= i+1;

            WebElement  checkBox =driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(row) + "]/td[1]"));
           checkBox.click();

       }
      }


        }
    }
