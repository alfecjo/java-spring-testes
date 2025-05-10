//pacote ex_03 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex03;

import java.math.BigDecimal;

//classe que hospeda o metodo main.
public class Test {

    //CONSTANTES, necessario ao controle de impressao na tela, destinguindo entre: Passeio,
    // Carga impresso por:getters ou toString
    public static final int FAIXA_PASSEIO = 0;
    public static final int FAIXA_CARGA = 1;
    public static final int FAIXA_TOSTRING = 2;
    public static final int FAIXA_GETTERS = 3;

    //Metodo principal
    public static void main(String arg[]) {

/************************************************************************************************
 *
 *                                      Inicio da codificacao para Passeio
 *
 *************************************************************************************************
 */

        /*
         * inicializacoes relacionadas aos construtores da classe Passeio.
         *
         * construtor da classe Passeio, instanciando referencias,
         *
         */
        Passeio veic_0_Passeio = new Passeio();
        apoio_Veic_Pass(veic_0_Passeio, "ABC1234", "Renault", "Sandero StepWay Rip Curl",
                "Prata", 210.0f, 2, 4, 129);

        /*
         * construtor da classe Passeio.
         */
        Passeio veic_1_Passeio = new Passeio(veic_0_Passeio, 4);
        apoio_Veic_Pass(veic_1_Passeio);

        /*
         * construtor da classe Passeio.
         */
        Passeio veic_2_Passeio = new Passeio(veic_0_Passeio, "GHI9012", "Fiat", "Fiat 147", "Branco",
                140f, 5, 4);
        veic_2_Passeio.getMotor().setQtdPist(4);
        veic_2_Passeio.getMotor().setPotencia(140);

        /*
         * construtor da classe Passeio.
         */
        Passeio veic_3_Passeio = new Passeio(veic_0_Passeio, "JKL3456", "Mercedez", "C250", "Preto",
                220.0f, 5, 2, 6, 550);

        /*
         * construtor da classe Passeio.
         *
         */
        Passeio veic_4_Passeio = new Passeio();
        apoio_Veic_Pass(veic_4_Passeio, "MNO7890", "Chevrolet", "S10", "Azul Marinho",
                190f, 4, 6, 600);

/**************************************************************************************************
 *
 *                                      Inicio da codificacao para Carga
 *
 *************************************************************************************************
 */

        /*
         * inicializacoes relacionadas aos construtores da classe Carga.
         *
         * construtor da classe Carga.
         *
         */
        Carga veic_0_Carga = new Carga();
        apoio_Veic_Carga(veic_0_Carga, "PQR1234", "Mercedez", "S300", "Prata", 180.0f, 11, 8000, 329);

        /*
         * construtor da classe Carga.
         */
        Carga veic_1_Carga = new Carga(veic_0_Carga, 14000, 8000);
        apoio_Veic_Carga(veic_1_Carga);

        /*
         * construtor da classe Carga.
         */
        Carga veic_2_Carga = new Carga(veic_0_Carga, "VXZ9012", "Fiat", "S11000", "Verde",
                160f, 15, 18000, 6000);
        veic_2_Carga.getMotor().setQtdPist(12);
        veic_2_Carga.getMotor().setPotencia(999);

        /*
         * construtor da classe Carta.
         */
        Carga veic_3_Carga = new Carga(veic_0_Carga, "ABC3456", "Mercedez", "C250", "Preto",
                170.0f, 15, 20000, 11600, 8, 800);

        /*
         * construtor da classe Carga.
         *
         */
        Carga veic_4_Carga = new Carga();
        apoio_Veic_Carga(veic_4_Carga, "DEF7890", "Chevrolet", "S15000", "Azul Turqueza",
                190f, 19, 3000, 660);

/************************************************************************************************
 *
 *                                           Inicio Impressao Passeio
 *
 *************************************************************************************************
 */

        /*
         *  Usando o toString para imprimir.
         */
        faixa(FAIXA_PASSEIO, FAIXA_TOSTRING);

        apoio_Veic_Passeio(veic_0_Passeio, veic_1_Passeio, veic_2_Passeio, veic_3_Passeio, veic_4_Passeio);

        // Usando getters para imprimir.
        faixa(FAIXA_PASSEIO, FAIXA_GETTERS);

        imprimeComGetters_Passeio_Carga(veic_0_Passeio, veic_0_Carga, false);
        the_end();
        imprimeComGetters_Passeio_Carga(veic_1_Passeio, veic_1_Carga, false);
        the_end();
        imprimeComGetters_Passeio_Carga(veic_2_Passeio, veic_2_Carga, false);
        the_end();
        imprimeComGetters_Passeio_Carga(veic_3_Passeio, veic_3_Carga, false);
        the_end();
        imprimeComGetters_Passeio_Carga(veic_4_Passeio, veic_4_Carga, false);
        System.out.println("");

/************************************************************************************************
 *
 *                                           Inicio Impressao Carga
 *
 *************************************************************************************************
 */

        /*
         *  Usando o toString para imprimir.
         */
        faixa(FAIXA_CARGA, FAIXA_TOSTRING);

        apoio_Veic_Carga(veic_0_Carga, veic_1_Carga, veic_2_Carga, veic_3_Carga, veic_4_Carga);

        // Usando getters para imprimir.
        faixa(FAIXA_CARGA, FAIXA_GETTERS);

        imprimeComGetters_Passeio_Carga(veic_0_Passeio, veic_0_Carga, true);
        the_end();
        imprimeComGetters_Passeio_Carga(veic_1_Passeio, veic_1_Carga, true);
        the_end();
        imprimeComGetters_Passeio_Carga(veic_2_Passeio, veic_2_Carga, true);
        the_end();
        imprimeComGetters_Passeio_Carga(veic_3_Passeio, veic_3_Carga, true);
        the_end();
        imprimeComGetters_Passeio_Carga(veic_4_Passeio, veic_4_Carga, true);
        System.out.println("");
    }

