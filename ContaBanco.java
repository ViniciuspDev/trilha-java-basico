public class ContaBanco {
    private static int contadorContas = 1;
    private int numeroConta;
    private String nomeProprietario;
    private double saldo;

    public ContaBanco(String nomeProprietario, double saldoInicial) {
        this.numeroConta = contadorContas++;
        this.nomeProprietario = nomeProprietario;
        this.saldo = saldoInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Proprietário: " + nomeProprietario);
        System.out.println("Saldo: R$ " + saldo);
    }
}