package br.com.campeonato.controller;

import br.com.campeonato.model.Campeonato;
import br.com.campeonato.service.CampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/campeonatos")
@CrossOrigin("*") //só foi colocado * por ser local, mas para outros que precisa de mais segurança é interessante colocar o seu endereço.
public class CampeonatoController {

    @Autowired
    private CampeonatoService campeonatoService;

    @GetMapping
    public ResponseEntity<List<Campeonato>> getAll() {
        List<Campeonato> campeonatos = campeonatoService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(campeonatos);
    }
}
