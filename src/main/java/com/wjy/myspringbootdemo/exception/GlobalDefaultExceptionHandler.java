package com.wjy.myspringbootdemo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalDefaultExceptionHandler
{
	@ExceptionHandler(value = Exception.class)
	public void defaultErrorHandler(final HttpServletRequest req, final Exception e)
	{
		e.printStackTrace();
		System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
	}

	@ExceptionHandler(value = CustomException.class)
	public void CustomExceptionHandler(final HttpServletRequest req, final Exception e)
	{
		e.printStackTrace();
		System.out.println("GlobalDefaultExceptionHandler.CustomException()");
	}

}
