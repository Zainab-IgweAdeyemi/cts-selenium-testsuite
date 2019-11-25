package tests;

import ReusableMethods.LoginSuccessfully;
import base.baseTests;
import org.testng.annotations.Test;
import pages.EditEmployeePage;
import pages.EmployeesPage;

import java.io.IOException;

public class deleteEmployeeTests extends baseTests {

    @Test
    public void testDeleteEmployeeSuccessfully_viaEditPage() throws IOException, InterruptedException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();

        EmployeesPage employeesPage = new EmployeesPage(driver);
        employeesPage.verifyEmployeeEbunIsPresent();
        employeesPage.selectEbun();
        employeesPage.clickEditButton();

        EditEmployeePage editEmployeePage = new EditEmployeePage(driver);
        editEmployeePage.verifyDeleteButtonIsPresent();
        editEmployeePage.clickDeleteButton();
        editEmployeePage.waitUntilAlertIsPresent();
        employeesPage.verifyCreateButtonIsPresent();
        employeesPage.verifyLogoutButtonIsPresent();
        System.out.println("Employee: Ebun Z has been deleted successfully");

    }

}
