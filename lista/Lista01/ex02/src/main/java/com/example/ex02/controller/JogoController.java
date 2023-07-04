package com.example.ex02.controller;

import com.example.ex02.Model.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private List<Jogo> jogos = new ArrayList<>();

    public JogoController(){
        jogos.add(new Jogo(1, "Pacman", 80));
        jogos.add(new Jogo(2, "Sonic", 200));
        jogos.add(new Jogo(3, "Matrix", 250));
    }

    @GetMapping
    public List<Jogo> getAll(){
        return jogos;
    }

    @GetMapping("/{id}")
    public Jogo getById(@PathVariable int id){
        for(Jogo jogo : jogos){
            if(jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }

    /*@GetMapping("/{preco}")
    private int posicaoAtual;
    public Jogo getByPreco(@PathVariable int preco) {
        for (int cicloAtual = 0; cicloAtual < jogos.size(); cicloAtual++) {
            for (int posicaoAtual = o; posicaoAtual < jogos.size(); - 1; posicaoAtual++) {
                if (jogos.get(posicaoAtual) > jogos.get(posicaoAtual + 1) {
                    int aux = jogos[posicaoAtual + 1];
                    jogos[posicaoAtual + 1] = jogos[posicaoAtual];
                    jogos[posicaoAtual] = aux;
                }
            }
        }
        for (int i = 0; i < jogos.size(); i++) {
            System.out.println(jogos[i]);
        }
    }*/

    @PostMapping
    public String save(@RequestBody Jogo jogo) {
        this.jogos.add(jogo);
        return "Jogo " + jogo.getNome() + " foi adicionado ao catálogo!";
    }
}
