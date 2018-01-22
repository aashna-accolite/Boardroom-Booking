package com.accolite.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardroomBooking {
	
	@RequestMapping(value = "/login")
	@ResponseBody
	public String sayHello()
	{
		return "Hello";
	}
}
