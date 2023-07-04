package com.example.consumindoapi.controller;

import com.example.consumindoapi.model.Digimon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/digimons")
public class DigimonController {
    @GetMapping
    public List<Digimon> obterTodos(){
        String url = "https://digimon-api.vercel.app/api/digimon";

        RestTemplate restTemplate = new RestTemplate();
        List<Digimon> digimons = restTemplate.getForObject(url, ArrayList.class);
        return digimons;
    }
}
