package interfaces.Ex02;

public class FuncionarioAssalariado implements Funcionario {
    private double salarioMensal;
    
    public FuncionarioAssalariado(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
    return this.salarioMensal;
    }    
}
