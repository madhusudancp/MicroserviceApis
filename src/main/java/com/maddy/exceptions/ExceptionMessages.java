package com.maddy.exceptions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExceptionMessages {
	

		@Value("${spring.resource.negativen.code}")
		public  Integer nNegativeCode;
		
		@Value("${spring.resource.negativen.message}")
		public  String nNegativeMessage;
		
		
		@Value("${spring.resource.emptyStatement.code}")
		public  Integer sentenceEmpty;
		
		@Value("${spring.resource.emptyStatement.message}")
		public  String sentenceEmptyMessage;
		
		
		@Value("${spring.resource.nonPositiveVertex.code}")
		public  Integer nonPositiveVertex;
		
		@Value("${spring.resource.nonPositiveVertex.message}")
		public  String nonPositiveVertexMessage;	
		
		@Value("${spring.resource.emptyArray.code}")
		public  Integer emptyArray;
		
		@Value("${spring.resource.emptyArray.message}")
		public  String emptyArrayMessage;
		
}
