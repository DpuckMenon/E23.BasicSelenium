package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonDataPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Create a FILE in .properties format under src/test/resources first
		
		//Open the document in Java read format
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
		
		//Create 
		Properties p = new Properties();
		
		//Load the file to properties class
		p.load(fis);
		
		//Provide the key and capture the value
		String value = p.getProperty("username");
		System.out.println(value);
		
		String value1 = p.getProperty("password");
		System.out.println(value1);
		
		String value2 = p.getProperty("abc");
		System.out.println(value2);
		
		String value3 = p.getProperty("url");
		System.out.println(value3);
		
		
		
		
		
		
		
		

	}

}
