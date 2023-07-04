package br.com.transporte.service;

import br.com.transporte.model.Produto;
import br.com.transporte.utils.Correios;
import br.com.transporte.utils.Sedex;
import br.com.transporte.utils.ServicoTranporte;

public class TransporteService {
    private ServicoTranporte servicoTranporte;

    public TransporteService(ServicoTranporte servicoTranporte) {
        this.servicoTranporte = servicoTranporte;
    }

    public String realizarEnvio(Produto produto){
        servicoTranporte.enviar(produto);
        return "O produto " + produto.getNome() + " foi enviado com sucesso!";
    }
}
