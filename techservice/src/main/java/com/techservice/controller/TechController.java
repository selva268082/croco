package com.techservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tech")
public class TechController {
	
  @RequestMapping("/hello")
  public String helloTechService()
  {
	  return "Hello Techservice";
  }
	
	
}
