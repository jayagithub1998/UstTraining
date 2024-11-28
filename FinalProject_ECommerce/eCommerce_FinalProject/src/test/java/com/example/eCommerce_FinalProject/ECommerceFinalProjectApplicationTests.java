package com.example.eCommerce_FinalProject;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ECommerceFinalProjectApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	private static Workbook wbook;

	private static Sheet st;
	
	private  static WebDriver driver;
	private static WebDriverWait wait;

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
	
	@BeforeAll
	public static void setUp() {
		//set driver property
		//load driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		//create an instance of chrome driver
		driver = new ChromeDriver();
		
		//wait
		wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		ExcelReadUtils.init();
		
	}
	
	static Stream<Arguments> wFetchProduct() {
		return ExcelReadUtils.fetchProduct();
	}
	@Order(1)
	@ParameterizedTest
	@MethodSource("wFetchProduct")
	void testGetTicket(String testcaseid,String product,int pid, String pName, String pCategory) throws Exception {
		try {
			ResultActions resultActions = mockMvc.perform(get("/product/" + product)) // Sending GET request with url
					.andExpect(status().isOk()) // checking response Http Status code
					// below, checking response Content Type
					.andExpect(content().contentType(MediaType.APPLICATION_JSON))
					.andExpect(jsonPath("$.product_Category").value(pCategory))
					.andExpect(jsonPath("$.product_name").value(pName))
					.andExpect(jsonPath("$.product_id").value(pid));
		} catch (AssertionError ae) {
			eWUtils.createTestResultRow(testcaseid +" : Failed", st);
			throw ae;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		eWUtils.createTestResultRow(testcaseid +" : Passed", st);
		System.out.println("----------------------------------------");
	}
	
	static Stream<Arguments> wNoProductComment() {
		return ExcelReadUtils.NoSuchProduct();
	}
	
	@Order(2)
	@ParameterizedTest
	@MethodSource("wNoProductComment")
	void testNoProduct(String testcaseid,String product,String comment) throws Exception {
		try {
			ResultActions resultActions = mockMvc.perform(get("/product/" + product)) // Sending GET request with url
					.andExpect(status().isNotFound()) // checking response Http Status code
					.andExpect(jsonPath("$").value(comment));
				
		} catch (AssertionError ae) {
			eWUtils.createTestResultRow(testcaseid +" : Failed", st);
			throw ae;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		eWUtils.createTestResultRow(testcaseid +" : Passed", st);
		System.out.println("----------------------------------------");
	}

	static Stream<Arguments> productWebTest() {
		return ExcelReadUtils.getWebTestData();
	}
	
	@Order(3)
	@ParameterizedTest
	@MethodSource("productWebTest")
	public void testProductFrontEnd(String testcaseid,String product,String result) throws InterruptedException {
		try {
		//Open the HTML page (replace with actual URL)
		driver.get("File:///C:\\Users\\Administrator\\Downloads\\eCommerce_FinalProject\\src\\main\\resources\\Product.html");
		
		//create HomePage
		ProductPage productPage = new ProductPage(driver);

		
		//wait until About page is loaded
		wait.until(ExpectedConditions.titleContains("Product"));
		Thread.sleep(2000);
		//assert with page title
		assertTrue(driver.getTitle().contains("Product"));
		
		productPage.InputSearchProduct(driver, product);
		Thread.sleep(2000);
		
		productPage.seachProduct(driver);
		Thread.sleep(2000);
		
		String prodResult = productPage.verifyProduct(driver);
		System.out.println("Result "+prodResult);
		assertTrue(prodResult.contains(result));
	} catch (AssertionError ae) {
		eWUtils.createTestResultRow(testcaseid +" : Failed", st);
		throw ae;
	} catch (Exception e) {
		System.out.println(e.getMessage());
		// e.printStackTrace();
	}

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

	@AfterAll
	public static void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
	}

}
