
package com.test.excelWorking;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadInExcel  {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	static String Path = "C:\\Users\\nithin.devarajan\\Desktop\\Test.xlsx";
	




	public static void main(String[] args) throws Exception {
	
   FileInputStream ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		int num_of_Sheets =ExcelWBook.getNumberOfSheets();
		/*ExcelWBook.createSheet();*/
		for(int j =1;j<num_of_Sheets;j++) {
			ExcelWSheet = ExcelWBook.getSheetAt(j);
			String SheetName = ExcelWSheet.getSheetName();
			int rowcount = ExcelWSheet.getLastRowNum();


			for (int i =1;i<=rowcount;i++) {
				int colcount = ExcelWSheet.getRow(i).getLastCellNum();
				if(colcount>1) {
					for(int k =0;k<colcount;k++) {
						Cell = ExcelWSheet.getRow(i).getCell(k);
						String CellData1 = Cell.getStringCellValue();
						System.out.println(CellData1);

					} System.out.println("---------------------");

				}

				Cell = ExcelWSheet.getRow(i).getCell(0);




				String CellData = Cell.getStringCellValue();
				/*XSSFRow CellData2 = Cell.getRow();
				int value =CellData2.getRowNum();*/

				System.out.println("coming from the"+SheetName + "sheet : " +CellData);


			}
			System.out.println("-------------------------------------------------------");

		}
	}



}