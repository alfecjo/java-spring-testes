//pacote ex_02 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex02;

//classe que hospeda o metodo main.
public class Test {

    //Metodo principal
    public static void main(String arg[]) {

/************************************************************************************************
 *
 *                                           Inicio passeio
 *
 *************************************************************************************************
 */

        /*
         * inicializacoes relacionadas aos construtores da classe Passeio.
         *
         * construtor default da classe Passeio, instanciando referencia: veic_0_Passeio, que servira para apontar a
         *  todos os set's, na hierarquia de classes, sendo: classe Veiculo, classe Motor, acessada indiretamente e a
         * propria classe Passeio.
         *
         */
        Passeio veic_0_Passeio = new Passeio();
        veic_0_Passeio.setPlaca("ABC1234");
        veic_0_Passeio.setMarca("Renault");
        veic_0_Passeio.setModelo("Sandero StepWay Rip Curl");
        veic_0_Passeio.setCor("Prata");
        veic_0_Passeio.setVelMax(210.0f);
        veic_0_Passeio.setQtdRodas(5);
        veic_0_Passeio.setQtdPassageiros(2);
        veic_0_Passeio.getMotor().setQtdPist(4);
        veic_0_Passeio.getMotor().setPotencia(129);

        /*
         * construtor da classe Passeio recebendo informacao: qtdPassageiros e instanciando referencia: veic_1_Passeio, a qual,
         * aponta a todos metodos metodos set's da classe Veiculo e da classe Motor.
         */
        Passeio veic_1_Passeio = new Passeio(4);
        veic_1_Passeio.setPlaca("DEF5678");
        veic_1_Passeio.setMarca("Renault");
        veic_1_Passeio.setModelo("Logan");
        veic_1_Passeio.setCor("Branca");
        veic_1_Passeio.setVelMax(129.0f);
        veic_1_Passeio.setQtdRodas(5);
        veic_1_Passeio.getMotor().setQtdPist(4);
        veic_1_Passeio.getMotor().setPotencia(129);

        /*
         * construtor da classe Passeio instanciando referencia: veic_2_Passeio e carregando informacoes
         * a todos atributos da classe Veiculo e da classe Passeio. Acessando metodos set's da classe
         * Motor.
         */
        Passeio veic_2_Passeio = new Passeio("GHI9012", "Fiat", "Fiat 147", "Branco",
                140f, 5, 4);
        veic_2_Passeio.getMotor().setQtdPist(4);
        veic_2_Passeio.getMotor().setPotencia(140);

        /*
         * construtor da classe Passeio instanciando referencia: veic_2_Passeio e carregando informacoes
         * a todos atributos da classe Veiculo, da classe Passeio e da classe
         * Motor.
         */
        Passeio veic_3_Passeio = new Passeio("JKL3456", "Mercedez", "C250", "Preto",
                220.0f, 5, 2, 6, 550);

        /*

         * construtor default da classe Passeio, instanciando referencia: veic_4_Passeio, que servira para apontar a
         *  todos os set's, na hierarquia de classes, sendo: classe Veiculo, classe Motor, acessada indiretamente e a
         * propria classe Passeio.
         *
         */
        Passeio Veic_4_Passeio = new Passeio();
        Veic_4_Passeio.setPlaca("MNO7890");
        Veic_4_Passeio.setMarca("Chevrolet");
        Veic_4_Passeio.setModelo("S10");
        Veic_4_Passeio.setCor("Azul Marinho");
        Veic_4_Passeio.setVelMax(190f);
        Veic_4_Passeio.setQtdRodas(5);
        Veic_4_Passeio.setQtdPassageiros(4);
        Veic_4_Passeio.getMotor().setQtdPist(6);
        Veic_4_Passeio.getMotor().setPotencia(600);


/**************************************************************************************************
 *
 *                                           Inicio Carga
 *
 *************************************************************************************************
 */


        /*
         * inicializacoes relacionadas aos construtores da classe Passeio.
         *
         * construtor default da classe Passeio, instanciando referencia: veic_0_Passeio, que servira para apontar a
         *  todos os set's, na hierarquia de classes, sendo: classe Veiculo, classe Motor, acessada indiretamente e a
         * propria classe Passeio.
         *
         */
        Carga veic_0_Carga = new Carga();
        veic_0_Carga.setPlaca("PQR1234");
        veic_0_Carga.setMarca("Mercedez");
        veic_0_Carga.setModelo("S300");
        veic_0_Carga.setCor("Prata");
        veic_0_Carga.setVelMax(180.0f);
        veic_0_Carga.setQtdRodas(11);
        veic_0_Carga.setCargaMax(16000);
        veic_0_Carga.setTara(8000);
        veic_0_Carga.getMotor().setQtdPist(12);
        veic_0_Carga.getMotor().setPotencia(329);

        /*
         * construtor da classe Passeio recebendo informacao: qtdPassageiros e instanciando referencia: veic_1_Passeio, a qual,
         * aponta a todos metodos metodos set's da classe Veiculo e da classe Motor.
         */
        Carga veic_1_Carga = new Carga(14000, 8000);
        veic_1_Carga.setPlaca("STU5678");
        veic_1_Carga.setMarca("Scania");
        veic_1_Carga.setModelo("Pegasus");
        veic_1_Carga.setCor("Branca");
        veic_1_Carga.setVelMax(165.0f);
        veic_1_Carga.setQtdRodas(19);
        veic_1_Carga.getMotor().setQtdPist(12);
        veic_1_Carga.getMotor().setPotencia(529);

        /*
         * construtor da classe Passeio instanciando referencia: veic_2_Passeio e carregando informacoes
         * a todos atributos da classe Veiculo e da classe Passeio. Acessando metodos set's da classe
         * Motor.
         */
        Carga veic_2_Carga = new Carga("VXZ9012", "Fiat", "S11000", "Verde",
                160f, 15, 18000, 6000);
        veic_2_Carga.getMotor().setQtdPist(12);
        veic_2_Carga.getMotor().setPotencia(999);

        /*
         * construtor da classe Passeio instanciando referencia: veic_2_Passeio e carregando informacoes
         * a todos atributos da classe Veiculo, da classe Passeio e da classe
         * Motor.
         */
        Carga veic_3_Carga = new Carga("ABC3456", "Mercedez", "C250", "Preto",
                170.0f, 15, 20000, 11600, 8, 800);

        /*
         * construtor default da classe Passeio, instanciando referencia: veic_4_Passeio, que servira para apontar a
         *  todos os set's, na hierarquia de classes, sendo: classe Veiculo, classe Motor, acessada indiretamente e a
         * propria classe Passeio.
         *
         */
        Carga Veic_4_Carga = new Carga();
        Veic_4_Carga.setPlaca("DEF7890");
        Veic_4_Carga.setMarca("Chevrolet");
        Veic_4_Carga.setModelo("S15000");
        Veic_4_Carga.setCor("Azul Turqueza");
        Veic_4_Carga.setVelMax(190f);
        Veic_4_Carga.setQtdRodas(19);
        Veic_4_Carga.setCargaMax(16000);
        Veic_4_Carga.setTara(3000);
        Veic_4_Carga.getMotor().setQtdPist(12);
        Veic_4_Carga.getMotor().setPotencia(660);

/************************************************************************************************
 *
 *                                           Inicio Impressao Passeio
 *
 *************************************************************************************************
 */

        /*
         *  Usando o toString para imprimir
         */
        faixaToString();

        extracted(veic_0_Passeio, veic_1_Passeio, veic_2_Passeio, veic_3_Passeio, Veic_4_Passeio);

        // Usando getters para imprimir os objetos
        faixaGetters();

        imprimeComGettersPasseio(veic_0_Passeio);
        System.out.println("****************** THE END *********************");

        System.out.println("");
        imprimeComGettersPasseio(veic_1_Passeio);
        System.out.println("****************** THE END *********************");

        System.out.println("");
        imprimeComGettersPasseio(veic_2_Passeio);
        System.out.println("****************** THE END *********************");

        System.out.println("");
        imprimeComGettersPasseio(veic_3_Passeio);
        System.out.println("****************** THE END *********************");

        System.out.println("");
        imprimeComGettersPasseio(Veic_4_Passeio);
        System.out.println("");

/************************************************************************************************
 *
 *                                           Inicio Impressao Carga
 *
 *************************************************************************************************
 */

        /*
         *  Usando toString para imprimir o objetos
         */
        faixaToString();

        extracted(veic_0_Carga, veic_1_Carga, veic_2_Carga, veic_3_Carga, Veic_4_Carga);

        // Usando getters para imprimir os objetos
        faixaGetters();

        imprimeComGettersCarga(veic_0_Carga);
        System.out.println("****************** THE END *********************");

        System.out.println("");
        imprimeComGettersCarga(veic_1_Carga);
        System.out.println("****************** THE END *********************");

        System.out.println("");
        imprimeComGettersCarga(veic_2_Carga);
        System.out.println("****************** THE END *********************");

        System.out.println("");
        imprimeComGettersCarga(veic_3_Carga);
        System.out.println("****************** THE END *********************");

        System.out.println("");
        imprimeComGettersCarga(Veic_4_Carga);
        System.out.println("");
    }

