package class02;

import org.testng.annotations.Test;

public class EnableAndDesable {
    @Test (enabled = true)
    public void firstTest(){
        System.out.println("I am first");
    }
    @Test (enabled = false)
    public void secondTest() {
        System.out.println("I am second");
    }
    @Test (enabled = true)
    public void thirdTest() {
        System.out.println("I am third");
    }

    }

