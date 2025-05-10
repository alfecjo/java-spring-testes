package interfaces.Ex04;

public class BaseVeiculo implements Veiculo {
    private String modelo;
    private double velocidade;
    
    public BaseVeiculo(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " acelerou.");
        velocidade += 10;
    }

    @Override
    public void frear() {
        System.out.println(modelo + " freou.");
        velocidade -= 5;
    }

    @Override
    public double calcularConsumoCombustivel() {
        return 10;
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade de " + modelo + ": " + velocidade + " km/h");
    }
}