package tests;

import base.baseTests;
import ReusableMethods.LoginSuccessfully;
import org.testng.annotations.Test;
import pages.EmployeesPage;
import pages.LoginPage;

import java.io.IOException;

public class loginTests extends baseTests{

    @Test(priority = 1)
    public void testLoginWithInvalidUsername() throws IOException, InterruptedException {
        navigateToHome();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Zainab");
        loginPage.enterPassword("Skywalker");
        Thread.sleep(20);
        loginPage.clickLoginButton();
        loginPage.verifyLoginButtonIsPresent();
        loginPage.verifyInvalidUsernameOrPasswordErrorMsgIsDisplayed();

    }

    @Test(priority = 2)
    public void testLoginSuccessfully() throws IOException, InterruptedException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();
        EmployeesPage employeesPage = new EmployeesPage(driver);
        employeesPage.verifyCreateButtonIsPresent();
        employeesPage.verifyLogoutButtonIsPresent();
    }
}
