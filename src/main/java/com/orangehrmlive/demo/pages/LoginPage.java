package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By loginButton = By.id("btnLogin");
    By loginPanel= By.xpath("//div[text()='LOGIN Panel']");

    public void verifyLoginPanelText(){
        verifyText("LOGIN Panel", loginPanel, "Error, 'LOGIN Panel' text not dispalyed as expected");
    }
    public void inputUsername(){
        sendTextToElement(username,"Admin");
    }
    public void inputPassword(){
        sendTextToElement(password, "admin123");
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void loginToApplication(){
        sendTextToElement(username,"Admin");
        sendTextToElement(password, "admin123");
        clickOnElement(loginButton);
    }
}
