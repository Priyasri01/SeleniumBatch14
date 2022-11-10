package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox03 {
    public static void main(String[] args) {

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntax project /checkbox demo
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//        maximize
        driver.manage().window().maximize();

//find the elements and store in check_bOC
        List<WebElement> check_Box = driver.findElements(By.xpath("//input[@name='color']"));

        for(WebElement option:check_Box){

            //find the desire
        String value = option.getAttribute("value");

        if(value.equalsIgnoreCase("blue")){

            option.click();
            break;


        }

        }

    }
}
