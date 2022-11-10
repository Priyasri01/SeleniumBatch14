package ReviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) {

        //  set the path to the driver to link it with our class. and note on mac u dont need '.exe' on windows u need '.exe'
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //Create a webDriver instance
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();

        List<WebElement> checkB =driver.findElements(By.xpath("//input[@name='color']"));

        //what does this list contains?
         //this list contains 6 elements

        for(WebElement checkBox:checkB){

        String color  =checkBox.getAttribute("value");

        //in order to select all the box the codes are checkBox.getAttribute("value"); .click();

        if(color.equalsIgnoreCase("blue")){
            checkBox.click();
            break;
        }

        }





    }
}
