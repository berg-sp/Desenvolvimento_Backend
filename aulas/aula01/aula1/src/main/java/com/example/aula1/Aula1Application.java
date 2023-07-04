package com.example.aula1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/ola")
public class Aula1Application {
	@GetMapping("/nome")
	public String dizOi(@PathVariable String nome){
		return "oi, " + nome;
	}

	public static void main(String[] args) {
		SpringApplication.run(Aula1Application.class, args);
	}

}
