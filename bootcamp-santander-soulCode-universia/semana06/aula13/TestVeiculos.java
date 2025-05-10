package aula13;

public class TestVeiculos {
    public static void main(String[] args) {
        System.out.println();
        Veiculo veiculo = new Veiculo(4, TipoCombustivel.BIODIESEL, 15.5, 30000.0, 50000.0, "Toyota", "Corolla");
        System.out.println("=== Informações do Veículo ===");
        veiculo.exibirInfo();
        System.out.println();

        Onibus onibus = new Onibus(15, TipoCombustivel.GASOLINA, 5.0, 200000, 350000, "Mercedes Bens", "Cabiollet",
                "Vácuo", 3);
        System.out.println("=== Informações do Ônibus ===");
        onibus.exibirInfo();
        System.out.println();

        Carro carro = new Carro(4, TipoCombustivel.ELETRICIDADE, 12.0, 45000.0, 20000.0, "Volkswagen", "Golf", 4);
        System.out.println("=== Informações do Carro ===");
        carro.exibirInfo();
        System.out.println();

        Moto moto = new Moto(2, TipoCombustivel.ETANOL, 20.0, 15000.0, 10000.0, "Honda", "CBR500R", "Disco");
        System.out.println("=== Informações da Moto ===");
        moto.exibirInfo();
    }
}
