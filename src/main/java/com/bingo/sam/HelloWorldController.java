package com.bingo.sam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("hello")
	public String sayHello() {
		System.out.println("SayHello!!");
		return "Hello Boot!!";
	}

	@PostMapping("/bye/{policyKey}")
	public @ResponseBody String sayBye(@PathVariable Integer policyKey) {
		System.out.println("SayHello path!!");
		System.out.println("KEY = "+policyKey);
		return "Hello Path variable!!";
	}
}
