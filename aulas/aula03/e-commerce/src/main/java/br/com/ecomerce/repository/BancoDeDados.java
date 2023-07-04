package br.com.ecomerce.repository;

import br.com.ecomerce.model.Produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    private List<Produto> produtos = new ArrayList<>();

    public BancoDeDados(){
        produtos.add(new Produto(1, "Mouse", new BigDecimal(29.99).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(2, "Teclado", new BigDecimal(49.99).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(3, "Mouse pad", new BigDecimal(19.99).setScale(2, RoundingMode.DOWN)));
    }

    public List<Produto> findAll(){
        return produtos;
    }

}
