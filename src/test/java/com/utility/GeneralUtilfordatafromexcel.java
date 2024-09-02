package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GeneralUtilfordatafromexcel {

	static public Object[][] readdataFromExcel(String sheetName)
	{
		File file = new File("src\\test\\resources\\Testsuite\\testsuite1.xlsx");
		Object [][] obj= null;
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet ws= wb.getSheet(sheetName);
			obj= new  Object[ws.getLastRowNum()][];
			for(int i=1; i<=ws.getLastRowNum();i++)
			{
				obj[i-1]= new Object[ws.getRow(i).getPhysicalNumberOfCells()];
				for(int j=0;j<ws.getRow(i).getPhysicalNumberOfCells();j++)
				{
					System.out.println(ws.getRow(i).getCell(j).getStringCellValue());
					obj[i-1][j]= ws.getRow(i).getCell(j).getStringCellValue();
				}
			}
			wb.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
		
	}
}
