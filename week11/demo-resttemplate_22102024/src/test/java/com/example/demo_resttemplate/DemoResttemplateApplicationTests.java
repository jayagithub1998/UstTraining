package com.example.demo_resttemplate;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
class DemoResttemplateApplicationTests {
	
	@Autowired
	private MockMvc mockmvc;
	
	private static Workbook wbook;
	private static Sheet st;
	private static int test_case_no;
	
	@BeforeAll
	static void meb() {
		//open or create excel
		wbook = new XSSFWorkbook();
		st=wbook.createSheet("First Sheet");
		test_case_no=0;
	}
	
	
	public static Stream<Arguments>fetchTicketParametersExcel(){
		List<Arguments> args = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("D:\\Softwares\\Book2.xlsx");
			Workbook wbook = new XSSFWorkbook(fis);
			double value=0;
			int no_of_rows=0;
			Sheet st = null;
			st =wbook.getSheetAt(0);
			no_of_rows=st.getPhysicalNumberOfRows();
			for(int i=0;i<no_of_rows;i++) {
				Row row=st.getRow(i);
				int no_of_cols = row.getLastCellNum();
				
				Cell cell1= row.getCell(0);
				int ticketid=(int)cell1.getNumericCellValue();
				
				Cell cell2 = row.getCell(1);
				String fromplace = cell2.getStringCellValue();
				
				Cell cell3 = row.getCell(2);
				String toplace = cell3.getStringCellValue();
				
				Cell cell4= row.getCell(3);
				float price=(float)cell4.getNumericCellValue();

				
				args.add(Arguments.of(ticketid,fromplace,toplace,price));
			}
			wbook.close();
			fis.close();
					
		}catch(Exception e) {
			System.out.println("Exceptionnnn");
		}
		return args.stream();
	}
	
	@ParameterizedTest
	@MethodSource("fetchTicketParametersExcel")
	void testGetTicketMultipleParameterizedTestExcel(int ticketid,String fromplace,String toplace,float price) throws Exception {
		try {
		ResultActions resultActions = mockmvc.perform(get("/redbus/"+ticketid))
		.andExpect(status().isOk()) 
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.fromplace").value(fromplace))
		.andExpect(jsonPath("$.toplace").value(toplace))
		.andExpect(jsonPath("$.price").value(price))
		.andDo(print());
		String jsonresponse = resultActions.andReturn().getResponse().getContentAsString();
		System.out.println("Json Response :"+jsonresponse);

	}catch(AssertionError ae) {
		Row row=st.createRow(test_case_no);
		Cell cell1 = row.createCell(0,CellType.NUMERIC);
		Cell cell2 = row.createCell(1,CellType.STRING);
		Cell cell3 = row.createCell(2,CellType.STRING);
		cell1.setCellValue(test_case_no);
		cell2.setCellValue("Testcase failed");
		cell3.setCellValue(ae.getMessage());
		
		System.out.println("Testcase failed");
		System.out.println(ae.getMessage());
		throw ae;
	}
		catch(Exception e) {
		System.out.println(e.getMessage());
		//e.printStackTrace();
	}
		Row row=st.createRow(test_case_no);
		Cell cell1 = row.createCell(0,CellType.NUMERIC);
		Cell cell2 = row.createCell(1,CellType.STRING);
		cell1.setCellValue(test_case_no);
		cell2.setCellValue("Testcase passed");
		System.out.println("Testcase passed");
		System.out.println("-----------------------------------------------------");
	}

	@AfterEach
	void metae() {
		test_case_no ++;
	}

	@AfterAll
	static void meta() {
		//close excel
		try {
			FileOutputStream fos = new FileOutputStream("testReport.xlsx");
			wbook.write(fos);
			wbook.close();
			fos.close();
			
		}catch(Exception e) {
			System.out.println("Exceptionaaa"+e.getMessage());
		}
	}

}
