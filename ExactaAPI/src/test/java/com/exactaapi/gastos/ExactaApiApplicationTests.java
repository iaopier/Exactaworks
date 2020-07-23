package com.exactaapi.gastos;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;
import java.util.Calendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.exactaapi.gastos.Model.Gasto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@SpringBootTest
class ExactaApiApplicationTests {
	@Autowired
	private WebApplicationContext webApplicationContext;
		
	private MockMvc mockMvc;
	@Test
	void contextLoads() {
	}
	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	@Test
	public void listaGastos() throws Exception {
		mockMvc.perform(get("http://localhost:8080/api/v1/gastos/listarGastos")).andExpect(status().isOk());
	}
	
	/*
	@Test
	public void listaGastosVazio() throws Exception {
		MvcResult result = mockMvc.perform(get("http://localhost:8080/api/v1/gastos/listarGastos")).andReturn();
		String content = result.getResponse().getContentAsString();
		if(!content.equals("[]")) {
			throw new Exception("");
		}
	}*/
	
	@Test
	public void criarGasto() throws Exception {
		Gasto g = new Gasto();
		g.setNome("Piercarlo");
		g.setDescricao("Descricao");
		g.setData(new Date(Calendar.getInstance().getTimeInMillis()));
		g.setTags("Tag1,Tag2,Tag3");
		g.setValor(200.00);
		ObjectMapper mapper = new ObjectMapper();
	    ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String requestJson=ow.writeValueAsString(g);
	    mockMvc.perform(post("http://localhost:8080/api/v1/gastos/criarGasto").contentType("application/json")
	            .content(requestJson))
	            .andExpect(status().isOk());
	}
	
	@Test
	public void listarGasto() throws Exception {
		Gasto g = new Gasto();
		g.setNome("Piercarlo");
		g.setDescricao("Descricao");
		g.setData(new Date(Calendar.getInstance().getTimeInMillis()));
		g.setTags("Tag1,Tag2,Tag3");
		g.setValor(200.00);
		ObjectMapper mapper = new ObjectMapper();
	    ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String requestJson=ow.writeValueAsString(g);
	    mockMvc.perform(post("http://localhost:8080/api/v1/gastos/criarGasto").contentType("application/json")
	            .content(requestJson))
	            .andExpect(status().isOk());
		g = new Gasto();
		g.setNome("Listar Gasto");
		g.setDescricao("Descricao 2");
		g.setData(new Date(Calendar.getInstance().getTimeInMillis()));
		g.setTags("Tag1,Tag2,Tag3");
		g.setValor(200.00);
		mapper = new ObjectMapper();
	    ow = mapper.writer().withDefaultPrettyPrinter();
	    requestJson=ow.writeValueAsString(g);
	    mockMvc.perform(post("http://localhost:8080/api/v1/gastos/criarGasto").contentType("application/json")
	            .content(requestJson))
	            .andExpect(status().isOk());
	    MvcResult result = mockMvc.perform(get("http://localhost:8080/api/v1/gastos/listarGasto/2")).andReturn();
		String content = result.getResponse().getContentAsString();
		System.out.println(content);
	}
	
}
