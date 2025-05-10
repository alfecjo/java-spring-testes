//pacote ex_02 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex04;

//biblioteca oara tratamento de bignumbers

import java.math.BigDecimal;

//classe que hospeda o metodo main.
public class Test {

    //Inicializa referencias para Passeio e Carga
    private static Passeio passeio;
    private static Carga carga;

    //Condicionar limite maximo de objs em array
    private static final int elementos = 6;
    private static int contadorPasseio = 0;
    private static int contadorCarga = 0;

    //arrays para manipular objs Passeio e Carga
    private static final Passeio[] vetPasseio = new Passeio[elementos];
    private static final Carga[] vetCarga = new Carga[elementos];

    //Inicializa referencia para obj
    private static final Leitura l = new Leitura();

    //Metodo funcional
    public static void main(String[] arg) {

        //variaveis de apoio ap loop controlado
        // pelo menu e respectiva finalizacao
        int opcao;
        boolean continua = true;

        //loop principal
        while (continua) {

            //apresentacao do menu de opcoes
            System.out.println("");
            System.out.print("\t\t\t\t\t\t\t\tSistema  de  Gestao de  Veiculos\n");
            System.out.print("\t\t\t\t\t\t\t\t________  MENU inicial  ________\n");
            System.out.println("\t\t\t\t\t_____________________________________________________");
            System.out.print("\t\t\t\t\t|\t(1) Cadastrar veiculo de Passeio \t\t\t\t|\n");
            System.out.print("\t\t\t\t\t|\t(2) Cadastrar veiculo de Carga \t\t\t\t\t|\n");
            System.out.print("\t\t\t\t\t|\t(3) Imprimir todos veiculos de Passeio \t\t\t|\n");
            System.out.print("\t\t\t\t\t|\t(4) Imprimir todos veiculos de Carga \t\t\t|\n");
            System.out.print("\t\t\t\t\t|\t(5) Imprimir veiculos de Passeio pela placa \t|\n");
            System.out.print("\t\t\t\t\t|\t(6) Imprimir veiculos de Carga pela placa \t\t|\n");
            System.out.print("\t\t\t\t\t|\t(7) Abandonar o sistema... \t\t\t\t\t\t|\n");

            System.out.println("\t\t\t\t\t|___________________________________________________|");

            //tratamento de excessao
            try {
                opcao = Integer.parseInt(l.entDados("\nEscolha uma opcao: "));
            } catch (NumberFormatException e) {
                System.out.println("Deve digitar um valor inteiro! Pressione <ENTER>");
                l.entDados("");

                continue;
            }

            //Caso de escolha
            switch (opcao) {

                //trata Cadastrar veiculo de Passeio
                case 1 -> {
                    boolean loop = true;
                    do {
                        System.out.print("\t\t\t\t\t\t(1) Cadastrar veiculo de Passeio \t\t\t\t\n");
                        System.out.println("");

                        for (int i = achaVago(true); i < vetPasseio.length; i++) {

                            if ((elementos - 1) <= (contadorPasseio)) {
                                l.entDados("Vetor de Passeio esta cheio. Precione <ENTER>!");
                                loop = false;
                                break;
                            } else {
                                cadastraPesquisaPlaca(true, true);
                                System.out.println("");

                                String respPass = l.entDados("Deseja cadastrar outro Passeio? <s/n>.");
                                if (respPass.equalsIgnoreCase("n")) {
                                    loop = false;
                                    break;
                                }
                            }
                        }
                    } while (loop);
                }

                //trata Cadastrar veiculo de Carga
                case 2 -> {
                    boolean loop1 = true;
                    do {
                        System.out.print("\t\t\t\t\t\t(2) Cadastrar veiculo de Carga \t\t\t\t\t\n");
                        System.out.println("");

                        for (int i = achaVago(false); i < vetCarga.length; i++) {
                            if ((elementos - 1) <= (contadorCarga)) {
                                l.entDados("Vetor de Carga esta cheio. Precione <ENTER>!");
                                loop1 = false;
                                break;
                            } else {
                                cadastraPesquisaPlaca(false, true);
                                System.out.println("");

                                String respCarg = l.entDados("Deseja cadastrar outro Carga? <s/n>.");
                                if (respCarg.equalsIgnoreCase("n")) {
                                    loop1 = false;
                                    break;
                                }
                            }
                        }
                    } while (loop1);
                }

                //trata Imprimir todos veiculos de Passeio
                case 3 -> {
                    System.out.print("\t\t\t\t\t\t(3) Imprimir todos veiculos de Passeio \t\t\t\n");
                    System.out.println("");
                    for (Passeio valor : vetPasseio) {
                        if (valor != null) {

                            impPasseioCarga(valor, carga, true);
                            System.out.println("");
                            System.out.println("________________________________________________________________");

                        } else {
                            l.entDados("Sem mais VEICULOS PASSEIO para imprimir - precione <ENTER>");
                            break;
                        }
                    }
                }

                //Trata Imprimir todos veiculos de Carga
                case 4 -> {
                    System.out.print("\t\t\t\t\t\t(4) Imprimir todos veiculos de Carga \t\t\t\n");
                    System.out.println("");
                    for (Carga valor : vetCarga) {
                        if (valor != null) {

                            impPasseioCarga(passeio, valor, false);
                            System.out.println("");
                            System.out.println("________________________________________________________________");

                        } else {
                            l.entDados("Sem mais VEICULOS CARGA para imprimir - precione <ENTER>");
                            break;
                        }
                    }
                }

                //Trata Imprimir veiculo de Passeio pela placa
                case 5 -> {
                    System.out.print("\t\t\t\t\t\t (5) Imprimir veiculo de Passeio pela placa\t\t\t\t\n");
                    System.out.println("");
                    cadastraPesquisaPlaca(true, false);
                }

                //Trata Imprimir veiculo de Carga pela placa
                case 6 -> {
                    System.out.print("\t\t\t\t\t\t (5) Imprimir veiculo de Carga pela placa\t\t\t\t\n");
                    System.out.println("");
                    cadastraPesquisaPlaca(false, false);
                }

                //Trata finalizacao do sistema
                case 7 -> {
                    System.out.println("7");
                    continua = false;
                }
                default -> l.entDados("O valor deve ser >= 1 e <= a 7, precione <ENTER> PARA CONTINUAR!");
            }

        }

    }

