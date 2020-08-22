package com.empvalidate.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import com.empvalidate.bean.ValidateResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping(path = "/org/emp")
public class EmpValidateController {

	@HystrixCommand(fallbackMethod = "retrieveYelpReviewAndRatingFallback", ignoreExceptions = {
			HttpClientErrorException.class }, commandProperties = {
					@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
					@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "20"),
					@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "60000"),
					@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50") })
	@RequestMapping(path = "/validate/{empId}", method = RequestMethod.GET)
	public ValidateResponse validate(@PathVariable String empId) {
		ValidateResponse validateResponse = new ValidateResponse();
		if ("emp-101".equalsIgnoreCase(empId)) {
			validateResponse.setValid(true);
			return validateResponse;
		}
		return validateResponse;
	}

}
