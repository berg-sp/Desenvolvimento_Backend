package br.com.transporte.utils;

import br.com.transporte.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class Sedex implements ServicoTransporte{
    @Override
    public void enviar(Produto produto) {
        System.out.println("O produto " + produto.getNone() + " foi enviado via Sedex");
    }
}
