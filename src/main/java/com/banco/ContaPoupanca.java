package com.banco;

public class ContaPoupanca extends Conta {
    //Construtor
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    //Método

    @Override
    public void verificarSaldo(){
        System.out.println("Saldo Poupança ");
        super.extractedInfo();
    }

}
