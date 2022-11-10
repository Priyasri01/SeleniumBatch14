package com.syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntax gmial sin
        driver.get("http://accounts.google.com/signup");
//        maximize
        driver.manage().window().maximize();

        String gmailHandle = driver.getWindowHandle();
        System.out.println(" The handle of the current page is " + gmailHandle);
    }
}
