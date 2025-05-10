package semana05;

public class MainVeiculo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Crie os seguintes atributos: ligado (boolean), ano (int), marca (string), kmRodados (double), consumo (double), tanqueAtual (double).\r\n"+//+ 
        "Crie os seguintes métodos: ligar, desligar, viajar (gasta gasolina), revisao (o método revisão melhora o consumo do veículo em 10%,\nou seja o veiculo roda mais quilômetros com 1 litro de gasolina)?");
        System.out.println();

        Veiculo meuCarro = new Veiculo(2022, "Toyota", 12.5, 50.0);

        meuCarro.ligar();
        meuCarro.viajar(200);
        meuCarro.revisao();
        meuCarro.viajar(200);
        meuCarro.desligar();

        System.out.println("Km rodados: " + meuCarro.getKmRodados());
        System.out.println("Consumo atual: " + meuCarro.getConsumo());
    }
}

