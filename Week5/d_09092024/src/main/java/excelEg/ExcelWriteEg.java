package excelEg;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java. io.*;

public class ExcelWriteEg {
	
public static void main(String[] args) throws Exception{

	//create workbook
	Workbook wbook = new XSSFWorkbook();
	
	//create a new sheet
	Sheet st = wbook.createSheet("First Sheet");
	
	//create row
	Row row = st.createRow(0);
	
	//in above row, create cell, and set some value
	Cell cell = row.createCell(0, CellType.NUMERIC);
	cell.setCellValue(12);
	Cell celle = row.createCell(1, CellType.NUMERIC);
	celle.setCellValue(0);
	
//------------------------------------------------
	//Assignment - write no of iterations in new sheet
	//create a new sheet
		Sheet stn = wbook.createSheet("Second Sheet");
		
		//create row
		Row rown = stn.createRow(0);
		Cell celln = rown.createCell(0, CellType.NUMERIC);
		celln.setCellValue(0);
//----------------------------------------------

	Row row1 = st.createRow(1);
	//in above row, create cell, and set some value
	Cell cell1 = row1.createCell(0, CellType.NUMERIC);
	cell1.setCellValue(13);

	Row row2 = st.createRow(2);
	//in above row, create cell, and set some value
	Cell cell2 = row2.createCell(0, CellType.NUMERIC);
	cell2.setCellValue(52);
	
	

	FileOutputStream fos = new FileOutputStream("firstexcel.xlsx");
	
	//write above excel to a file
	wbook.write(fos);
	wbook.close();
	fos.close();
}
}
