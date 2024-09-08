package com.exceleg;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java. io.*;

public class ExcelReadEg2 {
	public static void main(String[] args) throws IOException {
		//FileInputStream fis = new FileInputStream("./firstexcel.xlsx");
		FileInputStream fis = new FileInputStream("./SecondExcel1.xlsx");
		Workbook wbook = new XSSFWorkbook(fis);
		System.out.println("No of sheets "+wbook.getNumberOfSheets());
		/*	Sheet st = wbook.getSheetAt(0);
		Row row = st.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());*/

		int no_of_sheets = wbook.getNumberOfSheets();
		double value=0;
		int no_of_rows=0;
		int no_of_cols=0;
		Sheet st=null;
		for(int k=0;k<no_of_sheets;k++) {
			st=wbook.getSheetAt(k);

			no_of_rows = st.getPhysicalNumberOfRows();
			
			for(int i=0;i< no_of_rows;i++) {
				Row row = st.getRow(i);
				no_of_cols=row.getLastCellNum();
				
				for(int j=0;j<no_of_cols;j++) {
					Cell cell = row.getCell(j);
					//System.out.println(cell.getStringCellValue());
					value=value + cell.getNumericCellValue();
				}
			}
		}
		
		System.out.println("Sum is "+value);
		Row row=st.createRow(no_of_rows+1);
		Cell cell = row.createCell(0);
		cell.setCellValue(value);
		wbook.close();
		fis.close();
	}

}


