package interfaces.Ex04;

class Bicicleta extends BaseVeiculo {
    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public void frear() {
        System.out.println("Freando a " + getModelo());
    }

    @Override
    public double calcularConsumoCombustivel() {
        return 0;
    }
}
