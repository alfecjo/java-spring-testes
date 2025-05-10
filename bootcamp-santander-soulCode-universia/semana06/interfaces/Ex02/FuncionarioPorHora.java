package interfaces.Ex02;

public class FuncionarioPorHora implements Funcionario {
    private double salarioPorHora;
    private int horasTrabalhadas;

public FuncionarioPorHora(double salarioPorHora, int horasTrabalhadas) {
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabalhadas*this.salarioPorHora;
    }
}
