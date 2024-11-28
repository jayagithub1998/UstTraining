package com.example.eCommerce_FinalProject;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.params.provider.Arguments;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;

@Component
public class ExcelReadUtils {
	private static Workbook wbook;
	private static Sheet sheet;
	private static int current_row_num;
	
	// create one more method which opens excel file, sheet, row
	public static void init() {
		try {
			//read apth from JSON file
			ObjectMapper omapper = new ObjectMapper();
			FileInputStream sfis = new FileInputStream("./settings.json");
			CustomProperties obj = omapper.readValue(sfis, CustomProperties.class);
						
			System.out.println("Path:" + obj.getIexcelpath());
			// read Testdata from excel
			FileInputStream fis = new FileInputStream(obj.getIexcelpath());

			// read workbook
			wbook = new XSSFWorkbook(fis);

			sheet = wbook.getSheetAt(0);

			current_row_num = 0;
		} catch (Exception en) {
			System.out.println("Exception in initt" + en.getMessage());
		}
	}

	// can be moved to different Java file
	public static Stream<Arguments> fetchProduct() {
		List<Arguments> args = new ArrayList<>();

		// fetch no. of test data rows(N), dynamically
		Row row = sheet.getRow(current_row_num++);
		Cell cell1 = row.getCell(0);
		int num_of_testcases = (int) cell1.getNumericCellValue();
		System.out.println("num_of_testcases" + num_of_testcases);
		// fetch N number of rows and return Stream<Arguments>

		try {// 1,2,3,4
			for (int i = current_row_num; i < (current_row_num + num_of_testcases); i++) {
				// fetch each row
				Row rowi = sheet.getRow(i);
				System.out.println("current_row_num" + current_row_num);
				
				// read first column - ticket id
				Cell celltcid = rowi.getCell(0);
				String testcaseid = celltcid.getStringCellValue();
				
				Cell cellproduct = rowi.getCell(1);
				String product = cellproduct.getStringCellValue();
				// read first column - ticket id
				Cell cellpid = rowi.getCell(2);
				int pId = (int) cellpid.getNumericCellValue();

				// read second col - fromplace
				Cell cellname = rowi.getCell(3);
				String pName = cellname.getStringCellValue();

				// read third col - toplace
				Cell cellcategory = rowi.getCell(4);
				String pCategory = cellcategory.getStringCellValue();

				// add each Test data bundle to List
				args.add(Arguments.of(testcaseid,product,pId, pName, pCategory));
			}
			current_row_num = current_row_num + num_of_testcases;
		} catch (Exception e) {
			System.out.println("Exceptionnnn:" + e.getMessage());
			e.printStackTrace();
		}
		// create and return Stream from List of JUnit Arguments
		return args.stream();
	}
	
	public static Stream<Arguments> NoSuchProduct() {
		List<Arguments> args = new ArrayList<>();

		// fetch no. of test data rows(N), dynamically
		Row row = sheet.getRow(current_row_num++);
		Cell cell1 = row.getCell(0);
		int num_of_testcases = (int) cell1.getNumericCellValue();
		System.out.println("num_of_testcases" + num_of_testcases);
		// fetch N number of rows and return Stream<Arguments>

		try {// 1,2,3,4
			for (int i = current_row_num; i < (current_row_num + num_of_testcases); i++) {
				// fetch each row
				Row rowi = sheet.getRow(i);
				System.out.println("current_row_num" + current_row_num);
				
				// read first column - ticket id
				Cell celltcid = rowi.getCell(0);
				String testcaseid = celltcid.getStringCellValue();
				
				Cell cellproduct = rowi.getCell(1);
				String product = cellproduct.getStringCellValue();
				// read first column - ticket id
				Cell cellComment = rowi.getCell(2);
				String comment = cellComment.getStringCellValue();

				// add each Test data bundle to List
				args.add(Arguments.of(testcaseid,product,comment));
			}
			current_row_num = current_row_num + num_of_testcases;
		} catch (Exception e) {
			System.out.println("Exceptionnnn:" + e.getMessage());
			e.printStackTrace();
		}
		// create and return Stream from List of JUnit Arguments
		return args.stream();
	}

	public static Stream<Arguments> getWebTestData() {
		List<Arguments> args = new ArrayList<>();

		// fetch no. of test data rows(N), dynamically
		Row row = sheet.getRow(current_row_num++);
		Cell cell1 = row.getCell(0);
		int num_of_testcases = (int) cell1.getNumericCellValue();
		System.out.println("num_of_testcases" + num_of_testcases);
		// fetch N number of rows and return Stream<Arguments>

		try {// 1,2,3,4
			for (int i = current_row_num; i < (current_row_num + num_of_testcases); i++) {
				// fetch each row
				Row rowi = sheet.getRow(i);
				System.out.println("current_row_num" + current_row_num);
				
				// read first column - ticket id
				Cell celltcid = rowi.getCell(0);
				String testcaseid = celltcid.getStringCellValue();
				
				Cell cellproduct = rowi.getCell(1);
				String product = cellproduct.getStringCellValue();
				// read first column - ticket id
				Cell cellresult = rowi.getCell(2);
				String result = cellresult.getStringCellValue();

				// add each Test data bundle to List
				args.add(Arguments.of(testcaseid,product,result));
			}
			current_row_num = current_row_num + num_of_testcases;
		} catch (Exception e) {
			System.out.println("Exceptionnnn:" + e.getMessage());
			e.printStackTrace();
		}
		// create and return Stream from List of JUnit Arguments
		return args.stream();
	}




}
