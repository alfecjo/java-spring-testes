package semana05;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Crie os seguintes atributos: marca (string), modelo (string), ano (string), porcentagemBateria (double);\r\n"
                        + //
                        "Crie os métodos: tirar foto (reduz a bateria em 10%), recarregar (coloca a porcentagem em 100%),  rodar\naplicativo (método recebe como parâmetro o nome do aplicativo e reduz a bateria em 5%)?");
        System.out.println();

        System.out.println("Smartphone..");
        Smartphone meuSmartphone = new Smartphone("Samsung", "Galaxy 01", "1999");

        meuSmartphone.tirarFoto();
        meuSmartphone.rodarAplicativo("WhatsApp");
        meuSmartphone.recarregar();

        System.out.println("Porcentagem de bateria: " + meuSmartphone.porcentagemBateria + "\n");

        System.out.println("Tablet..");

        Tablet meuTablet = new Tablet("Samsung", "Galaxy A", "2015");

        meuTablet.tirarFoto();
        meuTablet.rodarAplicativo("YouTube");
        meuTablet.recarregar();

        System.out.println("Porcentagem de bateria: " + meuTablet.porcentagemBateria);
    }
}
