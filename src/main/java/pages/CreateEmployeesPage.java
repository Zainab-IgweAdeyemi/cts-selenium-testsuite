package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateEmployeesPage {
    public WebDriver driver;

    public CreateEmployeesPage(WebDriver driver){
        this.driver = driver;
    }

    By firstName = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/label[1]/input[1]");
    By lastName = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/label[2]/input[1]");
    By startDate = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/label[3]/input[1]");
    By email = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/label[4]/input[1]");
    By cancelButton = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/ul[2]/li[1]/a[1]");
    By addButton = By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/button[2]");

    public void enterFirstName(String text){
        driver.findElement(firstName).sendKeys(text);
    }

    public void enterLastName(String text){
        driver.findElement(lastName).sendKeys(text);
    }

    public void enterStartDate(String text){
        driver.findElement(startDate).sendKeys(text);
    }

    public void enterEmailAdd(String text){
        driver.findElement(email).sendKeys(text);
    }

    public void verifyCancelButtonIsDisplayed(){
        driver.findElement(cancelButton).isDisplayed();
    }

    public void clickAddButton(){
        driver.findElement(addButton).click();
        System.out.println("Adding Employee details...");
    }

    public void waitUntilAlertIsPresent(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        System.out.println("Alert is clicked on");
    }

    public void verifyAddButtonIsPresent(){
        driver.findElement(addButton).isDisplayed();
        System.out.println("Add button is present");
    }



}