    /************************************************************************************************
     *
     *                                   Inicio Metodos de apoio
     *
     * relacionado a tratar Cadastrar veiculo de Passeio e Carga (opcoes 1,2,3,4 e 5 do menu)
     *
     *************************************************************************************************
     */

    private static void cadastraPesquisaPlaca(boolean passeioOUcarga, boolean cadastraOUpesquisa) {

        boolean testExistePlaca = false;

        if (passeioOUcarga) {
            passeio = new Passeio();
        } else {
            carga = new Carga();
        }

        String placa = l.entDados("Informe a placa a ser " + (cadastraOUpesquisa ? "cadastrada " : "pesquisada") + "? Tecle <ENTER>...");

        (passeioOUcarga ? passeio : carga).setPlaca(placa);

        for (int i = 0; i < achaVago(passeioOUcarga); i++) {

            if ((passeioOUcarga ? vetPasseio[i] : vetCarga[i]).getPlaca().equalsIgnoreCase(passeioOUcarga ? String.valueOf(passeio.getPlaca()) : String.valueOf(carga.getPlaca()))) {

                System.out.println("Placa " + (passeioOUcarga ? "Passeio " : "Carga ") + " cadastrada  na posicao " + (passeioOUcarga ? "vetPasseio[" : "vetCarga[") + i + "].");

                if (passeioOUcarga) impPasseioCarga(vetPasseio[i], carga, true);
                else impPasseioCarga(passeio, vetCarga[i], false);

                testExistePlaca = true;
            }
        }
        if (!testExistePlaca) {

            l.entDados("Placa inexistente. Precione <ENTER> para prosseguir.");
            if (cadastraOUpesquisa) {

                int i = achaVago(passeioOUcarga);
                if (passeioOUcarga) {

                    passeio = new Passeio();
                    contadorPasseio++;
                    vetPasseio[i] = passeio;
                    vetPasseio[i].setPlaca(placa);
                    vetPasseio[i] = (Passeio) gravaPasseioCarga(passeio, carga, true);

                    System.out.println("Passeio armazenado na posicao vetPasseio[" + i + "]. Precione <ENTER>");
                    System.out.println("");

                } else {

                    carga = new Carga();
                    contadorCarga++;
                    vetCarga[i] = carga;
                    vetCarga[i].setPlaca(placa);
                    vetCarga[i] = (Carga) gravaPasseioCarga(passeio, carga, false);
                    System.out.println("Carga armazenado na posicao vetCarga[" + i + "]. Precione <ENTER>");
                    System.out.println("");
                }
            }
        }
    }

