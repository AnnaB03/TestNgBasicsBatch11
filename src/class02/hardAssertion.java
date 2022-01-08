package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class hardAssertion {
    WebDriver driver;

    @BeforeMethod
    public void openBrowserAndLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void validationOfTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Management System";
        //hard assertion
        Assert.assertEquals (actualTitle,expectedTitle);

        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        //hard assertion
        Assert.assertTrue(username.isDisplayed());

        /*if (expectedTitle.equals(actualTitle)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }*/
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}