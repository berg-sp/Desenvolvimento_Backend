package br.com.revisao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/ola")

public class RevisaoApplication {
    @RequestMapping
    public String ola(){
        return "Olá, mundo";
    }
    public static void main(String[] args) {
        SpringApplication.run(RevisaoApplication.class, args);

    }
}
