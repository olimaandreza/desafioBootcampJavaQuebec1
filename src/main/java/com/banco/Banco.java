package com.banco;

public class Banco {
    public String nome;

    //Getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirNomeBanco(){
        System.out.println(getNome());
    }
    
}
