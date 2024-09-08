package com.exceleg;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java. io.*;

public class ExcelWriteEg2 {
	static String sarr[][]= {{"aaaa","bbbb","cccc"},{"ddddd","eeeee","fffff"},{"gggg","hhhhh","iiiii"}};
	
	public static void main(String[] args) {
		try {
		Workbook wbook = new XSSFWorkbook();
		
		Sheet st = wbook.createSheet("First Sheet");
		
		for(int i=0;i<sarr.length;i++) {
			Row row=st.createRow(i);
			for(int j=0;j<sarr[i].length;j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue(sarr[i][j]);
				System.out.print("Writing element "+sarr[i][j]);
			}
			System.out.println();
		}
		FileOutputStream fos = new FileOutputStream("./SecondExcel1.xlsx");
		// ../ => execl will craete on the parent directory of SecondExcel.xlsx
		//../../ =>execl will craete on the parent of parent directory of SecondExcel.xlsx
		wbook.write(fos);
	}catch(Exception et) {
		et.printStackTrace();
	}
	}
}
