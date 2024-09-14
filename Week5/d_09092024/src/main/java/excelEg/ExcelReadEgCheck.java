package excelEg;
import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadEgCheck {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
				// open file
				FileInputStream fis = new FileInputStream("./firstexcel.xlsx");

				// read workbook
				Workbook wbook = new XSSFWorkbook(fis);

				System.out.println("No. of sheets" + wbook.getNumberOfSheets());

				int no_of_sheets = wbook.getNumberOfSheets();
				
				double value = 0;

				int no_of_rows = 0;
				Sheet st = null;
				for (int k = 0; k < no_of_sheets-1; k++) {
					// read sheet
					st = wbook.getSheetAt(k);

					no_of_rows = st.getPhysicalNumberOfRows();

					for (int i = 0; i < no_of_rows; i++) {
						// read rows
						Row row = st.getRow(i);

						int no_of_cols = row.getLastCellNum();

						for (int j = 0; j < no_of_cols; j++) {
							// read cells
							Cell cell = row.getCell(j);

							value = value + cell.getNumericCellValue();
						}
					}
				}
				System.out.println("sum is "+value);
				
				fis.close();
				

				FileOutputStream fos = new FileOutputStream("./firstexcel.xlsx");
				
				Row row = st.createRow(no_of_rows);
				System.out.println("Created row..."+(no_of_rows));
				Cell cell = row.createCell(0);
				cell.setCellValue(value);

				//get values of iterations
				Row row9 = st.getRow(0);
				Cell cell9=row9.getCell(1);
				double No_times_Executed=cell9.getNumericCellValue();
				
				No_times_Executed++;			
				cell9.setCellValue(No_times_Executed);
				System.out.println(No_times_Executed);
				
				//-----------------------------------
				Sheet st_new = wbook.getSheetAt(1);
				Row row_new=st_new.getRow(0);
				Cell cell_new=row_new.getCell(0);
			//	double No_times_Executed=cell_new.getNumericCellValue();
			//	No_times_Executed++;
				cell_new.setCellValue(No_times_Executed);
				System.out.println("Printed in new sheet");
				//---------------------------------------
				
				wbook.write(fos);
				
				fos.close();

			}
}
