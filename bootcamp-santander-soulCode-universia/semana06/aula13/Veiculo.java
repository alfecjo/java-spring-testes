package aula13;

public class Veiculo {
    private int numeroRodas;
    private TipoCombustivel tipoCombustivel;
    private double consumo;
    private double valorVeiculo;
    private double quilometragem;
    private String marca;
    private String modelo;

    public Veiculo(int numeroRodas, TipoCombustivel tipoCombustivel, double consumo,
                   double valorVeiculo, double quilometragem, String marca, String modelo) {
        this.numeroRodas = numeroRodas;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo = consumo;
        this.valorVeiculo = valorVeiculo;
        this.quilometragem = quilometragem;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Veículo: " + marca + " " + modelo);
        System.out.println("Número de Rodas: " + numeroRodas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Consumo: " + consumo + " km/l");
        System.out.println("Valor do Veículo: R$" + valorVeiculo);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }
}


