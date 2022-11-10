package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork01 {

    public static void main(String[] args) throws InterruptedException {
        /*
        1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code

         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement creatNew = driver.findElement(By.xpath(" //a[contains(@data-testid,'open-registration-form')]"));

        creatNew.click();

        Thread.sleep(5000);
        WebElement name= driver.findElement(By.name("firstname"));
        name.sendKeys("Priyasri");

        Thread.sleep(5000);
        WebElement lname= driver.findElement(By.xpath("//input[@data-type='text' and @name='lastname']"));
        lname.sendKeys("Murugesan");

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("912-057-1478");

        WebElement pass= driver.findElement(By.id("password_step_input"));
        pass.sendKeys("abc@123");

       WebElement select= driver.findElement(By.xpath("//select[@name='birthday_month']"));

        Select sel= new Select(select);

        sel.selectByVisibleText("Aug");

        WebElement day_d= driver.findElement(By.name("birthday_day"));

        Select sl= new Select(day_d);
       sl.selectByIndex(2);
       boolean multiBox = sl.isMultiple();
        System.out.println(multiBox);

       WebElement year = driver.findElement(By.id("year"));

       Select brithYear= new Select(year);
       brithYear.selectByValue("1987");

       WebElement female= driver.findElement(By.xpath("//label[text()='Female']"));

       if(female.isDisplayed()){
           female.click();
       }









    }
}
