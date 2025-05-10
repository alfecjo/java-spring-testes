package aula13;

public class Onibus extends Veiculo {
    private String tipoFreio;
    private int qtdMotorista;

    public Onibus(int numeroRodas, TipoCombustivel tipoCombustivel, double consumo,
            double valorVeiculo, double quilometragem, String marca, String modelo,
            String tipoFreio, int qtdMotorista) {
        super(numeroRodas, tipoCombustivel, consumo, valorVeiculo, quilometragem, marca, modelo);
        this.tipoFreio = tipoFreio;
        this.qtdMotorista = qtdMotorista;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de Freio: " + tipoFreio);
        System.out.println("Quantidade de Motorista(s): " + qtdMotorista);
    }
}
