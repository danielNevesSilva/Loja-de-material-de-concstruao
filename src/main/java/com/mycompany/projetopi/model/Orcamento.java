<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopi.model;

/**
 *
 * @author MSO
 */
public class Orcamento {
    
=======

package com.mycompany.projetopi.model;


public class Orcamento {
    private int id_orcamento;
    private Cliente cliente = new Cliente();
    private Produto produto = new Produto();
    private int quantidade;

    public int getId_orcamento() {
        return id_orcamento;
    }

    public void setId_orcamento(int id_orcamento) {
        this.id_orcamento = id_orcamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
>>>>>>> f8eb109b5924e32a42e8b081a4efa1336c31d99b
}
