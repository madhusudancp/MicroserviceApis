package com.maddy.services;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maddy.exceptions.ExceptionDto;
import com.maddy.exceptions.ExceptionMessages;
import com.maddy.exceptions.ServiceException;
import com.maddy.manager.FibonacciManager;
import com.maddy.manager.MergeArraysManager;
import com.maddy.manager.ReverseLettersManager;
import com.maddy.manager.TriangleTypeManager;

@Service
public class ApiServiceImpl implements ApiService{

	@Autowired
	ExceptionMessages exceptionMessages;
	
	@Override
	public BigInteger getFibonacciNumber(Integer n) {
		try {
		  return FibonacciManager.getNthFibonacci(n);
		}catch (IllegalArgumentException e) {
          throw new ServiceException(getExceptionDto(exceptionMessages.nNegativeCode,exceptionMessages.nNegativeMessage));
		}
	}

	@Override
	public String getCharReversedWords(String sentence) {
		try {
		return ReverseLettersManager.getLettersReversedStringUsingBuilder(sentence);
	}catch (IllegalArgumentException e) {
        throw new ServiceException(getExceptionDto(exceptionMessages.sentenceEmpty,exceptionMessages.sentenceEmptyMessage));
		}
	}

	@Override
	public String getTriangleType(Integer a,Integer b,Integer c) {
		try {
			List<Integer> sidesList = TriangleTypeManager.sortSidesOftriangleAsc(a, b, c);
			return TriangleTypeManager.getTriangleType(sidesList);
	   }catch (IllegalArgumentException e) {
        throw new ServiceException(getExceptionDto(exceptionMessages.nonPositiveVertex,exceptionMessages.nonPositiveVertexMessage));
		}
	}

	@Override
	public Map<String,Integer[]> getCombinedArray(Map<String,Integer[]> arrayMap){
		try {
		String combinedArrayKey="Array";
		Map<String,Integer[]> combinedArray = new HashMap<>();
		combinedArray.put(combinedArrayKey,MergeArraysManager.mergeArrays(arrayMap));
		return combinedArray;
		}catch (IllegalArgumentException e) {
	        throw new ServiceException(getExceptionDto(exceptionMessages.emptyArray,exceptionMessages.emptyArrayMessage));
			}
	}

	
	public ExceptionDto getExceptionDto(Integer errorCode,String errorMessage) {
		ExceptionDto exceptionDto = new ExceptionDto();
		exceptionDto.setErrorCode(errorCode);
		exceptionDto.setErrorMessage(errorMessage);
		return exceptionDto;
	}
}
