package com.maddy.resources;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.maddy.services.ApiService;

@RunWith(SpringRunner.class)
@WebMvcTest(RestResources.class)
public class TestRestResources {

	
	@Autowired
    private RestResources restResources;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ApiService apiService;

    
    @Before
    public void setUp() {
       
    }
    
    
    @Test
    public void getAllBags() throws Exception {

    	/*Mockito.when(bagService.getAllBags(Mockito.any())).thenReturn(mockBagList);
    	RequestBuilder requestBuilder= MockMvcRequestBuilders.get("/bags/1");
    	MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
    	System.out.println(mvcResult.getResponse());
    	*/
    	
    }
	
	
	
	
	
	/*


		@LocalServerPort
		private int port;

		TestRestTemplate restTemplate = new TestRestTemplate();

		HttpHeaders headers = new HttpHeaders();

		@Test
		public void testRetrieveStudentCourse() {

			HttpEntity<String> entity = new HttpEntity<String>(null, headers);

			ResponseEntity<String> response = restTemplate.exchange(
					createURLWithPort("/students/Student1/courses/Course1"),
					HttpMethod.GET, entity, String.class);

			String expected = "{id:Course1,name:Spring,description:10 Steps}";

			try {
				JSONAssert.assertEquals(expected, response.getBody(), false);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private String createURLWithPort(String uri) {
			return "http://localhost:" + port + uri;
		}*/
}
