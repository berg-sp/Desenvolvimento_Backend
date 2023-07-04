package com.example.http.controller;

import com.example.http.model.Jogador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private List<Jogador> jogadores = new ArrayList<>();

    public JogadorController(){
        jogadores.add(new Jogador(1, "Lebron James", 2.06, "Pivo"));
        jogadores.add(new Jogador(2, "Stephen Curry", 1.88, "Armador"));
        jogadores.add(new Jogador(3, "Antony Davis", 2.08, "Pivo"));
    }

    @GetMapping
    public List<Jogador> getAll(){
        return jogadores;
    }
}
