package com.banco;

//Interface de conta
//Classe abstrata que agrega todos os métodos abstratos que a classe Conta deve ter
public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void verificarSaldo();
}
