package com.hackathon.sala.controller;

import com.hackathon.sala.model.Sala;
import com.hackathon.sala.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> getAll(){
        return salaService.getAll();
    }

    @GetMapping("/{id}")
    public Sala getById(@PathVariable int id) {
        return salaService.getById(id);
    }

    @PostMapping
    public boolean save(@RequestBody Sala sala) {
        return salaService.save(sala);
    }

    @PutMapping("/{id}")
    public boolean atualizar(@PathVariable int id, @RequestBody Sala sala) {
        return salaService.save(sala);
    }

}
