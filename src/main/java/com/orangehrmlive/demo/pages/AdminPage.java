package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By adminLink = By.xpath("//b[contains(text(),'Admin')]");

    public void clickOnAdminTab() {
        clickOnElement(adminLink);
    }
}
