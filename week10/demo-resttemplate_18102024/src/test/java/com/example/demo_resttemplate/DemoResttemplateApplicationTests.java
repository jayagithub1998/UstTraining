package com.example.demo_resttemplate;

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

import java.util.stream.Stream;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
class DemoResttemplateApplicationTests {
	
	@Autowired
	private MockMvc mockmvc;
	
	@Disabled
	//@Test
	void testGetTicket() throws Exception {
		ResultActions resultActions = mockmvc.perform(get("/redbus/9"))
		.andExpect(status().isOk()) 
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.username").value("user8"))
		.andExpect(jsonPath("$.fromplace").value("fromplace9")) //checking content
		.andExpect(jsonPath("$.toplace").value("toplac9"))
		.andExpect(jsonPath("$.price").value("1940.0"))
		.andDo(print());
		
		String jsonresponse=
				resultActions.andReturn().getResponse().getContentAsString();
		System.out.println("Json Response :"+jsonresponse);
		
		//json string to java object
		
		ObjectMapper omapper = new ObjectMapper();
		Ticket ticket = omapper.readValue(jsonresponse, Ticket.class);
		System.out.println("From placee :"+ticket.getFromplace());
		

	}
	
	//Paremerterised test
	private static Stream<Integer> fetchTicketIds(){
		return Stream.of(7,9,10);
	}
	@Disabled
	@ParameterizedTest
	@MethodSource("fetchTicketIds")
	void testGetTicketParameterizedTest(int ticketid) throws Exception {
		ResultActions resultActions = mockmvc.perform(get("/redbus/"+ticketid))
		.andExpect(status().isOk()) 
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.username").value("user8"))
		.andExpect(jsonPath("$.fromplace").value("fromplace9"))
		.andExpect(jsonPath("$.toplace").value("toplac9"))
		.andExpect(jsonPath("$.price").value("1940.0"))
		.andDo(print());		

	}
	
	//Multiple paramerters
	private static Stream<Arguments> fetchTicketParameters(){
		return Stream.of(Arguments.of(7,"fromplace7","toplac7"),
				Arguments.of(9,"fromplace9","toplac9"),
				Arguments.of(10,"tuv","rtyu")
				);
	}
	

	@ParameterizedTest
	@MethodSource("fetchTicketParameters")
	void testGetTicketMultipleParameterizedTest(int ticketid,String fromplace,String toplace) throws Exception {
		ResultActions resultActions = mockmvc.perform(get("/redbus/"+ticketid))
		.andExpect(status().isOk()) 
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.fromplace").value(fromplace))
		.andExpect(jsonPath("$.toplace").value(toplace))
		.andDo(print());		

	}
	
/*	@Test
	void contextDelete() throws Exception {
		mockmvc.perform(delete("/redbus/2")) 
		.andExpect(status().isOk()) 
		.andExpect(content().contentType("text/plain;charset=UTF-8")) 
		.andExpect(jsonPath("$").value("Ticket 2 is deleted"));
	}
	
	*/
	
	//@Test
	@Disabled
	void testBookTicket() throws Exception{
		mockmvc.perform(post("/redbus")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"username\":\"acv\",\"fromplace\":\"tuv\",\"toplace\":\"rtyu\",\"price\":100}")
		).andExpect(status().isCreated())
				//).andExpect(status().is(201));
		.andDo(print())
		.andExpect(jsonPath("$.username").value("acv"));
			
	}
	
	//@Test
		@Disabled
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
