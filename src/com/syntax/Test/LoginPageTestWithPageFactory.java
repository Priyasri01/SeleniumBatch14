package com.syntax.Test;

import Util.CommonMethods;
import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPageWithPageFactory;


public class LoginPageTestWithPageFactory {

    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

       LoginPageWithPageFactory login =new LoginPageWithPageFactory();
      login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();

    }
}
