package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDatainExcel {

	@Test
	public void writeInGeneric() throws IOException {
		File file = new File("src/test/resources/Testsuite/writeExcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		 
		 XSSFSheet ws =wb.getSheet("Credentils");
		 int o=10;

		for(int i=1; i<=o;i++)
		{ 
			//for(int j=0;j<ws.getRow(i).getPhysicalNumberOfCells();j++)
			{
				ws.getRow(i).createCell(0).setCellValue("admin");
			}
		}

		/*
		 * ws.getRow(0).createCell(1).setCellValue("admin");
		 * ws.getRow(0).createCell(2).setCellValue("admin1");
		 * ws.getRow(0).createCell(3).setCellValue("admin2");
		 */
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		fos.close();

	}

}
