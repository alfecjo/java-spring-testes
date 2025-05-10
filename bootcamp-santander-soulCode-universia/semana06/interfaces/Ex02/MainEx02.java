package interfaces.Ex02;

public class MainEx02 {
    public static void main(String[] args) {
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado(3000);
        Funcionario funcionarioPorHora = new FuncionarioPorHora(20, 40);

        System.out.println("Salário do Funcionário Assalariado: " + funcionarioAssalariado.calcularSalario());
        System.out.println("Salário do Funcionário por Hora: " + funcionarioPorHora.calcularSalario());
    }
}
