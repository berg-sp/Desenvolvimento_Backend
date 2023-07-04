package com.example.ex01.controller;

import com.example.ex01.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    public ProdutoController(){
        produtos.add(new Produto(1, "banana", 12));
        produtos.add(new Produto(2, "maça", 13));
        produtos.add(new Produto(3, "abacate", 14));
    }

    @GetMapping
    public List<Produto> getAll(){
        return produtos;
    }

    @GetMapping("/{codigoDeBarras}")
    public Produto getByCodigoDeBarras(@PathVariable int codigoDeBarras) {
        for(Produto produto : produtos){
            if(produto.getCodigoDeBarras() == codigoDeBarras) {
                return produto;
            }
        }
        return null;
    }

    @PostMapping
    public String save(@RequestBody Produto produto){
        this.produtos.add(produto);
        return "Produto " + produto.getNome() + " foi adicionado ao estoque!";
    }
}
