package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By homepageLogo = By.xpath("//img[@alt='OrangeHRM']");
    By userProfileLink = By.id("welcome");
    By userLogout = By.xpath("//a[contains(text(),'Logout')]");


    public void clickOnUserProfileLink(){
        clickOnElement(userProfileLink);
    }
    public void mouseHoverAndClickOnLogout(){
        mouseHoverAndClick(userLogout);
    }

    public void verifyHomepageLogo(){
        verifyLogoVisible(homepageLogo);
    }
}

