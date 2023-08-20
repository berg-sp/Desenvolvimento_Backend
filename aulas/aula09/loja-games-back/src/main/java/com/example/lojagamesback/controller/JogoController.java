package com.example.lojagamesback.controller;

import com.example.lojagamesback.model.Jogo;
import com.example.lojagamesback.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
@CrossOrigin("*")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity<List<Jogo>> getAll() {
        return ResponseEntity.ok(jogoService.getAll());
    }
    @PostMapping
    public ResponseEntity<Jogo> save(@RequestBody Jogo jogo) {
        return ResponseEntity.ok(jogoService.save(jogo));
    }
}
