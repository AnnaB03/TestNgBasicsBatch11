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

public class HWTask {
    /*HRMS Application Negative Login:
Open chrome browser
Go to http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
Enter valid username
Leave password field empty
Verify error message with text “Password cannot be empty” is displayed.*/

    WebDriver driver;

    @BeforeMethod
    public void openBrowserAndLaunchApplication(){
        System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    public void adminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("btnLogin")).click();

        String message = driver.findElement(By.cssSelector("span#spanMessage")).getText();
        String expected = "Password cannot be empty";
        Assert.assertEquals(message,expected);
    }


    /*@AfterMethod
    public void closeBrowser() {
        driver.quit();*/
    }


