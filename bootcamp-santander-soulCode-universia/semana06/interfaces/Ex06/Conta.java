package interfaces.Ex06;

public abstract class Conta implements OperacoesBancarias {
    protected String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }        
}
