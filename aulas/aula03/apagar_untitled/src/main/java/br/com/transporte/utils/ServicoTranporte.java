package br.com.transporte.utils;

import br.com.transporte.model.Produto;

public interface ServicoTranporte {
    @Override
    public void enviar(Produto produto){
        System.out.println("O produto " + produto.getNome() + " foi enviado via Sedex");

    }
}
