package com.example.xadrez.controller;

import com.example.xadrez.repository.BancoDeDados;
import com.example.xadrez.model.Torneio;
import com.example.xadrez.service.TorneioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/torneios")
public class TorneioController {

    @Autowired
    private TorneioService torneioService;

    @GetMapping
    public List<Torneio> getAll(){
        return torneioService.getAll();
    }

    @GetMapping("/{id}")
    public Torneio getById(@PathVariable int id) {
        return torneioService.getById(id);
    }

}
