package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice1 {
	
	@Test
	public void demoTest()
	{
		String a = "hello";
		
		SoftAssert sa = new SoftAssert();
		
		System.out.println("step 1");
		System.out.println("step 2");
		
		
		Assert.assertEquals(0,1);//fail
		
		System.out.println("step 3");
		
		sa.assertTrue(a.contains("d"));//fail
		
		System.out.println("step 4");
		
		sa.assertTrue(a.contains("f")); //fail);
		
		System.out.println("step 5");
		
		sa.assertAll();
		
	}

}


