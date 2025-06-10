public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco("Maria Silva", 1000.0);
        ContaBanco conta2 = new ContaBanco("João Souza", 500.0);

        conta1.depositar(200.0);
        conta2.sacar(100.0);

        System.out.println("Informações da Conta 1:");
        conta1.exibirInformacoes();

        System.out.println("\nInformações da Conta 2:");
        conta2.exibirInformacoes();
    }
}