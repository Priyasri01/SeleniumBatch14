package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeWork02 {
    public static void main(String[] args) {

         /*
        go to https://the-internet.herokuapp.com/dynamic_controls

click on enable verify the textbox is enableddef
enter text and click disable
verify the textbox is disabled
         */

        // set the path to the driver to link it with our class (note: on mac u dont need ".exe" on windows u need ".exe")
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        goto syntax project /checkbox demo
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//        maximize
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//button[text()='Enable']"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement verifyTxBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        boolean isEnable = verifyTxBox.isEnabled();

        //  System.out.println(isEnable);

        if (isEnable) {
            WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
            text.sendKeys("Abracadbra");
            System.out.println("The textbox enabled and we Enter the text too -->Abracadbra");
            WebElement disable = driver.findElement(By.xpath("//button[text()='Disable']"));
            disable.click();
        }else{
            System.out.println("The text box is not enabled ");
        }
            WebDriverWait wait2 = new WebDriverWait(driver, 20);
            WebElement textBoxDisabled = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));


            if(textBoxDisabled.isDisplayed()){
                System.out.println("The text box is disabled ");
            }else{

                System.out.println("The text box is not disabled");
            }

    }
}