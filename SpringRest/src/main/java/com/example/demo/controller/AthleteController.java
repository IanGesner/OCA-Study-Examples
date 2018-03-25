package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@Controller
public class AthleteController {
	
	@GetMapping("/hello")
	public @ResponseBody String hello() {
		return "hello"; // would look for hello view to send back
	}
	
	@GetMapping("/goodbye")
	public ResponseEntity<String> goodbye() {
		return new ResponseEntity<String>("goodbye", HttpStatus.OK);
	}
	
}
*/

@RestController
public class AthleteController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello"; // will just return "hello"
	}
	
	
}
