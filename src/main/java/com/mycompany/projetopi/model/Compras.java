
package com.mycompany.projetopi.model;

import java.util.Date;

public class Compras {
    private String nome;
    private String email;
    private Date dataEntrada;
    
    public Compras(){
        
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Date getDataEntrada(){
        return dataEntrada;
    }
    public void setDataEntrada(Date dataEntrada){
        this.dataEntrada = dataEntrada;
    }
}
