package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dataProviderDemo {

    WebDriver driver;

@DataProvider
    public Object[][] data() {
        Object[][] login = new Object[3][2];
        login[0][0] = "Admin";
        login[0][1] = "Hum@nhrm123";
        login[1][0] = "Admin";
        login[1][1] = "Hum@nhrm123";
        login[2][0] = "Admin";
        login[2][1] = "Hum@nhrm123";

        return login;
    }


    @BeforeMethod(alwaysRun = true)
    public void openBrowserAndLunchApplication() {
        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(groups = "regression", dataProvider = "data")

    public void adminLogin(String username, String password) {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }


    @Test(groups = "regression", enabled = false)


    public void validationTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Management System";
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

//    post conditon @afterMethod--- close browser

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}