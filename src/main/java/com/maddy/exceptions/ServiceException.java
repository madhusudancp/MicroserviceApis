package com.maddy.exceptions;

       

	public class ServiceException  extends RuntimeException {
		   
		private static final long serialVersionUID = 1L;
		
			public ServiceException() {
		        super();
		    }
		
		    public ServiceException(ExceptionDto exceptionDto) {
		        super(exceptionDto.getErrorMessage());
		        this.exceptionDto=exceptionDto;
		    }
		
		private  ExceptionDto exceptionDto;

		public ExceptionDto getExceptionDto() {
			return exceptionDto;
		}
		public void setExceptionDto(ExceptionDto exceptionDto) {
			this.exceptionDto = exceptionDto;
		}
		   
		    
}
