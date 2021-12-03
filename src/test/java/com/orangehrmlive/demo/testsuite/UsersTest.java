package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    AddUserPage addUserPage = new AddUserPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();


    @Test (priority = 1)
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginPage.loginToApplication();
        adminPage.clickOnAdminTab();
        viewSystemUsersPage.verifySystemUserText();
        viewSystemUsersPage.clickOnAddButton();
        addUserPage.verifyAddUserText();
        addUserPage.selectUserType();
        addUserPage.inputEmployeeName();
        addUserPage.inputUsername();
        addUserPage.selectStatus();
        addUserPage.inputPassword();
        addUserPage.inputConfirmPassword();
        addUserPage.clickOnSaveButton();
        viewSystemUsersPage.verifySuccessfullySavedMessage();
    }

    @Test (priority = 2)
    public void searchTheUserCreatedAndVerifyIt(){
        loginPage.loginToApplication();
        adminPage.clickOnAdminTab();
        viewSystemUsersPage.verifySystemUserText();
        viewSystemUsersPage.inputSearchUsername();
        viewSystemUsersPage.selectSearchUserRole();
        viewSystemUsersPage.selectSearchUserStatus();
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.verifyResultList();
    }

    @Test (priority = 3)
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        searchTheUserCreatedAndVerifyIt();
        viewSystemUsersPage.clickOnChecboxToSelectUser();
        viewSystemUsersPage.clickOnDeleteButton();
        viewSystemUsersPage.clickOnOKButtonOnPopUp();
        viewSystemUsersPage.verifyRecordSuccessfullyDeletedMessage();
    }

    @Test (priority = 4)
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.loginToApplication();
        adminPage.clickOnAdminTab();
        viewSystemUsersPage.verifySystemUserText();
        viewSystemUsersPage.inputSearchUsername();
        viewSystemUsersPage.selectSearchUserRole();
        viewSystemUsersPage.selectSearchUserStatus();
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.verifyNoRecordFoundMessage();

    }

}
