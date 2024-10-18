package com.example.demo_resttemplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

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
/*	@Test
	void contextDelete() throws Exception {
		mockmvc.perform(delete("/redbus/2")) 
		.andExpect(status().isOk()) 
		.andExpect(content().contentType("text/plain;charset=UTF-8")) 
		.andExpect(jsonPath("$").value("Ticket 2 is deleted"));
	}
	
	*/
	
	@Test
	void testBookTicket() throws Exception{
		mockmvc.perform(post("/redbus")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"username\":\"acv\",\"fromplace\":\"tuv\",\"toplace\":\"rtyu\",\"price\":100}")
		).andExpect(status().isCreated())
				//).andExpect(status().is(201));
		.andDo(print())
		.andExpect(jsonPath("$.username").value("acv"));
			
	}
	
	@Test
	void testUpdateTicket() throws Exception{
		mockmvc.perform(put("/redbus/11")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"fromplace\":\"fromplace11\",\"toplace\":\"toplace11\"}")
		).andExpect(status().isCreated())
				//).andExpect(status().is(201));
		.andExpect(jsonPath("$.fromplace").value("fromplace11"))
		.andExpect(jsonPath("$.toplace").value("toplace11"));
			
	}

}
