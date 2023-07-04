package br.com.transporte.controller;

import br.com.transporte.TransporteApplication;
import br.com.transporte.model.Produto;
import br.com.transporte.service.TransporteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transporte")
public class TransporteController {
    private TransporteApplication transporteService = new TransporteService();
    @PostMapping
    public String realizarEnvio(@RequestBody Produto produto){
        return transporteService.realizarEnvio(produto);

    }
}
