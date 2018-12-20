package com.newinstance.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newinstance.dtos.Employee;

@RestController
public class TestController {
	
	@RequestMapping(value="/getService",method=RequestMethod.GET)
	public void firstMethodtoTest() {
		System.out.println("first");
		String message = "Hello mallikarjun welcome to spring boot...!";
		
		Employee emp  = new Employee();
		
		//return message;
	}

}
