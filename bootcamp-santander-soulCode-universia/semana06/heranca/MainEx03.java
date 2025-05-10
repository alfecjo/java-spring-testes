package semana06.heranca;

public class MainEx03 {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("VeiculoGenérico", 2022);
        Carro carro = new Carro("Fusca", 1970, 2);

        Carro meuCarro = new Carro("Sedan", 2022, 4);
        meuCarro.mostrarDetalhes("Azul");

        Barco barco = new Barco("Lancha", 2020, "Fibra de Vidro");
        Barco meuBarco = new Barco("Lancha", 2021, "Fibra de Vidro");
        meuBarco.mostrarDetalhes();
        System.out.println(veiculo.getModelo() + " - Ano: " + veiculo.getAno());
        System.out.println(
                carro.getModelo() + " - Ano: " + carro.getAno() + " - Número de Portas: " + carro.getNumeroPortas());
        System.out
                .println(barco.getModelo() + " - Ano: " + barco.getAno() + " - Tipo de Casco: " + barco.getTipoCasco());
    }
}
