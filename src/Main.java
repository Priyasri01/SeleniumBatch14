import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); //for Windows add extension .exe

        WebDriver driver = new ChromeDriver(); //launch the  browser
        //String path="https://www.google.com/";
        driver.get("https://www.google.com/"); //navigate to the Specified Url

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());
        driver.quit();

    }
}