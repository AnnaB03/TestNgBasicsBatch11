package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.commonMethods;




public class loginTest extends commonMethods {


    //pre condition @before method -- launch browser and navigate url


    //@Test -- perform login
    @Test(groups = "regression", enabled = false)
    public void adminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(groups = "regression")
    public void validationOfTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Manaaaaaaaaaagement System";

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }
    }


    //post condition @after method -- close browser


}