    /************************************************************************************************
     *
     *                                           Inicio Metodos de Apoio
     *
     *************************************************************************************************
     */

    private static void the_end() {
        System.out.println("****************** THE END *********************");

        System.out.println("");
    }

    private static void apoio_Veic_Pass(Passeio veic_1_Passeio) {
        veic_1_Passeio.setPlaca("DEF5678");
        veic_1_Passeio.setMarca("Renault");
        veic_1_Passeio.setModelo("Logan");
        veic_1_Passeio.setCor("Branca");
        veic_1_Passeio.setVelMax(129.0f);
        veic_1_Passeio.setQtdRodas(5);
        veic_1_Passeio.getMotor().setQtdPist(4);
        veic_1_Passeio.getMotor().setPotencia(129);
    }

    private static void apoio_Veic_Pass(Passeio Veic_4_Passeio, String MNO7890, String Chevrolet, String S10,
                                        String Azul_Marinho, float velMax, int qtdPassageiros, int qtdPist, int potencia) {
        Veic_4_Passeio.setPlaca(MNO7890);
        Veic_4_Passeio.setMarca(Chevrolet);
        Veic_4_Passeio.setModelo(S10);
        Veic_4_Passeio.setCor(Azul_Marinho);
        Veic_4_Passeio.setVelMax(velMax);
        Veic_4_Passeio.setQtdRodas(5);
        Veic_4_Passeio.setQtdPassageiros(qtdPassageiros);
        Veic_4_Passeio.getMotor().setQtdPist(qtdPist);
        Veic_4_Passeio.getMotor().setPotencia(potencia);
    }

    private static void apoio_Veic_Passeio(Passeio veic_0_Passeio, Passeio veic_1_Passeio, Passeio veic_2_Passeio,
                                           Passeio veic_3_Passeio, Passeio Veic_4_Passeio) {
        veic_0_Passeio.toString();
        theEnd();
        veic_1_Passeio.toString();
        theEnd();
        veic_2_Passeio.toString();
        theEnd();
        veic_3_Passeio.toString();
        theEnd();
        Veic_4_Passeio.toString();

        System.out.println("");
    }

    private static void theEnd() {
        System.out.println("****************** THE END *********************");
        System.out.println("");
    }

