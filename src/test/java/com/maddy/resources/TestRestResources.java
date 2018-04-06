package com.maddy.resources;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.maddy.exceptions.ServiceException;
import com.maddy.services.ApiService;

@RunWith(SpringRunner.class)
@WebMvcTest(RestResources.class)
public class TestRestResources {

	

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ApiService apiService;

    
    @Before
    public void setUp() {
       
    }
    
    
    @Test
    public void TestGetFibonacciNumber() throws Exception {

    	when(apiService.getFibonacciNumber(10)).thenReturn(BigInteger.valueOf(55));
        this.mockMvc.perform(get("/api/fibonacci?n=10")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("55"));
    	
    }
	
    @Test
    public void TestGetCharReversedWords() throws Exception {

        
        when(apiService.getCharReversedWords("How are you")).thenReturn("woH era uoy");
        this.mockMvc.perform(get("/api/reversewords?sentence=How are you")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("woH era uoy"));
    }

    
    
    @Test
    public void TestGetTriangleType() throws Exception {

    	when(apiService.getTriangleType(3,4,5)).thenReturn("SCALENE");
        this.mockMvc.perform(get("/api/triangletype?a=3&b=4&c=5")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string("SCALENE"));
    }

	
	
	
    @Test
    public void TestHandleConflict() throws Exception {

    	when(apiService.getTriangleType(0,0,0)).thenThrow(ServiceException.class);
        this.mockMvc.perform(get("/api/triangletype?a=0&b=0&c=0")).andDo(print()).andExpect(status().isBadRequest());
                
        
        
    }
}
