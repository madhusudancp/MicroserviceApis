package com.maddy.resources;

import java.math.BigInteger;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maddy.services.ApiService;

/*
* Rest Controller to expose REST end points
*/
@RestController
@RequestMapping(value="/api/")
public class RestResources {
	private static final Logger LOGGER = LoggerFactory.getLogger(RestResources.class);
	
	
	@Autowired
	ApiService apiService;
	
	
    /*
    *Rest APi to return N-th Fibonnacci number  
    */	
	@GetMapping(value="fibonacci")
	public ResponseEntity<BigInteger> getFibonacciNumber(@RequestParam(value="n",defaultValue = "0") Integer n) {
		LOGGER.info("Value of n is : {}", n);
		BigInteger result=apiService.getFibonacciNumber(n);
		LOGGER.info("Return fibonacci number is {}", result);
		return new ResponseEntity<>(result,getHeader(), HttpStatus.OK);
	}
	    

    /*
    *Rest APi to return reversed words  
    */	
	@GetMapping(value="reversewords")
	public ResponseEntity<String> getCharReversedWords(@RequestParam(value="sentence") String sentence) {
		LOGGER.info("Value of sentence is : {}", sentence);
		String result=apiService.getCharReversedWords(sentence);
		LOGGER.info("Return letter reversed sentence is {}", result);
		return new ResponseEntity<>(result,getHeader(), HttpStatus.OK);
	}
	
	

    /*
    *Rest APi to return triangle type  
    */	
	@GetMapping(value="triangletype")
	public ResponseEntity<String> getTriangleType(@RequestParam(value="a",defaultValue = "0") Integer a,
												  @RequestParam(value="b",defaultValue = "0") Integer b,
												  @RequestParam(value="c",defaultValue = "0") Integer c) {
		LOGGER.info("Value of a,b,c are : {}",a,b,c);
		String result=apiService.getTriangleType(a, b, c);
		LOGGER.info("Return Triangle type is {}", result);
		return new ResponseEntity<>(result,getHeader(), HttpStatus.OK);
	}
		
    /*
    *Rest APi to return combined array  
    */			
	@PostMapping(path = "makeonearray", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Map<String,Integer[]>> getCombinedArray(@RequestBody Map<String,Integer[]> arrayMap) {
		 LOGGER.info("arrayMap- {}", arrayMap);	
		Map<String,Integer[]> combinedArray =apiService.getCombinedArray(arrayMap);
			 LOGGER.info("Return- {}", combinedArray);
			return new ResponseEntity<>(combinedArray,getHeader(), HttpStatus.OK);
		
		}

	
	/*
	 *Prepare headers  
	 */	
	private HttpHeaders  getHeader() { 
	HttpHeaders headers = new HttpHeaders();
	headers.setPragma("no-cache");
	headers.set("expires", "-1");
	headers.set("vary", "Accept-Encoding");
	headers.setDate(new Date().getTime());
	headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
	headers.setCacheControl(CacheControl.noCache());
	return headers;
	}
}
