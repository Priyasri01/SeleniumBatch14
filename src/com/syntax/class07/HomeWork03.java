package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork03 {

    public static void main(String[] args) {
        /*
        1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
2.Click on start button
3. get the text Welcome Syntax technologies and print on console

the text will be Empty

write down  whatever the reason you understand  of text being empty after exploring DOM
         */

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
//        goto syntax gmial sin
        driver.get(" https://syntaxprojects.com/dynamic-elements-loading.php");
//        maximize
        driver.manage().window().maximize();

        WebElement start=driver.findElement(By.xpath("//button[@id='startButton']"));
        start.click();
  WebElement name =driver.findElement(By.xpath("//h4[contains(text(),'Welcome Syntax')]"));
   String name1=name.getText();
        System.out.println("The text is " +name1);
        if(name1.isEmpty()){
            System.out.println("Didn't receive the text, because DOM and UI not synchronized. DOM is faster than the Web application.If the code doesn't able to find that element it fails,"+
                    " by throwing exceptions like No such Element, ElementNotVisible, etc. but in this case it's found the elements  and display is none on DOM,the webdriver looks only on dom elements ," +
                    " it's won't wait for the UI so that's the reason we it's not printed." +
                    "so, as a tester it's  our responsibility to maintain the synchronization during automation.");
        }
    }
}
