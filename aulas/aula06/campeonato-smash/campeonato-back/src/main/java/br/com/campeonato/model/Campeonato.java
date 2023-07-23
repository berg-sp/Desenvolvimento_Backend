package br.com.campeonato.model;

public class Campeonato {
    private int id;
    private String nome;
    private String descricao;
    private double premiacao;

    public Campeonato() {
    }

    public Campeonato(int id, String nome, String descricao, double premiacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.premiacao = premiacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(double premiacao) {
        this.premiacao = premiacao;
    }
}
