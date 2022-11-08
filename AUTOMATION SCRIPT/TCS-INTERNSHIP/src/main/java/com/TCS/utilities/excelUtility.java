 package com.TCS.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {
	 private static XSSFWorkbook excelWBook;
	 private static XSSFSheet excelWSheet;
	 public static String getCellData(int row,int column) throws IOException {
		 FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources"+"\\testData.xlsx");
		 excelWBook=new XSSFWorkbook(file);
		 excelWSheet=excelWBook.getSheetAt(0);
		 return excelWSheet.getRow(row).getCell(column).getStringCellValue(); 	 
		
	 }
	
	public static Long getNumericCellData(int RowNum, int ColNum) throws IOException {

		FileInputStream ExcelFile = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources" + "/testData.xlsx");
		excelWBook = new XSSFWorkbook(ExcelFile);
		excelWSheet = excelWBook.getSheetAt(0);
		return (long)excelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
	}
}
