package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {


        //  set the path to the driver to link it with our class. and note on mac u dont need '.exe' on windows u need '.exe'
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //Create a webDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        //Find the radio button

        List<WebElement> radio_button = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //travesr through the list of elements

        for(WebElement radio:radio_button){

            //find the desire radio button

            String value= radio.getAttribute("value");
//use condition to which one you want to click.
            if(value.equalsIgnoreCase("0 - 5")){

                radio.click();
            }

        }
    }
}