package com.example.servicodedelivery.envio;

import com.example.servicodedelivery.model.Produto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class EnvioViaDrone implements FormaDeEnvio{
    @Override
    public String enviar(Produto produto) {
        String nome = "Berg";
        System.out.println(produto.getNome());
        System.out.println(produto.getId());
        System.out.println(produto.getPreco());
        System.out.println("O produto com desconto " + calcularDesconto(produto));
        return "O produto: " + produto.getNome() + " foi enviado via Drone";
    }

    // private = modificador de acesso
    // BigDecimal = retorno do método
    // calcularDesconto = nome do método
    // produto = parametro de entrada
    private BigDecimal calcularDesconto(Produto produto) {
        BigDecimal valorComDesconto = produto.getPreco().subtract(new BigDecimal(10.0));
        return valorComDesconto;
    }
}
