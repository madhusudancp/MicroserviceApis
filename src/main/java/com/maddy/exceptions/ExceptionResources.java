package com.maddy.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@Component
public class ExceptionResources  extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = { ServiceException.class })
    protected ResponseEntity<ExceptionDto> handleConflict(ServiceException ex, WebRequest request) {
        return  new ResponseEntity<>(ex.getExceptionDto(),HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(value = { Throwable.class,RuntimeException.class })
    protected ResponseEntity<ExceptionDto> handleConflict(RuntimeException ex, WebRequest request) {
        String bodyOfResponse =ex.getMessage();
        ExceptionDto error =new ExceptionDto();
        error.setErrorCode(0000);
        error.setErrorMessage(bodyOfResponse);
        return  new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}