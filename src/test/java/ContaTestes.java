import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import com.banco.Conta;
import com.banco.ContaCorrente;

public class ContaTestes {
    @Test
    public void testaDepositar(){
        //construção de um cenário
        Conta conta = new ContaCorrente(null);
        conta.depositar(20);

        //validação do cenário
        Assertions.assertEquals(20,conta.getSaldo());
    }

    @Test
    public void testaSacar(){
        //construção de um cenário
        Conta conta = new ContaCorrente(null);
        conta.depositar(20);
        conta.sacar(10);

        //validação do cenário
        Assertions.assertEquals(10,conta.getSaldo());
    }

    @Test
    public void testaSaldoInsuficienteSaque(){
        //construção de um cenário
        Conta conta = new ContaCorrente(null);
        conta.depositar(20);
        conta.sacar(30);

        //validação do cenário
        Assertions.assertEquals(20,conta.getSaldo());
    }

    @Test
    public void testaTransferir(){
        //construção de um cenário
        Conta conta1 = new ContaCorrente(null);
        Conta conta2 = new ContaCorrente(null);

        conta1.depositar(20);
        conta1.transferir(15,  conta2);

        //validação do cenário
        Assertions.assertEquals(5,conta1.getSaldo());
        Assertions.assertEquals(15,conta2.getSaldo());

    }

    @Test
    public void testaTransferirSaldoIndisponivel(){
        //construção de um cenário
        Conta conta1 = new ContaCorrente(null);
        Conta conta2 = new ContaCorrente(null);

        conta1.depositar(20);
        conta1.transferir(35,  conta2);

        //validação do cenário
        Assertions.assertEquals(20,conta1.getSaldo());
        Assertions.assertEquals(0,conta2.getSaldo());

    }
}
