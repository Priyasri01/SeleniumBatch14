package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork02 {

    /*
    1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
     */
    public static void main(String[] args) throws InterruptedException {
        // //  set the path to the driver to link it with our class. and note on mac u dont need '.exe' on windows u need '.exe'
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //Create a webDriver instance
        WebDriver driver = new ChromeDriver();
        //go to ebay
        driver.get("https://www.ebay.com/");
        //maximize the window
        driver.manage().window().maximize();
        // first step for dropdown operation:find element and stored in item reference variable.
        WebElement item = driver.findElement(By.xpath("//select[contains(@aria-label,'Select a category for')]"));
      item.click();
        //create object for select class
        Select itemlist= new Select(item);
//got the items form the dropdown list with the help of getoptions()method, this method gets all the options, that belongs to the select tag
        List<WebElement> allItems= itemlist.getOptions();

        System.out.println(allItems.size());

        for(int i=0; i<allItems.size();i++) {

         WebElement option = allItems.get(i);//this .get(i) will provide webelement , and it store in option for every iteration
         String text = option.getText(); //we get  all the element text with the help of getText() methond and  store inside the text variable
         System.out.println(text); //printed all material in the console

         if(text.equalsIgnoreCase("Computers/Tablets & Networking")){

            itemlist.selectByIndex(i);
         }
     }
        Thread.sleep(5000);
        WebElement selectItem= driver.findElement(By.xpath("//input[@type='submit']"));
        selectItem.click();
        String title= driver.getTitle();
        System.out.println(title);
//note:When ever we want to verify the tile get the tile form DOM --->Cntrl+f type //title
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){

             System.out.println("The current tile is " +title + " right");

        }else
            System.out.println("The current tile is " +title + " not correct");

    }

}
