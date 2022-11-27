package com.syntax.Test;

import Util.CommonMethods;
import com.syntax.pages.LoginPage;



public class LoginPageTest {
    public static void main(String[] args) {

        //calling the openWithSpecificUrl from CommonMethods class.
    CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        LoginPage login = new LoginPage();

        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();
    }
}