    private static void apoio_Veic_Carga(Carga veic_1_Carga) {
        veic_1_Carga.setPlaca("STU5678");
        veic_1_Carga.setMarca("Scania");
        veic_1_Carga.setModelo("Pegasus");
        veic_1_Carga.setCor("Branca");
        veic_1_Carga.setVelMax(165.0f);
        veic_1_Carga.setQtdRodas(19);
        veic_1_Carga.getMotor().setQtdPist(12);
        veic_1_Carga.getMotor().setPotencia(529);
    }

    private static void apoio_Veic_Carga(Carga Veic_4_Carga, String DEF7890, String Chevrolet, String S15000,
                                         String Azul_Turqueza, float velMax, int qtdRodas, int tara, int potencia) {
        Veic_4_Carga.setPlaca(DEF7890);
        Veic_4_Carga.setMarca(Chevrolet);
        Veic_4_Carga.setModelo(S15000);
        Veic_4_Carga.setCor(Azul_Turqueza);
        Veic_4_Carga.setVelMax(velMax);
        Veic_4_Carga.setQtdRodas(qtdRodas);
        Veic_4_Carga.setCargaMax(16000);
        Veic_4_Carga.setTara(tara);
        Veic_4_Carga.getMotor().setQtdPist(12);
        Veic_4_Carga.getMotor().setPotencia(potencia);
    }

    private static void apoio_Veic_Carga(Carga veic_0_Carga, Carga veic_1_Carga, Carga veic_2_Carga,
                                         Carga veic_3_Carga, Carga Veic_4_Carga) {
        veic_0_Carga.toString();
        theEnd();
        veic_1_Carga.toString();
        theEnd();
        veic_2_Carga.toString();
        theEnd();
        veic_3_Carga.toString();
        theEnd();
        Veic_4_Carga.toString();
        System.out.println("");
    }

    public static void faixa(int select_Passeio_or_Carga, int select_toString_or_getters) {
        System.out.println("");
        System.out.println("*************************************************************************");
        System.out.println("* ");
        System.out.println("* ");
        System.out.println("*                   Imprime Veiculo " +
                (select_Passeio_or_Carga == 0 ? "Passeio " : "Carga ") + "na tela atraves de "
                + (select_toString_or_getters == 2 ? "toString." : "Getters."));
        System.out.println("* ");
        System.out.println("* ");
        System.out.println("*************************************************************************");
    }

    /*
     * Metodo para imprimir atraves de println e getters...
     */
    public static void imprimeComGetters_Passeio_Carga(Passeio passeio, Carga carga, boolean c) {
        System.out.print("Placa: ");
        System.out.print((c ? carga : passeio).getPlaca());
        System.out.println(".");

        System.out.print("Marca: ");
        System.out.print((c ? carga : passeio).getMarca());
        System.out.println(".");

        System.out.print("Modelo: ");
        System.out.print((c ? carga : passeio).getModelo());
        System.out.println(".");

        System.out.print("Cor: ");
        System.out.print((c ? carga : passeio).getCor());
        System.out.println(".");

        System.out.print("Quantidade de rodas (+ step): ");
        System.out.print((c ? carga : passeio).getQtdRodas());
        System.out.println(" unidades.");

        System.out.print("Quantidade de pistoes: ");
        System.out.print((c ? carga : passeio).getMotor().getQtdPist());
        System.out.println(" unidades.");

        System.out.print("Potencia: ");
        System.out.print((c ? carga : passeio).getMotor().getPotencia());
        System.out.println(" cv.");

        System.out.print("Velocidade Maxima: ");
        System.out.print(new BigDecimal(String.valueOf((c ? carga : passeio).calcVel((c ? carga : passeio).getVelMax()))).toPlainString());
        System.out.println(c ? " centimeter/hour." : " meter/hour.");

        if (!c) System.out.println("Quantidade de Passageiros: " + passeio.getQtdPassageiros() + " pessoas.");
        if (c) {
            System.out.println("Carga Maxima: " + carga.getCargaMax() + " Ton.");
            System.out.println("Tara: " + carga.getTara() + " Ton.");
        }
    }
}