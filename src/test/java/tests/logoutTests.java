package tests;

import ReusableMethods.LoginSuccessfully;
import base.baseTests;
import org.testng.annotations.Test;
import pages.EmployeesPage;
import pages.LoginPage;

import java.io.IOException;

public class logoutTests extends baseTests {

    @Test
    public void testLogoutSuccessfully() throws IOException, InterruptedException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();
        EmployeesPage employeesPage = new EmployeesPage(driver);
        employeesPage.verifyLogoutButtonIsPresent();
        Thread.sleep(6000);
        employeesPage.clickLogoutButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLoginButtonIsPresent();
        System.out.println("User is logged out successfully");
    }
}
