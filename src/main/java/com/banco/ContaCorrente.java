package com.banco;

public class ContaCorrente extends Conta {
    //Construtor
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    //Métodos
    @Override
    public void verificarSaldo(){
        System.out.println("Saldo Conta Corrente ");
        super.extractedInfo();
    }



}
