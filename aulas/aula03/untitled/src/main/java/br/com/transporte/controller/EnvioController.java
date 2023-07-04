package br.com.transporte.controller;

import br.com.transporte.model.Produto;
import br.com.transporte.service.TransporteService;
import br.com.transporte.utils.Sedex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/envio")
public class EnvioController {

    @Autowired
    private TransporteService transporteService;

    @PostMapping
    public String realizarEnvio(@RequestBody Produto produto){
        return transporteService.realizarEnvio(produto);
    }

}
