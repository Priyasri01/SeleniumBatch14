package com.syntax.pages;

import Util.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {

    @FindBy(id="txtUsername")
    public WebElement userNameField;

    @FindBy (xpath = "//input[@id = 'txtPassword']")
    public WebElement passwordField ;

    @FindBy (css="input#btnLogin")
    public  WebElement loginButton;

    //    call the constructor to intialize all elements
    public  LoginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }
}
