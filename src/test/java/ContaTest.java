import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContaTest {
    @Test
    @DisplayName("Deve Depositar com conta Ativa")
    public void deveDepositarComContaAtiva(){
        Conta conta = new Conta();

        conta.ativar();
        conta.depositar(500);
        Assertions.assertEquals(500.00, conta.getSaldo());
    }
    @Test
    @DisplayName("Não deve Depositar com conta Inativa")
    public void naodeveDepositarComContaInativa(){
        Conta conta = new Conta();

        conta.inativar();
        conta.depositar(500);
        Assertions.assertEquals(0.00, conta.getSaldo());
    }
    @Test
    @DisplayName("Deve sacar com conta Ativa e Saldo Maior que o valor de saque")
    public void deveSacarContaAtivaSaldoMaiorQSaque(){
        Conta conta = new Conta();

        conta.ativar();
        conta.depositar(500);
        conta.sacar(100);
        Assertions.assertEquals(400.00, conta.getSaldo());
    }
    @Test
    @DisplayName("Não pode sacar com conta Inativa")
    public void naoSacarComCOntaInativa(){
        Conta conta = new Conta();
        conta.ativar();
        conta.depositar(500);

        conta.inativar();
        conta.sacar(100);
        Assertions.assertEquals(500.00, conta.getSaldo());
    }
    @Test
    @DisplayName("Não deve sacar com conta ativa e saldo menor que valor de saque")
    public void NaoSacarContaAtivaeSladoMenorQSaque(){
        Conta conta = new Conta();
        conta.ativar();
        conta.depositar(500);

        conta.inativar();
        conta.sacar(600);
        Assertions.assertEquals(500.00, conta.getSaldo());
    }


}
