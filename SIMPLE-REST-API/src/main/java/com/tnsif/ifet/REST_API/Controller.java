package com.tnsif.ifet.REST_API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/tryOnce")
	public String Welcome() {
		return "Welcome to REST API demo, this is sent from REST controller of Backend";
	}
}
