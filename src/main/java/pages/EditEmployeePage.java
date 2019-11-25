package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditEmployeePage {
    public WebDriver driver;

    public EditEmployeePage(WebDriver driver){
        this.driver = driver;
    }

    By updateButton = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/button[1]");
    By deleteButton = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/p[1]");
    By firstName = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/label[1]/input[1]");

    public void clickUpdateButton(){
        driver.findElement(updateButton).click();
    }

    public void verifyUpdateButtonIsPresent(){
        driver.findElement(updateButton).isDisplayed();
    }

    public void editFirstName(String text){
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(text);
    }

    public void waitUntilAlertIsPresent(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        System.out.println("Alert is clicked on");
    }

    public void clickDeleteButton(){
        driver.findElement(deleteButton).click();
    }

    public void verifyDeleteButtonIsPresent(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
    }
}
