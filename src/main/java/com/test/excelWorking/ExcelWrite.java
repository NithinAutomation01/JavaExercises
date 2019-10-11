package com.test.excelWorking;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ExcelWrite {
	
	static String Path = "C:\\Users\\nithin.devarajan\\Desktop\\Test1.xlsx";

	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet = workbook.createSheet("TestWritingtoExcel");
		 for(int i =0;i<3;i++) {
		 XSSFRow row = sheet.createRow(i);
		 for(int j =0;j<4;j++) {
		 Cell cell = row.createCell(j);
		 			cell.setCellValue("test"+j);
		 
		 						}
		 
		 
		 }
	}

}
