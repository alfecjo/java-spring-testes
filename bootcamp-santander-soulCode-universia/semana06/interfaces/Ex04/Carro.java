package interfaces.Ex04;

class Carro extends BaseVeiculo {
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularConsumoCombustivel() {
        return 15;
    }
}
