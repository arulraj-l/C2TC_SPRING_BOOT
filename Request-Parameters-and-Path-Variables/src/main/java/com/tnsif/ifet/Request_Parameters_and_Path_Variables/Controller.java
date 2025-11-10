package com.tnsif.ifet.Request_Parameters_and_Path_Variables;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/hello")
	public String welcome(@RequestParam(value="name",defaultValue = "Arul Raj") String name) {
		return "Hello "+name;
	}
	
	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name) {
		return "Welcome "+name;
	}
}
