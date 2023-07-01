package com.example.verificarcep.model;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complmento;
    private String bairro;
    private String localidade;
    private String uf;
    private int ibge;
    private int gia;
    private int ddd;
    private int siafe;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplmento() {
        return complmento;
    }

    public void setComplmento(String complmento) {
        this.complmento = complmento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getIbge() {
        return ibge;
    }

    public void setIbge(int ibge) {
        this.ibge = ibge;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getSiafe() {
        return siafe;
    }

    public void setSiafe(int siafe) {
        this.siafe = siafe;
    }
}
