package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataExcelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{

		//Open the document in Java Read Format - Copy paste the file location of the xlsx file
		FileInputStream fis = new FileInputStream("./src/test/resources/Project Hanma.xlsx");
		
		
		//Download and add Dependency from MVN Repository - Apache POI
		//Create a Workbook
		Workbook wb = WorkbookFactory.create(fis);
				
		//Navigate to Sheet
		Sheet sh = wb.getSheet("testTable");
			
		//Navigate to Row
		Row rw = sh.getRow(1);
				
		//Navigate to Cell
		Cell cl = rw.getCell(3);
				
		//Capture the data inside the cell
		// For Text - String str = cl.getStringCellValue();
		double value = cl.getNumericCellValue();
		System.out.println(value);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
