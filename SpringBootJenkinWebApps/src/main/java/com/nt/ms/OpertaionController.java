package com.nt.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class OpertaionController {
	
	
	@GetMapping("/welcome")
	public ResponseEntity<String> showHome() {
		System.out.println("hiiiiiiiiii");
		return new ResponseEntity<String>("hi welcome",HttpStatus.OK);
	}

}
