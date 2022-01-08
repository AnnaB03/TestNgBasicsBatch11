package class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class preconditionAndPostcondition {

    @BeforeMethod //condition when to execute
    public void beforeMethod() {
        System.out.println("I am pre condition");
    }

    @AfterMethod //condition when to execute
    public void afterMethod() {
        System.out.println("I am post condition");
    }

    @Test //actual test
    public void test() {
        System.out.println("I am actual test");
    }
    @Test
    public void anotherTest () {
        System.out.println("I am another test");
    }
}
