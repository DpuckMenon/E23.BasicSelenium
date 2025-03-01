package testNG;

import org.testng.annotations.Test;

public class SampleTest {
	
	
	//Execution takes place based on ASCII Values (in Ascending Order)
	//Can change the order of execution using priority (Lowest priority runs first, default priority = 0)
	
	@Test (priority = -1)
	public void createCustomer() 
	{
		System.out.println("Create");
	}
	
	//enabled = true/false - True, will run and False - Won't run
	//Assert.fail(); - Purposely fail
	//dependsOnMethods - one method depends on another
	
	@Test (enabled = false)
	public void deleteCustomer1() 
	{
		
		System.out.println("Delete");
	}
	
	@Test (invocationCount = 3)
	public void modifyCustomer() {
		System.out.println("Modify");
		
	}
	
	@Test (priority = 2)
	public void deleteCustomer () {
		
		System.out.println("Delete");
		
		
	}
	
	
	
	
	

}
