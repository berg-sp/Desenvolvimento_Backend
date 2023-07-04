package br.com.transporte.service;

import br.com.transporte.model.Produto;
import br.com.transporte.utils.Sedex;
import br.com.transporte.utils.ServicoTransporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TransporteService {
    @Autowired
    @Qualifier("correios")
    private ServicoTransporte servicoTransporte;

    public String realizarEnvio(Produto produto){
        servicoTransporte.enviar(produto);
        return "O produto " + produto.getNone() + " foi enviado com sucesso!";
    }
}