    /************************************************************************************************
     *
     * relacionado acha vaga nos arrays/vetores.
     *
     *************************************************************************************************
     */

    private static int achaVago(boolean passeioOUcarga) {
        for (int i = 0; i < (passeioOUcarga ? vetPasseio.length : vetCarga.length); i++) {
            if ((passeioOUcarga ? vetPasseio[i] : vetCarga[i]) == null) {
                return i;
            }
        }
        return 1;
    }

    /**
     * ___________________________________________________________________________________________
     * *
     * relacionado a tratar impressao veiculo de Passeio e Carga
     * (receber informacoes, opcoes 1,2 do menu)
     * Metodo para imprimir atraves de println e getters...
     * <p>
     * ___________________________________________________________________________________________
     */

    private static Veiculo gravaPasseioCarga(Passeio passeio, Carga carga, boolean passeioOUcarga) {

        Veiculo passOUcarg;
        (passeioOUcarga ? passeio : carga).setMarca(l.entDados("Marca: "));
        (passeioOUcarga ? passeio : carga).setModelo(l.entDados("Modelo: "));
        (passeioOUcarga ? passeio : carga).setCor(l.entDados("Cor: "));
        (passeioOUcarga ? passeio : carga).setQtdRodas(Integer.parseInt(l.entDados("Quantidade de rodas (+ step): ")));
        (passeioOUcarga ? passeio : carga).getMotor().setQtdPist(Integer.parseInt(l.entDados("Quantidade de pistoes: ")));
        (passeioOUcarga ? passeio : carga).getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia: ")));
        (passeioOUcarga ? passeio : carga).setVelMax(Float.parseFloat(l.entDados("Velocidade Maxima: ")));

        if (passeioOUcarga) {
            passeio.setQtdPassageiros(Integer.parseInt(l.entDados("Quantidade de Passageiros: ")));
            passOUcarg = passeio;
        } else {
            carga.setCargaMax(Integer.parseInt(l.entDados("Carga Maxima: ")));
            carga.setTara(Integer.parseInt(l.entDados("Tara: ")));
            passOUcarg = carga;
        }
        return passOUcarg;
    }

    /**
     * ___________________________________________________________________________________________
     * *
     * relacionado a tratar impressao veiculo de Passeio e Carga (opcoes 1,2,3,4 e 5 do menu)
     * Metodo para imprimir atraves de println e getters...
     * <p>
     * ___________________________________________________________________________________________
     */

    private static void impPasseioCarga(Passeio passeio, Carga carga, boolean passeioOUCarga) {
        System.out.print("Placa: ");
        System.out.print((passeioOUCarga ? passeio : carga).getPlaca());
        System.out.println(".");

        System.out.print("Marca: ");
        System.out.print((passeioOUCarga ? passeio : carga).getMarca());
        System.out.println(".");

        System.out.print("Modelo: ");
        System.out.print((passeioOUCarga ? passeio : carga).getModelo());
        System.out.println(".");

        System.out.print("Cor: ");
        System.out.print((passeioOUCarga ? passeio : carga).getCor());
        System.out.println(".");

        System.out.print("Quantidade de rodas (+ step): ");
        System.out.print((passeioOUCarga ? passeio : carga).getQtdRodas());
        System.out.println(" unidades.");

        System.out.print("Quantidade de pistoes: ");
        System.out.print((passeioOUCarga ? passeio : carga).getMotor().getQtdPist());
        System.out.println(" unidades.");

        System.out.print("Potencia: ");
        System.out.print((passeioOUCarga ? passeio : carga).getMotor().getPotencia());
        System.out.println(" horse/power.");

        if (passeioOUCarga) {
            System.out.println("Quantidade de Passageiros: " + passeio.getQtdPassageiros() + " pessoas.");
            System.out.println("Cacular quantidade de Letras: " + passeio.calcular() + " letras.");
        } else {
            System.out.println("Carga Maxima: " + carga.getCargaMax() + " Ton.");
            System.out.println("Tara: " + carga.getTara() + " Ton.");
            System.out.println("Cacular soma de numeros: " + carga.calcular() + " elementos.");
        }

        System.out.print("Velocidade Maxima: ");
        System.out.print(new BigDecimal(String.valueOf((passeioOUCarga ? passeio : carga).calcVel((passeioOUCarga ? passeio : carga).getVelMax()))).toPlainString());
        System.out.println(passeioOUCarga ? " meter/hour." : " centimeter/hour.");
    }
}