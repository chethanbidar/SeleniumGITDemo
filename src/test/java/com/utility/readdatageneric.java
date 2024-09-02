package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readdatageneric {

	@Test
	public void readDataFromExcel() throws IOException {

		File file = new File("src/test/resources/Testsuite/testsuite1.xlsx");

		
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook= new XSSFWorkbook(fis);
			XSSFSheet ws= workbook.getSheet("Credentails");
			
			for(int i=1;i<=ws.getLastRowNum();i++) {
				for(int j=0; j<ws.getRow(i).getPhysicalNumberOfCells();j++)
				{
				System.out.print(ws.getRow(i).getCell(j).getStringCellValue()+"\t");
				//System.out.println(worksheet.getRow(i).getCell(1).getStringCellValue());
				}
				System.out.println();
			}
			
			ws.getRow(0).createCell(2).setCellValue("Role");
			ws.getRow(1).createCell(2).setCellValue("admin");
			ws.getRow(2).createCell(2).setCellValue("client Admin");
			ws.getRow(3).createCell(2).setCellValue("FinMan");
			
			FileOutputStream fos= new FileOutputStream(file);
			workbook.write(fos);
			fos.close();
			
			
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
