package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {

    By systemUserText = By.xpath("//h1[contains(text(),'System Users')]");
    By addButton = By.id("btnAdd");
    By successfullySavedText = By.xpath("//div[contains(text(),'Successfully Saved')]");
    By searchUsername = By.id("searchSystemUser_userName");
    By searchUserRole = By.id("searchSystemUser_userType");
    By searchUserStatus = By.id("searchSystemUser_status");
    By searchButton = By.id("searchBtn");
    By verifyResultList = By.xpath("//a[contains(text(),'AnanyaD')]");

    public void verifySystemUserText() {
        verifyText("System Users", systemUserText, "Error, 'System Users' message not diaplayed as expected");
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
    }

    public void verifySuccessfullySavedMessage() throws InterruptedException {
        Thread.sleep(500);
        verifyText("Successfully Saved", successfullySavedText, "Error, message not displayed as expected");
    }

    public void inputSearchUsername() {
        sendTextToElement(searchUsername, "AnanyaD");
    }

    public void selectSearchUserRole() {
        selectByVisibleTextFromDropdown(searchUserRole, "Admin");
    }

    public void selectSearchUserStatus() {
        selectByVisibleTextFromDropdown(searchUserStatus, "Disabled");
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public void verifyResultList() {
        verifyText("AnanyaD", verifyResultList, "Error, List not displayed as expected");
    }

    By searchChekcbox = By.id("ohrmList_chkSelectRecord_69");
    By deleteButton = By.id("btnDelete");
    By deleteRecordPopUp = By.id("dialogDeleteBtn");
    By successfullyDeleted = By.xpath("//div[contains(text(),'Successfully Deleted')]");
    By noRecordFoundText = By.xpath("//td[contains(text(),'No Records Found')]");

    public void clickOnChecboxToSelectUser(){
        clickOnElement(searchChekcbox);
    }
    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }
    public void clickOnOKButtonOnPopUp(){
        clickOnElement(deleteRecordPopUp);
    }
    public void verifyRecordSuccessfullyDeletedMessage(){
        verifyText("Successfully Deleted", successfullyDeleted, "Error, Message not displayed as expected");
    }
    public void verifyNoRecordFoundMessage(){
        verifyText("No Records Found", noRecordFoundText, "Error, Message not displayed as expected");
    }

}
