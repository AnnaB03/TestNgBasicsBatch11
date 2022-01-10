package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//commonMethods are extended in class02 loginTest

public class commonMethods {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public static void openBrowserAndLaunchApplication(){
        configReader.readProperties("C:\\Users\\annab\\IdeaProjects\\TestNgBasicsBatch11\\src\\config\\config.properties");
        switch (configReader.getPropertyValue("browser")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/Driver/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }

        driver.manage().window().maximize();
        driver.get(configReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

/*@Test (priority = 5)
    public static void takeTheSs(String filename){

       TakesScreenshot ts=(TakesScreenshot) driver;

//         the screenshot is taken and the type is File
       File ss = ts.getScreenshotAs(OutputType.FILE);
//         save the screenshot in our computer
       try {
           FileUtils.copyFile(ss,new File("src/screenshot/" +filename+".png"));
       }
       catch (IOException e) {
           e.printStackTrace();
       }*/


   /*@AfterMethod(alwaysRun = true)
    public static void closeBrowser(){
        driver.quit();
*/

    }