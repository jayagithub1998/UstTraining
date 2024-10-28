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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import org.springframework.test.web.servlet.*;

//import static java.lang.System.*;
@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoResttemplateApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	private static Workbook wbook;

	private static Sheet st;

	@Autowired
	ExcelReadUtils eRUtils;

	@Autowired
	ExcelWriteUtils eWUtils;

	@BeforeAll
	static void metb() {

		ExcelReadUtils.init();
		// open or create excel(Test Report)
		// create workbook
		wbook = new XSSFWorkbook();

		// create a new sheet
		st = wbook.createSheet("First Sheet");
	}

	@BeforeEach
	void met() {

	}

	static Stream<Arguments> wFetchTicketIds() {
		return ExcelReadUtils.fetchTicketIds();
	}
	@Order(1)
	@ParameterizedTest
	@MethodSource("wFetchTicketIds")
	void testGetTicket(String testcaseid,int ticketid, String fromplace, String toplace, float price) throws Exception {
		try {
			ResultActions resultActions = mockMvc.perform(get("/redbus/" + ticketid)) // Sending GET request with url
					.andExpect(status().isOk()) // checking response Http Status code
					// below, checking response Content Type
					.andExpect(content().contentType(MediaType.APPLICATION_JSON))
					.andExpect(jsonPath("$.fromplace").value(fromplace))
					.andExpect(jsonPath("$.toplace").value(toplace))
					.andExpect(jsonPath("$.price").value(price));
			// .andDo(print());
			Ticket ticket = eRUtils.fetchTicket(resultActions);
			System.out.println("From Placeee:" + ticket.getFromplace());
		} catch (AssertionError ae) {
			eWUtils.createTestResultRow(testcaseid +" : Failed", st);
			throw ae;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		// create row in excel
		// create row
		eWUtils.createTestResultRow(testcaseid +" : Passed", st);
		System.out.println("----------------------------------------");
	}

	@AfterAll
	static void meta() {
		try {
			// close excel
		//	FileOutputStream fos = new FileOutputStream("testreport.xlsx");
			
			ObjectMapper omapper=new ObjectMapper();
			FileInputStream sfis = new FileInputStream("./settings.json");
			CustomProperties obj = omapper.readValue(sfis,CustomProperties.class);
			FileOutputStream fos = new FileOutputStream(obj.getOexcelpath());
			

			// write above excel to a file
			wbook.write(fos);
			wbook.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Exceptionaa:" + e.getMessage());
		}
	}
	// id which doesnt exist
	// not int id

	static Stream<Arguments> excelReadTicketJson() {
		return ExcelReadUtils.readTicketJson();
	}

	//@Disabled
	@Order(2)
	 @ParameterizedTest
	 @MethodSource("excelReadTicketJson")
	void testBookTicket(String testcaseid,String ticketjson, String username) throws Exception {
		// call method which reads JSON from Excel
		try {
		mockMvc.perform(post("/redbus").contentType(MediaType.APPLICATION_JSON).content(ticketjson))
					.andExpect(status().isCreated()).andExpect(content().contentType(MediaType.APPLICATION_JSON))
					// .andDo(print())
					.andExpect(jsonPath("$.username").value(username));
		} catch (AssertionError e) {
			System.out.println("Test Case: Failed\n" + e.getMessage());
			eWUtils.createTestResultRow(testcaseid+" : Failed", st);
			throw e;
		} catch (Exception e) {
			System.out.println("Exceptionn:" + e.getMessage());
		}

		System.out.println("Test Case: Pass");
		eWUtils.createTestResultRow(testcaseid+" : Passed", st);
	}

	 
		static Stream<Arguments> excelUpdateTicketJson() {
			return ExcelReadUtils.updateTicket();
		}
	 
	 @Disabled
	// @ParameterizedTest
	 @MethodSource("excelUpdateTicketJson")
	void testUpdateTicket(String testcaseid,int ticketid,String ticketjson, String fromplace,String toplace,float price) throws Exception {
		// call method which reads JSON from Excel
		try {
			mockMvc.perform(put("/redbus/"+ticketid)
					.contentType(MediaType.APPLICATION_JSON).content(ticketjson))
					.andExpect(status().isCreated()).andExpect(content().contentType(MediaType.APPLICATION_JSON))
					// .andDo(print())
					.andExpect(jsonPath("$.fromplace").value(fromplace))
					.andExpect(jsonPath("$.toplace").value(toplace))
					.andExpect(jsonPath("$.price").value(price));
		} catch (AssertionError e) {
			System.out.println("Test Case: Failed\n" + e.getMessage());
			eWUtils.createTestResultRow(testcaseid+" : Failed", st);
			throw e;
		} catch (Exception e) {
			System.out.println("Exceptionn:" + e.getMessage());
		}

		System.out.println("Test Case: Pass");
		eWUtils.createTestResultRow(testcaseid+" : Passed", st);
	}
	 
	 
	 
		static Stream<Arguments> excelUpdateTicketJsontest() {
			return ExcelReadUtils.updateTicket();
		}
	 
	//Disabled
	@Order(3)
	@ParameterizedTest
	 @MethodSource("excelUpdateTicketJsontest")
	void testUpdateTicketJson(String testcaseid,int ticketid,String ticketjson, String fromplace,String toplace,float price) throws Exception {
		mockMvc.perform(put("/redbus/"+ticketid).contentType(MediaType.APPLICATION_JSON)
				.content(ticketjson))
				.andExpect(status().isCreated());
	}
	
	static Stream<Arguments> deleteTicket() {
		return ExcelReadUtils.deleteTicket();
}
	
	@Order(5)
	 @ParameterizedTest
	 @MethodSource("deleteTicket")
	void cancelTicket(String testcaseid,int ticketid) throws Exception {
		 try {
		mockMvc.perform(delete("/redbus/" + ticketid)).andExpect(status().isOk());
		 } catch (AssertionError e) {
				System.out.println("Test Case: Failed\n" + e.getMessage());
				eWUtils.createTestResultRow(testcaseid+" : Failed", st);
				throw e;
			} catch (Exception e) {
				System.out.println("Exceptionn:" + e.getMessage());
			}
		
			System.out.println("Test Case: Pass");
			eWUtils.createTestResultRow(testcaseid+" : Passed", st);
		}

}
