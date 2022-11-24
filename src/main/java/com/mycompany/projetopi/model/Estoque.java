package com.mycompany.projetopi.model;

import java.util.Date;

public class Estoque {

    private int idprod;
    private String produto;
    private int quantidade;
    private double preco;

    public Estoque(String produto1, int quantidade1, double preco1) {
    }

    public Estoque(int idprod, String produto, int quantidade, double preco) {
        this.idprod = idprod;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Estoque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   
}
