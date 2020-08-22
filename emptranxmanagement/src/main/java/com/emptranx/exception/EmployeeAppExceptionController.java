package com.emptranx.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeAppExceptionController {
	
	@ExceptionHandler(EmployeeServiceException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleServiceException(EmployeeServiceException empServiceEx, HttpServletRequest httpServletReq)
	{
		
		ExceptionResponse expResponse=new ExceptionResponse();
		expResponse.setErrMessage(empServiceEx.getMessage());
		expResponse.setRequestedUri(httpServletReq.getRequestURI());
		
		return expResponse;
		
		 
		
	}
	

}
