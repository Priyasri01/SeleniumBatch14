package com.syntax.class10;

import Util.ConfigRead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static Util.ConfigRead.read;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        /*
        Go to syntax hrms .
Go-to the recruitment tab.
From the calendar  just select a date
8 August 2023
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Properties config = read("Data/Config.Properties");

        String name = config.get("userName").toString();
        String password = config.get("passWord").toString();

        WebElement nameFeild = driver.findElement(By.xpath("//input[@ name='txtUsername']"));
        nameFeild.sendKeys(name);

        WebElement passFeild = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        passFeild.sendKeys(password);

        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();

        WebElement recuritment = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recuritment.click();

        WebElement calender = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger'][1]"));
        calender.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        month.click();

        Select sel = new Select(month);

        List<WebElement> allmonth = sel.getOptions();

        for (int i = 0; i < allmonth.size(); i++) {

            String months = allmonth.get(i).getText();

            if (months.equalsIgnoreCase("Aug")) {

                sel.selectByVisibleText(months);
                break;

            }
        }

        //select the year

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

        year.click();

        Select selYear = new Select(year);

        selYear.selectByVisibleText("2023");

        ////table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[2]

        List<WebElement> yearTable = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));


        for(int i=0;i<yearTable.size();i++){

            int column=i+1;

            String day= yearTable.get(i).getText();

            if(day.equals("8")){

                yearTable.get(i).click();
            }
        }


            }

        }






