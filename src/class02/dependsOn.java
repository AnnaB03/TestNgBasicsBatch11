package class02;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void login() {
        System.out.println("I am login test");
    }
    @Test (dependsOnMethods = "login")
    public void verificationOfDashboard () {
        System.out.println("I am dependent scenario");
    }
}
