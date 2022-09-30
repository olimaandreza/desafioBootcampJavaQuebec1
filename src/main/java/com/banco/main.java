package com.banco;


public class main {
    public static void main(String[] args) {
        Banco banconovo = new Banco();
        banconovo.setNome("BancoAtual");
        banconovo.imprimirNomeBanco();

        Cliente contaAndreza = new Cliente();
        contaAndreza.setNome("Andreza");

        Conta cc=new ContaCorrente(contaAndreza);
        Conta poup=new ContaPoupanca(contaAndreza);


        poup.depositar(100);
        poup.transferir(10,cc);

        cc.verificarSaldo();
        poup.verificarSaldo();
    }
}
