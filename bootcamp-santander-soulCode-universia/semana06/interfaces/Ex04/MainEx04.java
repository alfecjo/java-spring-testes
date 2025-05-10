package interfaces.Ex04;

public class MainEx04 {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fusca");
        Veiculo moto = new Moto("CG 125");
        Veiculo bicicleta = new Bicicleta("Caloi");

        carro.acelerar();        
        if (carro instanceof BaseVeiculo) {
            ((BaseVeiculo) carro).exibirVelocidade();
        }
        System.out.println("Consumo de combustível do carro: " + carro.calcularConsumoCombustivel() + " km/l");

        moto.acelerar();
        if (moto instanceof BaseVeiculo) {
            ((BaseVeiculo) moto).exibirVelocidade();
        }
        System.out.println("Consumo de combustível da moto: " + moto.calcularConsumoCombustivel() + " km/l");

        bicicleta.acelerar();
        bicicleta.acelerar();
        if (bicicleta instanceof BaseVeiculo) {
            ((BaseVeiculo) bicicleta).exibirVelocidade();
        }
        bicicleta.frear();
        bicicleta.frear();
        if (bicicleta instanceof BaseVeiculo) {
            ((BaseVeiculo) bicicleta).exibirVelocidade();
        }
        System.out.println("Bicicleta sem freio!!!");
        System.out.println("Consumo de combustível da bicicleta: " + bicicleta.calcularConsumoCombustivel() + " km/l");
    }
}
