package ReviewClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WaitReview {
    public static void main(String[] args) {
          /*
        go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
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
    }
}
