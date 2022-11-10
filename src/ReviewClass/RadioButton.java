package ReviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {

    public static void main(String[] args) {
//  set the path to the driver to link it with our class. and note on mac u dont need '.exe' on windows u need '.exe'
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //Create a webDriver instance
        WebDriver driver= new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
////got the items form the dropdown list with the help of getoptions()method, this method gets all the options, that belongs to the select tag
      List<WebElement> radioBtns= driver.findElements(By.xpath("//input[@name='ageGroup']"));

      for(WebElement radioBtn:radioBtns){

         String option= radioBtn.getAttribute("value");

          if(option.equalsIgnoreCase("5 - 15")){

              radioBtn.click();

          }
      }

    }
}
