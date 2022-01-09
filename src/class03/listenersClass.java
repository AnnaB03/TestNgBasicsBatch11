package class03;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersClass implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting an execution with the test: "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Taking the screen shot of the test having the name "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed an execution with the test: "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped an execution with the test: "+result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
