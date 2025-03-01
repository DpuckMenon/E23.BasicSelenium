package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	
	@Test(dataProvider = "getData", groups = "smoke")
	public void addPhoneToCart(String Pname, String Pmodel, int Price, int Qty) 
	
	{		
		System.out.println(Pname+ "->" + Pmodel+ "->" + Price+ "->" + Qty);
	}
	
	@DataProvider
	public Object [][] getData()
	{								// 3data sets of 4 information each
		Object [][] data = new Object[3][4];
		
		data [0] [0] = "Samsung";
		data [0] [1] = "A80";
		data [0] [2] = 12000;
		data [0] [3] = 20;
		
		data [1] [0] = "Iphone";
		data [1] [1] = "S16";
		data [1] [2] = 120000;
		data [1] [3] = 6;
		
		data [2] [0] = "Vivo";
		data [2] [1] = "A11";
		data [2] [2] = 10000;
		data [2] [3] = 8;
		
		return data;
		
	}

}
