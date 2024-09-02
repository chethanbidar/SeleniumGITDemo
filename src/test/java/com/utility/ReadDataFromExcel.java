package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel {

	@Test
	public void read_Data() {

		File file = new File("src/test/resources/Testsuite/testsuite1.xlsx");

		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook= new XSSFWorkbook(fis);
			XSSFSheet worksheet= workbook.getSheet("Credentails");
			
			for(int i=1;i<=worksheet.getLastRowNum();i++) {
				System.out.print(worksheet.getRow(i).getCell(0).getStringCellValue()+"\t");
				//System.out.println(worksheet.getRow(i).getCell(1).getStringCellValue());	
			}
			/*
			 * System.out.println(worksheet.getRow(0).getCell(0).getStringCellValue());
			 * System.out.println(worksheet.getRow(0).getCell(1).getStringCellValue());
			 */

			workbook.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
