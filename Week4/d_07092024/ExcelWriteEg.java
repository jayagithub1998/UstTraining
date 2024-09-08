package com.exceleg;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
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
		Cell cell = row.createCell(0);
		cell.setCellValue("Hello");

		FileOutputStream fos = new FileOutputStream("firstexcel.xlsx");

		//write above excel to a file
		wbook.write(fos);
		wbook.close();
		fos.close();
	}
}
