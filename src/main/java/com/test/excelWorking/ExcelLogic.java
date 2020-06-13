package com.test.excelWorking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//C:\Users\Nithin\Desktop\Vision 2021\StockReports\
public class ExcelLogic {
	static FileOutputStream outputStream;
	static FileOutputStream outputStream1;

	static FileInputStream inputStream;
	static FileInputStream inputStream1;

	static XSSFWorkbook workbook;
	static XSSFWorkbook workbook1;

	static XSSFSheet sheet;
	static XSSFSheet sheet_Var;
	static Row row;
	static Row rowCounter;
	public static void main(String[] args) throws Exception {
		  String excelStockData = "C:\\Users\\Nithin\\Desktop\\StockData\\Test2.xlsx";
		  String variableCounter = "C:\\Users\\Nithin\\Desktop\\StockData\\Variables.xlsx";
	        inputStream = new FileInputStream(new File(excelStockData));
	        inputStream1 = new FileInputStream(new File(variableCounter));
	        
	         
	        workbook = new XSSFWorkbook(inputStream);
	        workbook1 = new XSSFWorkbook(inputStream1);

	        sheet = workbook.getSheetAt(0);
	        sheet_Var= workbook1.getSheetAt(0);
	        int rownum = (int) sheet_Var.getRow(0).getCell(0).getNumericCellValue();
	        System.out.println("Current row count :" +rownum);
	        rowCounter= sheet_Var.createRow(0);
	       ArrayList<Integer> al = new ArrayList<Integer>();
		 
		
		
		al.add(505);
		al.add(515);
		al.add(536);
		al.add(103);
		al.add(104);
		al.add(105);


		for(int j =rownum+1;j<=rownum+15;j++){
			row = sheet.createRow(j);

			for(int i =0;i<al.size();i++){
				Cell cellVal = row.createCell(i);
				cellVal.setCellValue(al.get(i));
				outputStream = new FileOutputStream("C:\\Users\\Nithin\\Desktop\\StockData\\Test2.xlsx");
				workbook.write(outputStream);
				Thread.sleep(1000);
				}
			
		
			
		}
		
System.out.println("completed");
int rowsNum = sheet.getPhysicalNumberOfRows();
System.out.println(rowsNum);
Cell rows_value = rowCounter.createCell(0);
rows_value .setCellValue(rowsNum);
outputStream = new FileOutputStream("C:\\Users\\Nithin\\Desktop\\StockData\\Variables.xlsx");
workbook1.write(outputStream);

	}

}
