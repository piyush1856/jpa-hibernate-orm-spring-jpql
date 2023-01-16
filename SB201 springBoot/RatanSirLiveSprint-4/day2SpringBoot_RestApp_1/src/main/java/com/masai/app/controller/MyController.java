package com.masai.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	//A WS class is called root resource and each method/service is called resource
	
	//each web services method should have proper return type
	@RequestMapping("/hello") //addressable URI
	@ResponseBody // it is a WS and treat it as raw data not as jsp name
	public String sayHello(){
		return "Welcome to Spring Boot";
		//by default this returned value will be treated as logical name of Physical JSP name
	}

}
