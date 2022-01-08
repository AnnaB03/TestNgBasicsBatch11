package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class softAssertion {
    WebDriver driver;

    @BeforeMethod
    public void openBrowserAndLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void verifyAndValidateSoftAssertions() {
        //soft assertion - create an object
        SoftAssert soft = new SoftAssert();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Manaaaaagement System";

        soft.assertEquals(actualTitle,expectedTitle);

        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        WebElement welcome = driver.findElement(By.xpath("//*[text()='Welcome Admin']"));

        soft.assertTrue(welcome.isDisplayed());
        System.out.println("I will still be executed after failing the test above");

        //always have to be the last line of the test case
        soft.assertAll(); //collect all the assertions

    } @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}