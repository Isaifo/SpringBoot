package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/nome")


public class HelloController2 {

	@GetMapping
	public String nome(){
		
		return "Criando a segunda API por Isadora Fernandes";
		
}
	
			
}