    /************************************************************************************************
     *
     *                                           Inicio Metodos de Apoio
     *
     *************************************************************************************************
     */

    private static void extracted(Passeio veic_0_Passeio, Passeio veic_1_Passeio, Passeio veic_2_Passeio, Passeio veic_3_Passeio, Passeio Veic_4_Passeio) {
        veic_0_Passeio.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veic_1_Passeio.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veic_2_Passeio.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veic_3_Passeio.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        Veic_4_Passeio.toString();


        System.out.println("");
    }

    private static void extracted(Carga veic_0_Carga, Carga veic_1_Carga, Carga veic_2_Carga, Carga veic_3_Carga, Carga Veic_4_Carga) {
        veic_0_Carga.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veic_1_Carga.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veic_2_Carga.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        veic_3_Carga.toString();
        System.out.println("****************** THE END *********************");
        System.out.println("");
        Veic_4_Carga.toString();

        System.out.println("");
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
        System.out.println("");

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

    public static void imprimeComGettersPasseio(Passeio passeio) {
        System.out.println("Placa: " + passeio.getPlaca() + ".");
        System.out.println("Marca: " + passeio.getMarca() + ".");
        System.out.println("Modelo: " + passeio.getModelo() + ".");
        System.out.println("Cor: " + passeio.getCor() + ".");
        System.out.println("Velocidade Maxima: " + passeio.getVelMax());
        System.out.println("Quantidade de rodas (+ step): " + passeio.getQtdRodas() + " unidades.");
        System.out.println("Quantidade de pistoes: " + passeio.getMotor().getQtdPist() + " unidades.");
        System.out.println("Potencia: " + passeio.getMotor().getPotencia() + " cv");
        System.out.println("Quantidade de Passageiros: " + passeio.getQtdPassageiros() + " pessoas.");
    }

    public static void imprimeComGettersCarga(Carga carga) {
        System.out.println("Placa: " + carga.getPlaca() + ".");
        System.out.println("Marca: " + carga.getMarca() + ".");
        System.out.println("Modelo: " + carga.getModelo() + ".");
        System.out.println("Cor: " + carga.getCor() + ".");
        System.out.println("Velocidade Maxima: " + carga.getVelMax());
        System.out.println("Quantidade de rodas (+ step): " + carga.getQtdRodas() + " unidades.");
        System.out.println("Quantidade de pistoes: " + carga.getMotor().getQtdPist() + " unidades.");
        System.out.println("Potencia: " + carga.getMotor().getPotencia() + " cv");
        System.out.println("Carga Maxima: " + carga.getCargaMax() + " Ton.");
        System.out.println("Tara: " + carga.getTara() + " Ton.");
    }
}