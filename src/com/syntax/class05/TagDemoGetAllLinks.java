package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class TagDemoGetAllLinks {
    public static void main(String[] args) {

//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
            WebDriver driver= new ChromeDriver();
//        goto ebay.com
            driver.get("https://www.ebay.com/");
/*      line 24:  get all the links i.e anchor tags from the website,
        note we are selecting multiple links, so we are using here  findElements(). this findElements will provide a list of elements ,
         so we store this elements in "List" class with the help of reference variable which is "ebayLinks".
         */
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
//        print the size of the list  "ebaylinks"
            System.out.println("the size of the list is :" + ebayLinks.size());
//       now we have all the elements inside the ebayLinks, now i have to extract only the link what we have to do? we can use any loops, implementing a for loop to traverse(means back and forth) through the list of WebElements
            for(WebElement ebaylink :ebayLinks){
//          extracting the value of attribute href because it contains the link embedded in the Webelement
                String link = ebaylink.getAttribute("href"); //getAttribute("href") method will get the attribute value.
//            print the link
                System.out.println(link);

            }
        }


}
