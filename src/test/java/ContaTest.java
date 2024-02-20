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

}
