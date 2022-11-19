package com.mycompany.projetopi.model;

import java.util.Date;

public class Estoque {

    private int idprod;
    private String produto;
    private int quantidade;
    private double pCompra;
    private double pVenda;

    public Estoque() {
    }
    
    

    public Estoque(String produto, int idprod, double pCompra, double pVenda) {
        this.idprod = idprod;
        this.produto = produto;
        this.quantidade = quantidade;
        this.pCompra = pCompra;
        this.pVenda = pVenda;
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

    public double getpCompra() {
        return pCompra;
    }

    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    public double getpVenda() {
        return pVenda;
    }

    public void setpVenda(double pVenda) {
        this.pVenda = pVenda;
    }
    
   
    
}