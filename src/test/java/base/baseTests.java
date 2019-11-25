package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class baseTests {
    public WebDriver driver;

    @BeforeClass
    public WebDriver setup() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/data.properties");

        Properties properties = new Properties();
        properties.load(fileInputStream);

        String browserName = properties.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
            this.driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver");
            this.driver = new FirefoxDriver();
        }

        System.out.println("Browser initialized successfully");

        return driver;
    }

    public void navigateToHome() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/data.properties");

        Properties properties = new Properties();
        properties.load(fileInputStream);

        String URL = properties.getProperty("url");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(URL);
        driver.manage().window().maximize();
        System.out.println("Home Page launched successfully");
    }

    @AfterClass
    public void shutDown() {
        driver.quit();
    }

}
