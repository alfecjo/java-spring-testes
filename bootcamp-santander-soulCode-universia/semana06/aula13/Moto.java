package aula13;

public class Moto extends Veiculo {
    private String tipoFreio;

    // Construtor
    public Moto(int numeroRodas, TipoCombustivel tipoCombustivel, double consumo,
                double valorVeiculo, double quilometragem, String marca, String modelo,
                String tipoFreio) {
        super(numeroRodas, tipoCombustivel, consumo, valorVeiculo, quilometragem, marca, modelo);
        this.tipoFreio = tipoFreio;
    }

    // Getter e setter para o atributo específico de Moto
    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    // Sobrescrita do método exibirInfo para mostrar informações adicionais
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método da superclasse para exibir informações básicas
        System.out.println("Tipo de Freio: " + tipoFreio);
    }
}
