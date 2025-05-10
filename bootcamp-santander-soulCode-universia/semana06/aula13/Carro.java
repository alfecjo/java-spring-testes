package aula13;

public class Carro extends Veiculo {
    private int numeroPortas;

    // Construtor
    public Carro(int numeroRodas, TipoCombustivel tipoCombustivel, double consumo,
                 double valorVeiculo, double quilometragem, String marca, String modelo,
                 int numeroPortas) {
        super(numeroRodas, tipoCombustivel, consumo, valorVeiculo, quilometragem, marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    // Getter e setter para o atributo específico de Carro
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    // Sobrescrita do método exibirInfo para mostrar informações adicionais
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da superclasse para exibir informações básicas
        System.out.println("Número de Portas: " + numeroPortas);
    }
}
