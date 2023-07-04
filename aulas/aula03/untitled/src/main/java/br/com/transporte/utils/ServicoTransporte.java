package br.com.transporte.utils;

import br.com.transporte.model.Produto;
import org.springframework.stereotype.Component;

@Component
public interface ServicoTransporte {
    @Override
    public void enviar(Produto produto) {

    }
}
