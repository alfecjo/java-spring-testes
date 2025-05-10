//pacote ex_01 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex01;

//Programa principal
public class Test {

    //Metodo principal
    public static void main(String arg[]) {

        // Veiculo inicia usando o construtor default da classe Veiculo()
        Veiculo veiculo0 = new Veiculo();
        veiculo0.setPlaca("ABC1234");
        veiculo0.setMarca("Renault");
        veiculo0.setModelo("Sandero StepWay Rip Curl");
        veiculo0.setCor("Prata");
        veiculo0.setVelMax(210.0f);
        veiculo0.setQtdRodas(5);
        veiculo0.getMotor().setQtdPist(4);
        veiculo0.getMotor().setPotencia(129);

        /* Veiculo faz uso do construtor que carrega todos atributos de veiculo, instanciamdo uma referencia
         *  dentro do corpo do construtor na classe
         */
        Veiculo veiculo1 = new Veiculo("DEF5678", "Fiat", "Fiat 147", "Branco", 140f, 5);

        /*Observando que la no construtor da classe Veiculo, (este da linha anterior) a referencia a objetos Motor foi
         * instanciada apenas carregando o null, os atributos qtdPist epotencia sao do tipo primitivo int e receberam
         * valor inicial zero, sendo estes impressos por toString. Caso haja disposicao em carregar novos valores,
         * so descomentar as duas proximas linhas com codigo.
         */

        //veiculo1.getMotor().setQtdPist(4);
        //veiculo1.getMotor().setPotencia(75);

        /*
         Veiculo faz uso do construtor que carrega todos atributos de veiculo e de Motor, instanciamdo uma referencia
         *  dentro do corpo do construtor agragando na classe
         */
        Veiculo veiculo2 = new Veiculo("GHI9012", "Mercedez", "C250", "Preto", 240f, 5, 8, 550);

        /*
         * Veiculo faz uso dos metodos getters & setters que carrega todos atributos de veiculo e de Motor,
         */
        Veiculo veiculo3 = new Veiculo();
        veiculo3.setPlaca("JKL3456");
        veiculo3.setMarca("Chevrolet");
        veiculo3.setModelo("S10");
        veiculo3.setCor("Azul Marinho");
        veiculo3.setVelMax(190f);
        veiculo3.setQtdRodas(5);
        veiculo3.getMotor().setQtdPist(6);
        veiculo3.getMotor().setPotencia(600);

        // Veiculo inicia usando o construtor default da classe Veiculo()
        Veiculo veiculo4 = new Veiculo();
        veiculo4.setPlaca("MNO7890");
        veiculo4.setMarca("Volkswagem");
        veiculo4.setModelo("Gol");
        veiculo4.setCor("Cinza");
        veiculo4.setVelMax(110.0f);
        veiculo4.setQtdRodas(5);
        veiculo4.getMotor().setQtdPist(4);
        veiculo4.getMotor().setPotencia(89);

        /*
         *  Usando o toString para imprimir o objetos
         */
        faixaToString();

        veiculo0.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veiculo1.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veiculo2.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veiculo3.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veiculo4.toString();

        System.out.println("");

        // Usando getters para imprimir os objetos
        faixaGetters();

        imprimeComGetters(veiculo0);
        imprimeComGetters(veiculo1);
        imprimeComGetters(veiculo2);
        imprimeComGetters(veiculo3);
        imprimeComGetters(veiculo4);
    }

    public static void faixaToString() {
        System.out.println("");

        System.out.println("*************************************************************************");
        System.out.println("* ");
        System.out.println("* ");
        System.out.println("*                   Imprime na tela atraves de toString");
        System.out.println("* ");
        System.out.println("* ");
        System.out.println("*************************************************************************");
    }


    public static void faixaGetters() {
        System.out.println("*************************************************************************");
        System.out.println("* ");
        System.out.println("* ");
        System.out.println("*                   Imprime na tela atraves dos getters");
        System.out.println("* ");
        System.out.println("* ");
        System.out.println("*************************************************************************");
    }

    /*
     * Metodo para imprimir atraves de println e getters...
     */
    public static void imprimeComGetters(Veiculo veiculo) {
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Velocidade Maxima: " + veiculo.getVelMax());
        System.out.println("Quantidade de rodas (+ step): " + veiculo.getQtdRodas());
        System.out.println("Quantidade de pistoes: " + veiculo.getMotor().getQtdPist());
        System.out.println("Potencia: " + veiculo.getMotor().getPotencia() + " cv");
        System.out.println("****************** THE END *********************");

        System.out.println("");
    }

}
