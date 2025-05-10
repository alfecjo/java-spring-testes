package interfaces.Ex06;

public class MainEx06 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("João", 10.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 0.03);
        ContaInvestimento contaInvestimento = new ContaInvestimento("Carlos", 0.05);

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(500.0);
        contaInvestimento.depositar(2000.0);

        contaCorrente.sacar(200.0);
        contaPoupanca.sacar(50.0);

        contaCorrente.transferir(contaPoupanca, 100.0);
        contaInvestimento.transferir(contaCorrente, 300.0);

        exibirSaldo(contaCorrente);
        exibirSaldo(contaPoupanca);
        exibirSaldo(contaInvestimento);
    }

    private static void exibirSaldo(Conta conta) {
        System.out.println("Correntista: " + conta.getTitular()+  ", Tipo de Conta: " + conta.getTipo()+ ", Saldo: " + conta.getSaldo());
    }
}