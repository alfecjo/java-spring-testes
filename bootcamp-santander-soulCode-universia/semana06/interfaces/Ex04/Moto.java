package interfaces.Ex04;

class Moto extends BaseVeiculo {
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularConsumoCombustivel() {
        return 20;
    }
}
