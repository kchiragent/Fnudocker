package com.entmobi.fnu.fnudocker.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("rest/api/login")
public class login {
	
	@GetMapping
	public Boolean HealthCheck(){
		return true;
	}

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public Boolean Authenticate(@RequestBody credentials c){
		if (c.getUsername().equals("admin") && c.getPassword().equals("123"))
			return true;
		else
			return false;
	}
	

}
