package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {
	
@Test 
public void demoTest()
{
	System.out.println("step 1");
	System.out.println("step 2");
	
	Assert.assertEquals(1,1);
	
	System.out.println("step 3");
	System.out.println("step 4");
	
	Assert.assertEquals(1,0);
	
	System.out.println("step 5");
	
}











}

