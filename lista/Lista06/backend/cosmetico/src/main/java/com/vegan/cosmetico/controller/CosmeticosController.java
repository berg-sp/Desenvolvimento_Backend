package com.vegan.cosmetico.controller;

import com.vegan.cosmetico.model.Cosmetico;
import com.vegan.cosmetico.service.CosmeticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmeticos")
@CrossOrigin("http://localhost:4200") //pode ser *, caso não nececite de muita segurança.
public class CosmeticosController {

    @Autowired
    private CosmeticoService cosmeticoService;

    @GetMapping
    public List<Cosmetico> getAll() {
        return cosmeticoService.getAll();
    }

    @GetMapping("/{id}")
    public Cosmetico getById(@PathVariable int id){
        return cosmeticoService.getById(id);
    }

    @PostMapping
    public boolean save(@RequestBody Cosmetico cosmetico) {
        return cosmeticoService.save(cosmetico);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return cosmeticoService.delete(id);
    }
}
