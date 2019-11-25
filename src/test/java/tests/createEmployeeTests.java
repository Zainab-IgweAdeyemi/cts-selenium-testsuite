package tests;

import base.baseTests;
import ReusableMethods.LoginSuccessfully;
import org.testng.annotations.Test;
import pages.CreateEmployeesPage;
import pages.EmployeesPage;

import java.io.IOException;

public class createEmployeeTests extends baseTests {

    @Test(priority = 1)
    public void testCreateEmployeeWithInvalidDateFormat() throws IOException, InterruptedException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();

        EmployeesPage employeesPage = new EmployeesPage(driver);
        employeesPage.verifyCreateButtonIsPresent();
        employeesPage.clickCreateButton();

        CreateEmployeesPage createEmployeesPage = new CreateEmployeesPage(driver);
        createEmployeesPage.enterFirstName("zay");
        createEmployeesPage.enterLastName("zuz");
        createEmployeesPage.enterStartDate("2019/01/01");
        createEmployeesPage.enterEmailAdd("z@zz.com");
        createEmployeesPage.clickAddButton();
        createEmployeesPage.waitUntilAlertIsPresent();
        createEmployeesPage.verifyAddButtonIsPresent();
    }

    @Test(priority = 2)
    public void testCreateEmployeeSuccessfully() throws IOException, InterruptedException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();

        EmployeesPage employeesPage = new EmployeesPage(driver);
        employeesPage.verifyCreateButtonIsPresent();
        employeesPage.clickCreateButton();

        CreateEmployeesPage createEmployeesPage = new CreateEmployeesPage(driver);
        createEmployeesPage.verifyCancelButtonIsDisplayed();
        createEmployeesPage.verifyAddButtonIsPresent();
        createEmployeesPage.enterFirstName("Zay");
        createEmployeesPage.enterLastName("Z");
        createEmployeesPage.enterStartDate("2019-01-01");
        createEmployeesPage.enterEmailAdd("z@zz.com");
        createEmployeesPage.clickAddButton();
        employeesPage.verifyEmployeeZayIsPresent();
        employeesPage.verifyCreateButtonIsPresent();
    }
}
