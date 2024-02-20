public class TestConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.ativar();
        conta.depositar(100);

        System.out.println("Deve depositar com conta ATIVA");
        System.out.println("saldo:" + conta.getSaldo());
        System.out.println();


        conta = new Conta();
        conta.inativar();
        conta.depositar(100);

        System.out.println("Não deve depositar com conta INATIVA");
        System.out.println("saldo:" + conta.getSaldo());
    }
}
