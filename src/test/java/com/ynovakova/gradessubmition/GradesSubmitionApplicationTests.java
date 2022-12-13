package com.ynovakova.gradessubmition;

import com.ynovakova.gradessubmition.controller.GradeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@SpringBootTest
//@AutoConfigureMockMvc
class GradesSubmitionApplicationTests {

//	@Autowired
//	private GradeController gradeController;
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	public void contextLoads() {
//		Assertions.assertNotNull(gradeController);
//		Assertions.assertNotNull(mockMvc);
//	}
//
//	@Test
//	public void testShowGradeForm() throws Exception {
//		RequestBuilder request = MockMvcRequestBuilders.get("/?id=123");
//		mockMvc.perform(request)
//				.andExpect(status().is2xxSuccessful())
//				.andExpect(view().name("form"))
//				.andExpect(model().attributeExists("grade"));
//	}
//
//	@Test
//	public void testSuccessfulSubmition() throws Exception {
//		RequestBuilder request = MockMvcRequestBuilders.post("/handleSubmit")
//				.param("name", "Harry")
//				.param("subject", "Potions")
//				.param("score", "C-");
//
//		mockMvc.perform(request)
//				.andExpect(status().is3xxRedirection())
//				.andExpect(redirectedUrl("/grades"));
//	}
//
//	@Test
//	public void testUnsuccessfulSubmition() throws Exception {
//		RequestBuilder request = MockMvcRequestBuilders.post("/handleSubmit")
//				.param("name", " ")
//				.param("subject", " ")
//				.param("score", "N");
//
//		mockMvc.perform(request)
//				.andExpect(status().is2xxSuccessful())
//				.andExpect(view().name("form"));
//	}
//
//	@Test
//	public void testGetGrades() throws Exception{
//		RequestBuilder request = MockMvcRequestBuilders.get("/grades");
//
//		mockMvc.perform(request)
//				.andExpect(status().is2xxSuccessful())
//				.andExpect(view().name("grades"))
//				.andExpect(model().attributeExists("grades"));
//	}
}
