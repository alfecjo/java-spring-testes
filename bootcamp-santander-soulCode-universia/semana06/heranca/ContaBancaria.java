package semana06.heranca;

class LimiteSaqueException extends Exception {
    public LimiteSaqueException(String mensagem) {
        super(mensagem);
    }
}

public class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws LimiteSaqueException {
        if (valor > saldo) {
            throw new LimiteSaqueException("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}

class ContaCorrente extends ContaBancaria {
    private double limiteSaque;

    // Construtor
    public ContaCorrente(double saldoInicial, double limiteSaque) {
        super(saldoInicial);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void sacar(double valor) throws LimiteSaqueException {
        if (valor > saldo + limiteSaque || valor > saldo) {
            throw new LimiteSaqueException("Limite de saque excedido. Limite: R$" + limiteSaque);
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
}
