package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.commonMethods;


import static utils.commonMethods.driver;

public class HW extends commonMethods {

    @Test
    public void adminLogin() throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("input#btnAdd")).click();
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Jennifer");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("FLORES");
        driver.findElement(By.cssSelector("input#chkLogin")).click();
        driver.findElement(By.cssSelector("input#user_name")).sendKeys("FLORESFLORES");
        driver.findElement(By.cssSelector("input#user_password")).sendKeys("1234MarSm$22");
        driver.findElement(By.cssSelector("input#re_password")).sendKeys("1234MarSm$22");
        WebElement choose = driver.findElement(By.cssSelector("select#status"));
        Select dropdown = new Select(choose);
        dropdown.selectByVisibleText("Enabled");
        driver.findElement(By.cssSelector("input#btnSave")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("input#btnAdd")).click();
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Robert");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("JACKSON");
        driver.findElement(By.cssSelector("input#chkLogin")).click();
        driver.findElement(By.cssSelector("input#user_name")).sendKeys("JACKSONJACKSON");
        driver.findElement(By.cssSelector("input#user_password")).sendKeys("1234MarSm$22");
        driver.findElement(By.cssSelector("input#re_password")).sendKeys("1234MarSm$22");
        WebElement choose1 = driver.findElement(By.cssSelector("select#status"));
        Select dropdown1 = new Select(choose1);
        dropdown1.selectByVisibleText("Enabled");
        driver.findElement(By.cssSelector("input#btnSave")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("input#btnAdd")).click();
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("JOHN");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("PEREZ");
        driver.findElement(By.cssSelector("input#chkLogin")).click();
        driver.findElement(By.cssSelector("input#user_name")).sendKeys("PEREZPEREZ");
        driver.findElement(By.cssSelector("input#user_password")).sendKeys("1234MarSm$22");
        driver.findElement(By.cssSelector("input#re_password")).sendKeys("1234MarSm$22");
        WebElement choose2 = driver.findElement(By.cssSelector("select#status"));
        Select dropdown2 = new Select(choose2);
        dropdown2.selectByVisibleText("Enabled");
        driver.findElement(By.cssSelector("input#btnSave")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("input#btnAdd")).click();
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Michael");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("KING");
        driver.findElement(By.cssSelector("input#chkLogin")).click();
        driver.findElement(By.cssSelector("input#user_name")).sendKeys("KINGKING");
        driver.findElement(By.cssSelector("input#user_password")).sendKeys("1234MarSm$22");
        driver.findElement(By.cssSelector("input#re_password")).sendKeys("1234MarSm$22");
        WebElement choose3 = driver.findElement(By.cssSelector("select#status"));
        Select dropdown3 = new Select(choose3);
        dropdown3.selectByVisibleText("Enabled");
        driver.findElement(By.cssSelector("input#btnSave")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("input#btnAdd")).click();
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Linda");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("HILL");
        driver.findElement(By.cssSelector("input#chkLogin")).click();
        driver.findElement(By.cssSelector("input#user_name")).sendKeys("HILLHILL");
        driver.findElement(By.cssSelector("input#user_password")).sendKeys("1234MarSm$22");
        driver.findElement(By.cssSelector("input#re_password")).sendKeys("1234MarSm$22");
        WebElement choose4 = driver.findElement(By.cssSelector("select#status"));
        Select dropdown4 = new Select(choose4);
        dropdown4.selectByVisibleText("Enabled");
        driver.findElement(By.cssSelector("input#btnSave")).click();
        Thread.sleep(5000);



    }

}
