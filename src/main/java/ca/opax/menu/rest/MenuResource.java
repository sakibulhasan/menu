package ca.opax.menu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuResource {
	
	@GetMapping
	public String hello() {
		return "hello";
	}

}
