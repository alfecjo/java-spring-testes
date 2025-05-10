package interfaces.Ex06;

public interface OperacoesBancarias {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(Conta destino, double valor);
    String getTipo();
}
