package com.syntax.practice;

import Util.CommonMethods;
import com.syntax.pages.LoginPageWithPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory1 extends CommonMethods {

  @FindBy(id="txtUsername")
  public WebElement userName;

  @FindBy(id="txtPassword")
  public WebElement password;

  @FindBy(xpath = "//input[@id='btnLogin']")
  public WebElement loginButton;

  //call the constructor to intial all the elements

 public LoginPageWithPageFactory1(){

   PageFactory.initElements(driver,this);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
 }



}
