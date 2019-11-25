package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By username = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/label[1]/input[1]");
    By password = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/label[2]/input[1]");
    By loginButton = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/button[1]");
    By invalidUsernameOrPasswordErrorMsg = By.xpath("//*[contains(@class, 'error-message ng-binding') and contains(text(),'Invalid username or password!')]");

    public void enterUsername(String text){
        driver.findElement(username).sendKeys(text);
    }

    public void enterPassword(String text){
        driver.findElement(password).sendKeys(text);
    }

    public void verifyLoginButtonIsPresent(){
        driver.findElement(loginButton).isDisplayed();
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void verifyInvalidUsernameOrPasswordErrorMsgIsDisplayed(){
        driver.findElement(invalidUsernameOrPasswordErrorMsg).isDisplayed();
        System.out.println("Invalid Username or Password error message is displayed");
    }

}
