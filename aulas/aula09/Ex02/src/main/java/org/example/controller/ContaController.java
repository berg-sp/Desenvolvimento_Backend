package org.example.controller;

import org.example.model.Conta;
import org.example.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
@CrossOrigin("*")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> getAll() {
        return ResponseEntity.ok(contaService.getAll());
    }

    @PostMapping
    public ResponseEntity<Conta> save(@RequestBody Conta conta) {
        return ResponseEntity.ok(contaService.save(conta));
    }
}
