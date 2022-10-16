package com.mycompany.projetopi.model;

import java.util.Date;

public class Estoque {

    private int cod;
    private int quantidade;
    private int pCompra;
    private int pVenda;
    private String consulta;
    private String produto;

    public Estoque() {

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getpCompra() {
        return pCompra;
    }

    public void setpCompra(int pCompra) {
        this.pCompra = pCompra;
    }

    public int getpVenda() {
        return pVenda;
    }

    public void setpVenda(int pVenda) {
        this.pVenda = pVenda;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

}
