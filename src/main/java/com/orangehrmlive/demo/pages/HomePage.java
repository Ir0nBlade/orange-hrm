package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By homepageLogo = By.xpath("//img[@alt='OrangeHRM']");
    By userProfileLink = By.id("welcome");
    By userLogout = By.xpath("//a[contains(text(),'Logout')]");

    public void verifyHomepageLogo(){
        boolean logoPresent = driver.findElement(homepageLogo).isDisplayed();
        Assert.assertTrue(logoPresent);
        if (!logoPresent){
            System.out.println("Homepage Logo not displayed");
        }else{
            System.out.println("Homepage Logo displayed");
        }
    }

    public void clickOnUserProfileLink(){
        clickOnElement(userProfileLink);
    }
    public void mouseHoverAndClickOnLogout(){
        mouseHoverAndClick(userLogout);
    }


}
