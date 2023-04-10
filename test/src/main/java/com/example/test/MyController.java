package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

@GetMapping("/")
public @ResponseBody String root() {
	
	return "Hello Word";
}
	
}
