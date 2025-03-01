package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("@Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("@Test Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("@Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("@Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("@Test Failed but within Success %");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("@Test Failed with Timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("@Test on Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("@Test On Finish");
		
	}

	
	
	
}
