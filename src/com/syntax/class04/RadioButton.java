package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        //        get/find the radio button Male element
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));

//        check if the radio btn is displayed ()will return boolean
        boolean displayStatus = maleRadioBtn.isDisplayed(); //---> isDisplayed means is that button displayed on the page or not

//        print the display status
        System.out.println("The radio button is Displayed :"+displayStatus);

//        check weather the radio button male is Enabled
        boolean enableStatus = maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled :"+enableStatus);

//        check weather the radio button male is selcted
        boolean selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button is selected :"+selectStatus);

//check if the radio button male is not selected then click on it
        if(!selectStatus){
//            perfrom a click operation on the radio button
            maleRadioBtn.click();
        }
        selectStatus=maleRadioBtn.isSelected(); //reassign the value , since we have given if condition  to click
        System.out.println("The radio button is selected :"+selectStatus);
    }
}
