package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.testng.annotations.Test;

public class CtreateWorkBook {

	@Test
	public void create_workbook() {
		XSSFWorkbook wb = new XSSFWorkbook();// create excel file
		XSSFSheet ws1= wb.createSheet("TestData"); //naming the created exccel sheet 
		
		XWPFDocument document = new XWPFDocument();  
		
		//wb.createSheet("testdata2");
		
		try {
			FileOutputStream fos1= new FileOutputStream(new File ("NewExcelsheet1.xlsx"));
			FileOutputStream fos= new FileOutputStream(new File ("Newwordfile.docx"));// naming the exel file 
			
			wb.write(fos1);// wb.close();
			document.write(fos);
			wb.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
