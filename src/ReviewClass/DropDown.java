package ReviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the fb.com
        driver.get("https://www.facebook.com/");

// find the button create account and click on it
                WebElement createAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccountBtn.click();
//        sleep for 3 seconds to wait for the window to open up
        Thread.sleep(3000);

//        Select the date from the down
//        approach to use the select
//        1.Find the webElement that contains the select Tag
//        2.use Select class Select sel =new Select(Webelement)

//        1.Find the webElement that contains the select Tag
        WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
//        2.use Select class by create new object  Select sel =new Select(Webelement)
        Select sel=new Select(month);

//        We have now three methods
//        1.Select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
//        2.Select by visible Text
        sel.selectByVisibleText("Jul");
        Thread.sleep(2000);
//        3.Select by Value

        sel.selectByValue("3");
//        .....................
//        1.find the WebElement
//        2. use the select class to intiate an instance
        //        1.find the WebElement
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        //        2. use the select class to intiate an instance
        Select selectDay= new Select(day);
//
        selectDay.selectByVisibleText("25");

        //   print all the available months in the console, note the first task "find the element and use selected class task already completed in line 33 and 34 .
        //   so, in here we are getting all lis of elments from sel by using .getOptions and stored in month then we used loop to retrieve the each text.

        List<WebElement> months=sel.getOptions();

        for(WebElement mon:months) {

            String option= mon.getText();

            System.out.println(option);

        }

    }
}
