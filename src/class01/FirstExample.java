package class01;

import org.testng.annotations.Test;

public class FirstExample {
    @Test(priority = 1)

    public void firstTest() {
        System.out.println("I am first test");
    }
    @Test
    public void secondTest() {
        System.out.println("I am second test");
    }
    @Test
    public void thirdTest() {
        System.out.println("I am third test");
    }
} //executes in alphabetical order