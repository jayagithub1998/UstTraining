package com.exceleg;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java. io.*;

public class ExcelReadEg {
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

		for(int k=0;k<no_of_sheets;k++) {
			Sheet st=wbook.getSheetAt(k);

			int no_of_rows = st.getPhysicalNumberOfRows();
			
			for(int i=0;i< no_of_rows;i++) {
				Row row = st.getRow(i);
				int no_of_cols=row.getLastCellNum();
				
				for(int j=0;j<no_of_cols;j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell.getStringCellValue());
				}
			}
		}
		wbook.close();
		fis.close();
	}

}
