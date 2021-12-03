package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

import java.util.Random;

public class AddUserPage extends Utility {

    By addUserText = By.xpath("//h1[contains(text(),'Add User')]");
    By userRole = By.id("systemUser_userType");
    By employeeName = By.id("systemUser_employeeName_empName");
    By userName = By.id("systemUser_userName");
    By status = By.id("systemUser_status");
    By password = By.id("systemUser_password");
    By confirmPassword = By.id("systemUser_confirmPassword");
    By saveButton = By.xpath("//input[@id='btnSave']");



    public void verifyAddUserText() {
        verifyText("Add User", addUserText, "Error, 'Add User' message not displayed as expected");
    }

    public void selectUserType() {
        selectByVisibleTextFromDropdown(userRole, "Admin");
    }

    public void selectUsertype(String userType){
        selectByVisibleTextFromDropdown(userRole,userType);
    }

    public void inputEmployeeName() {
        sendTextToElement(employeeName, "Ananya Dash");
    }

    public void inputUsername() {
//        sendTextToElement(userName, "AnanyaD");
        sendTextToElement(userName, "Ananya00" + Integer.toString(((new Random().nextInt(10)) + 1)));
    }

    public void selectStatus() {
        selectByVisibleTextFromDropdown(status, "Disabled");
    }

    public void inputPassword() {
        sendTextToElement(password, "Abc12345");
    }

    public void inputConfirmPassword() {
        sendTextToElement(confirmPassword, "Abc12345");
    }

    public void clickOnSaveButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(saveButton);
    }

}
