package com.mycompany.projetopi.model;

public class Financeiro {

    private String vendas;
    private String produto;
    private double valorProduto;
    private double totVendasVendedores;

    public Financeiro() {
    }

    public String getVendas() {
        return vendas;
    }

    public void setVendas(String vendas) {
        this.vendas = vendas;
    }

    public String getProduto() {
        return vendas;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getTotVendasVendedores() {
        return totVendasVendedores;
    }

    public void setTotVendasVendedores(double totVendasVendedores) {
        this.totVendasVendedores = totVendasVendedores;
    }

}
