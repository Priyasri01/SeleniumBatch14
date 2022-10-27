package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        /*
    fill out the form
click on register
close the browser

     */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

driver.findElement(By.name("customer.firstName")).sendKeys("Priyasri");
driver.findElement(By.id("customer.lastName")).sendKeys("Murugesan");
driver.findElement(By.name("customer.address.street")).sendKeys("274-Peter Avenue");
driver.findElement(By.id("customer.address.city")).sendKeys("New York");
driver.findElement(By.id("customer.address.state")).sendKeys("NY");
driver.findElement(By.id("customer.address.zipCode")).sendKeys("18745");
driver.findElement(By.name("customer.phoneNumber")).sendKeys("917-401-2518");
driver.findElement(By.id("customer.ssn")).sendKeys("017-34-8791");
driver.findElement(By.id("customer.username")).sendKeys("PeterRaj");
driver.findElement(By.id("customer.password")).sendKeys("abc@123");
driver.findElement(By.name("repeatedPassword")).sendKeys("abc@123");
Thread.sleep(2000);
driver.findElement(By.className("button")).click();
Thread.sleep(2000);



    }

}
