package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldLoginSuccessFully(){
        loginPage.loginToApplication();
    }

    @Test
    public void VerifyThatTheLogoDisplayOnHomePage(){
        loginPage.loginToApplication();
        homePage.verifyHomepageLogo();
    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully(){
        loginPage.loginToApplication();
        homePage.clickOnUserProfileLink();
        homePage.mouseHoverAndClickOnLogout();
    }
}
