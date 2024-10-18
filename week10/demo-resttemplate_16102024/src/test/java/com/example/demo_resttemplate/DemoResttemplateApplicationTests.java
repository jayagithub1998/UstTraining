package com.example.demo_resttemplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class DemoResttemplateApplicationTests {
	
	@Autowired
	private MockMvc mockmvc;

	@Test
	void contextLoads() throws Exception {
		mockmvc.perform(get("/redbus/9")) //sending GET request with url
		.andExpect(status().isOk()) //checking response Http Status code
		.andExpect(content().contentType(MediaType.APPLICATION_JSON)) //checking response content type
	//	.andExpect(content().contentType(MediaType.APPLICATION_XML));
		.andExpect(jsonPath("$.username").value("user8"))
		.andExpect(jsonPath("$.fromplace").value("fromplace9")) //checking content
		.andExpect(jsonPath("$.toplace").value("toplac9"))
		.andExpect(jsonPath("$.price").value("1940.0"));

	}
	@Test
	void contextDelete() throws Exception {
		mockmvc.perform(delete("/redbus/2")) 
		.andExpect(status().isOk()) 
		.andExpect(content().contentType("text/plain;charset=UTF-8")) 
		.andExpect(jsonPath("$").value("Ticket 2 is deleted"));
	}

}
