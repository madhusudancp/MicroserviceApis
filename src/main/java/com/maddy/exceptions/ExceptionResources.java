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
    protected ResponseEntity<String> handleConflict(ServiceException ex, WebRequest request) {
        return  new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(value = { Throwable.class,RuntimeException.class })
    protected ResponseEntity<String> handleConflict(RuntimeException ex, WebRequest request) {
        return  new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
}