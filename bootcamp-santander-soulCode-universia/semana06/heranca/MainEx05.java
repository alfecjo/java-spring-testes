package semana06.heranca;

public class MainEx05 {
    public static void main(String[] args) {
        try {
            ContaCorrente conta = new ContaCorrente(5000, 3000);

            conta.consultarSaldo();

            conta.sacar(2000);
            conta.consultarSaldo();

            conta.sacar(4000);
        } catch (LimiteSaqueException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

