package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) {
	String path="D:/shared.xlsx";
	
		FileInputStream file;
		try {
			file = new FileInputStream( 
			         new File("D://shared.xlsx"));
		

	         // Create Workbook instance holding reference to 
	         // .xlsx file 
	         XSSFWorkbook workbook = new XSSFWorkbook(file); 

	         // Get first/desired sheet from the workbook 
	       //  XSSFSheet sheet = workbook.getSheetAt(0); 
    
    //creating a Sheet object using the sheet Name
  //  HSSFSheet sheet=wb.getSheet("STUDENT_DATA");
    XSSFSheet sheet = workbook.getSheetAt(0); 
sheet.getLastRowNum();
    
    //Create a row object to retrieve row at index 3
    XSSFRow row2=sheet.createRow(sheet.getLastRowNum()+1);
    int i=row2.getLastCellNum();
  
    
   // row2.createCell(i).setCellValue("sharma");
    //create a cell object to enter value in it using cell Index
    row2.createCell(0).setCellValue("Diana");
    row2.createCell(1).setCellValue("Jane");
    row2.createCell(2).setCellValue("djanes@gmail.com");
    row2.createCell(3).setCellValue("Female");
    row2.createCell(4).setCellValue("8786858432");
    row2.createCell(5).setCellValue("Park Lane, Flat C1 , New Jersey");
    
    //write the data in excel using output stream
    FileOutputStream outputStream = new FileOutputStream("D:/shared.xlsx");
    workbook.write(outputStream);
   
    
    workbook.close();

System.out.print("done");
	}
    catch (Exception e) {
		// TODO: handle exception
    	System.out.println(e.getMessage());
	}
}

}
