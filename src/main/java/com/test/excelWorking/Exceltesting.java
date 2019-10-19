package com.test.excelWorking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltesting {

	public static Object[][] readExcel() throws Exception {

		FileInputStream fs =new FileInputStream("C:\\Users\\nithin.devarajan\\Desktop\\excel.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fs);
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int row = wsheet.getLastRowNum();
		int cell = wsheet.getRow(1).getLastCellNum();
		System.out.println(row + " "+cell);
		Object[][] data = new Object[row][cell];
		String str = wsheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(str);
		for(int i =0 ; i<row;i++) {
			for(int j = 0 ;j<cell;j++) {
				String stringCellValue = wsheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j]= stringCellValue;

			}
		}
		return data;
		
	}


}
