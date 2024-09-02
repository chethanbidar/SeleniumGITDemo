package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Create_excel_In_Specified_loaction {
	
	@Test
	public void Create_Excel_in_Location() {
		
		XSSFWorkbook wb= new XSSFWorkbook();
		wb.createSheet("Credentails");
		
		try {
			FileOutputStream fos = new FileOutputStream(new File ("src/test/resources/Testsuite/testsuite1.xlsx"));
			wb.write(fos);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
