package com.travis.example.travis;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//@SpringBootTest
@WebMvcTest(TravisApplication.class)
@RunWith(SpringRunner.class)
class TravisApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private MockMvc moMvc;
	
	@Test
	public void getAppName() throws Exception{
		moMvc.perform(get("/appName")).andExpect(status().isOk());
	}

}
