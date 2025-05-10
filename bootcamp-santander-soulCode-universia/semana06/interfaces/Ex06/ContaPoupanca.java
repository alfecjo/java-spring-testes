package interfaces.Ex06;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double taxaRendimento) {
        super(titular);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    @Override
    public String getTipo() {
        return "Conta Poupança";
    }
}
