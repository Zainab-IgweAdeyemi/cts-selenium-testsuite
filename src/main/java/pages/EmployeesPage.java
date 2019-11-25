package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeesPage {
    public WebDriver driver;

    public EmployeesPage(WebDriver driver){
        this.driver = driver;
    }

    By createButton = By.id("bAdd");
    By logoutButton = By.xpath("//html[1]/body[1]/div[1]/header[1]/div[1]/p[1]");
    By EmployeeName = By.xpath("//li[contains(text(),'Zay Z')]");
    By editButton = By.id("bEdit");
    By updatedEmployeeName = By.xpath("//li[contains(text(),'Ebun Z')]");


    public void verifyCreateButtonIsPresent(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(createButton));
        driver.findElement(createButton).isDisplayed();
        System.out.println("Create button is present");
    }

    public void clickCreateButton(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(createButton));
        driver.findElement(createButton).isDisplayed();
        driver.findElement(createButton).click();
        System.out.println("Create page is opened successfully");
    }

    public void verifyLogoutButtonIsPresent(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoutButton));
        driver.findElement(logoutButton).isDisplayed();
        System.out.println("Logout button is present");
    }

    public void clickLogoutButton(){
        driver.findElement(logoutButton).click();
    }

    public void verifyEmployeeZayIsPresent(){
        driver.findElement(EmployeeName).isDisplayed();
        System.out.println("Employee: " + driver.findElement(EmployeeName).getText() +  " is present");
    }

    public void selectZay(){
        driver.findElement(EmployeeName).click();
        System.out.println("Employee: " + driver.findElement(EmployeeName).getText() + " is selected");
    }

    public void selectEbun(){
        driver.findElement(updatedEmployeeName).click();
        System.out.println("Employee: " + driver.findElement(updatedEmployeeName).getText() +  " is selected");
    }

    public void clickEditButton(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(editButton));
        driver.findElement(editButton).isDisplayed();
        driver.findElement(editButton).click();
    }

    public void verifyEmployeeEbunIsPresent(){
        driver.findElement(updatedEmployeeName).isDisplayed();
        System.out.println("Employee: " + driver.findElement(updatedEmployeeName).getText() +  " is present");
    }
}
