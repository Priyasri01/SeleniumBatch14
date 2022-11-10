package com.syntax.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {

    public static void main(String[] args) {
        //       set a path to the diver to link it our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the fb.com

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }
}




