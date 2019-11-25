package ReusableMethods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import java.io.IOException;

public class LoginSuccessfully {
    private WebDriver driver;

    public LoginSuccessfully(WebDriver driver){
        this.driver = driver;
    }

    public void login() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Luke");
        loginPage.enterPassword("Skywalker");
        Thread.sleep(20);
        loginPage.clickLoginButton();

    }
}
