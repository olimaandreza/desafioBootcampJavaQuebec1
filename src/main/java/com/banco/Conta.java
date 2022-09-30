package com.banco;

//Classe abstrata não pode ser instanciada
//Não faz sentido instanciar classe Conta sem definir se é conta corrente ou poupança
//Só os filhos podem fazer new Conta
public abstract class Conta implements IConta {
        //Criando atributos protected para serem acessados pelas classes filhas
        
        protected int agencia; 
        
        protected int numeroConta;
                
        protected double saldo=0; //conta começa zerada

        protected Cliente cliente;
        
        private static final int AGENCIA_PADRAO = 1;



        //Getters and setters
        //Optou-se por não incluir setter para agencia, numeroConta, tipoDeConta e saldo,
        //pois não faz sentido reatribuir esses atributos fora dessa classe
        public int getAgencia() {
            return agencia;
        }
        
        public int getNumeroConta() {
            return numeroConta;
        }

        public double getSaldo() {
            return saldo;
        }

        //Construtor
        private static int SEQUENTIAL = 1;

        public Conta(Cliente cliente) { //obriga a conta a ter um cliente
            this.agencia = Conta.AGENCIA_PADRAO;//Fixando o número da Agência
            this.numeroConta = SEQUENTIAL++;
            this.cliente = cliente;
        }

        //Definindo métodos públicos para realizar as operações
        //Obrigatórios pela definição da Interface IConta
        //@Override porque implementa da Interface IConta
        @Override 
        public void sacar(double valor){
            if (valor<=saldo)
                saldo-=valor;
            else
                System.out.println("Saldo Insuficiente.");
        }
        
        @Override
        public void depositar(double valor){
            saldo+=valor;
        }

        @Override
        public void transferir(double valor, Conta contaDestino){
            if (valor<=saldo){
                this.sacar(valor);
                contaDestino.depositar(valor);
            }
            else{
                System.out.println("Saldo Insuficiente.");
            }
        }

        protected void extractedInfo() {
            System.out.println("Titular: " + cliente.getNome() );
            System.out.println("Conta: " + this.numeroConta );
            System.out.println("Agência: " + this.agencia);
            System.out.println(String.format("Saldo disponível: R$ %.2f",this.saldo));
        }

}

