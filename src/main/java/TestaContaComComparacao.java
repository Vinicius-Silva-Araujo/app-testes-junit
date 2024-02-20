public class TestaContaComComparacao {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.ativar();
        conta.depositar(100);

        System.out.println("Deve depositar com conta ATIVA");

        if(conta.getSaldo()==100.00){
            System.out.println("Funcionou!");

        }else {
            System.out.println("Falhou!");
        }
        System.out.println();


        conta = new Conta();
        conta.inativar();
        conta.depositar(100);

        System.out.println("Não deve depositar com conta INATIVA");


        if(conta.getSaldo()==00.00){
            System.out.println("Funcionou!");

        }else {
            System.out.println("Falhou!");
        }

    }
}
