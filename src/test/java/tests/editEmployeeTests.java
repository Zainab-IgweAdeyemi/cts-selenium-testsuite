package tests;

import base.baseTests;
import ReusableMethods.LoginSuccessfully;
import org.testng.annotations.Test;
import pages.CreateEmployeesPage;
import pages.EditEmployeePage;
import pages.EmployeesPage;

import java.io.IOException;

public class editEmployeeTests extends baseTests {

    @Test
    public void testEditEmployeeSuccessfully() throws IOException, InterruptedException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();

        EmployeesPage employeesPage = new EmployeesPage(driver);
        employeesPage.verifyCreateButtonIsPresent();
        employeesPage.verifyEmployeeZayIsPresent();
        employeesPage.selectZay();
        employeesPage.clickEditButton();
        EditEmployeePage editEmployeePage = new EditEmployeePage(driver);
        editEmployeePage.verifyUpdateButtonIsPresent();
        editEmployeePage.editFirstName("Ebun");
        editEmployeePage.clickUpdateButton();
        employeesPage.verifyEmployeeEbunIsPresent();

    }


}
