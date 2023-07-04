package com.example.consumindoapi.controller;

import com.example.consumindoapi.model.PokemonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    @GetMapping
    public PokemonResponse obterPokemons(){
        String url = "https://pokeapi.co/api/v2/pokemon";

        RestTemplate restTemplate = new RestTemplate();
        PokemonResponse pokemonResponse = restTemplate.getForObject(url, PokemonResponse.class);
        return pokemonResponse;
    }
}
