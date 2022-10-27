package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe ");

        WebDriver driver= new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/h3"));

    }
}
