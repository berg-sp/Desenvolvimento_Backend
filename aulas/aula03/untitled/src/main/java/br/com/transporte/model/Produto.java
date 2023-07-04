package br.com.transporte.model;

import java.math.BigDecimal;

public class Produto {
    private int id;
    private String none;
    private BigDecimal preco;

    public Produto() {
    }

    public Produto(int id, String none, BigDecimal preco) {
        this.id = id;
        this.none = none;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNone() {
        return none;
    }

    public void setNone(String none) {
        this.none = none;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
