//pacote ex_06 - todas as classes do projeto estao contidas no mesmo pacote.
package com.ex07;
//biblioteca oara tratamento de bignumbers.

import java.math.BigDecimal;

//classe que hospeda o metodo main.
public class Test {
    //Inicializa referencia para obj, Leitura, Minhaexcessao, CTEs.
    private static final Leitura l = new Leitura();
    private static final VeicExistException ex = new VeicExistException();
    private static final BDVeiculos bdVeiculos = new BDVeiculos();
    private static final float VELNAXPASSEIO = 100.0F;
    private static final float VELNAXCARGA = 90.0F;
    private static final int MENORQUE = 80;
    private static final int MAIORQUE = 110;
    public static int opcao = 0;
    private static int contadorPasseio = 0;
    private static int contadorCarga = 0;
    //Inicializa referencias para Passeio e Carga.
    private static Passeio passeio;
    private static Carga carga;

    //Metodo principal
    public static void main(String[] arg) {
        //variaveis de apoio ap loop controlado
        // pelo menu e respectiva finalizacao.
        boolean continua = true;
        //loop principal.
        while (continua) {
            //apresentacao do menu de opcoes.
            System.out.println();
            System.out.println();
            System.out.print("\t\t\t\t\t\t\tSistema  de  Gestao de  Veiculos\n");
            System.out.print("\t\t\t\t\t\t\t________  MENU inicial  ________\n");
            System.out.println("\t\t\t\t\t_____________________________________________________");
            System.out.print("\t\t\t\t\t|\t(1) Cadastrar veiculo de Passeio........... \t|\n");
            System.out.print("\t\t\t\t\t|\t(2) Cadastrar veiculo de Carga............. \t|\n");
            System.out.print("\t\t\t\t\t|\t(3) Imprimir todos veiculos de Passeio..... \t|\n");
            System.out.print("\t\t\t\t\t|\t(4) Imprimir todos veiculos de Carga....... \t|\n");
            System.out.print("\t\t\t\t\t|\t(5) Imprimir veiculos de Passeio pela placa \t|\n");
            System.out.print("\t\t\t\t\t|\t(6) Imprimir veiculos de Carga pela placa.. \t|\n");
            System.out.print("\t\t\t\t\t|\t(7) Excluir veiculos de Passeio pela placa. \t|\n");
            System.out.print("\t\t\t\t\t|\t(8) Excluir veiculos de Carga pela placa... \t|\n");
            System.out.print("\t\t\t\t\t|\t(9) Abandonar o sistema.................... \t|\n");
            System.out.println("\t\t\t\t\t-----------------------------------------------------");
            //tratamento de excessao
            try {
                opcao = Integer.parseInt(l.entDados("\nEscolha uma opcao: "));
                throw new VeicExistException();
            } catch (VeicExistException ex) {
                ex.setEscolhido(opcao);
                switch (opcao) {
                    //trata Cadastrar veiculo de Passeio
                    case 1 -> {
                        boolean loop = true;
                        do {
                            System.out.print("\t\t\t\t\t\t(1) Cadastrar veiculo de Passeio \n");
                            System.out.println();
                            Test.ex.log(opcao);
                            cadastraPesquisaRemovePlaca();
                            System.out.println();
                            String respPass = l.entDados("Deseja cadastrar outro Passeio? <s/n>.");
                            if (respPass.equalsIgnoreCase("n")) {
                                loop = false;
                                break;
                            }
                        } while (loop);
                    }
                    //trata Cadastrar veiculo de Carga
                    case 2 -> {
                        boolean loop1 = true;
                        do {
                            System.out.print("\t\t\t\t\t\t(2) Cadastrar veiculo de Carga \n");
                            System.out.println();
                            Test.ex.log(opcao);
                            cadastraPesquisaRemovePlaca();
                            System.out.println();
                            String respCarg = l.entDados("Deseja cadastrar outro Carga? <s/n>.");
                            if (respCarg.equalsIgnoreCase("n")) {
                                loop1 = false;
                                break;
                            }
                        } while (loop1);
                    }
                    //trata Imprimir todos veiculos de Passeio
                    case 3 -> {
                        System.out.print("\t\t\t\t\t\t(3) Imprimir todos veiculos de Passeio \n");
                        System.out.println();
                        Test.ex.log(opcao);
                        if (bdVeiculos.getListaPasseio().size() == 0)
                            l.entDados("Lista VEICULOS PASSEIO encontra-se vazia! Precione <ENTER> para prosseguir.");
                        for (Passeio registros : bdVeiculos.getListaPasseio()) {
                            if (registros != null) {
                                impPasseioCarga(registros, carga);
                                System.out.println();
                                System.out.println("________________________________________________________________");
                            } else {
                                l.entDados("Sem mais VEICULOS PASSEIO para imprimir! Precione <ENTER> para prosseguir.");
                                break;
                            }
                        }
                    }
                    //Trata Imprimir todos veiculos de Carga
                    case 4 -> {
                        System.out.print("\t\t\t\t\t\t(4) Imprimir todos veiculos de Carga \n");
                        System.out.println();
                        Test.ex.log(opcao);
                        if (bdVeiculos.getListaCarga().size() == 0)
                            l.entDados("Lista VEICULOS CARGA encontra-se vazia! Precione <ENTER> para prosseguir.");
                        for (Carga registros : bdVeiculos.getListaCarga()) {
                            if (registros != null) {
                                impPasseioCarga(passeio, registros);
                                System.out.println();
                                System.out.println("________________________________________________________________");
                            } else {
                                l.entDados("Sem mais VEICULOS CARGA para imprimir! Precione <ENTER> para prosseguir.");
                                break;
                            }
                        }
                    }
                    //Trata Imprimir veiculo de Passeio pela placa
                    case 5 -> {
                        System.out.print("\t\t\t\t\t\t (5) Imprimir veiculo de Passeio pela placa \n");
                        System.out.println();
                        Test.ex.log(opcao);
                        cadastraPesquisaRemovePlaca();
                    }
                    //Trata Imprimir veiculo de Carga pela placa
                    case 6 -> {
                        System.out.print("\t\t\t\t\t\t (5) Imprimir veiculo de Carga pela placa \n");
                        System.out.println();
                        Test.ex.log(opcao);
                        cadastraPesquisaRemovePlaca();
                    }
                    //Trata Excluir veiculo de Passeio pela placa
                    case 7 -> {
                        System.out.print("\t\t\t\t\t\t (7) Excluir veiculo de Passeio pela placa \n");
                        System.out.println();
                        Test.ex.log(opcao);
                        cadastraPesquisaRemovePlaca();
                    }
                    //Trata Excluir veiculo de Carga pela placa
                    case 8 -> {
                        System.out.print("\t\t\t\t\t\t (8) Excluir veiculo de Carga pela placa \n");
                        System.out.println();
                        Test.ex.log(opcao);
                        cadastraPesquisaRemovePlaca();
                    }
                    //Trata finalizacao do sistema
                    case 9 -> {
                        System.out.println();
                        continua = false;
                    }
                    default -> l.entDados("O valor deve ser >= 1 e <= a 7. Precione <ENTER> para prosseguir.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Deve digitar um valor inteiro! Precione <ENTER> para prosseguir.");
                l.entDados("");
            }
        }
    }
    //Fim de main()

    /************************************************************************************************
     *
     *                                   Inicio Metodos de apoio
     *
     * relacionado a tratar Cadastrar/Pesquisar/Remove veiculo de Passeio e Carga (opcoes 1,2,3,4,5,6,7 e 8 do menu)
     *
     *************************************************************************************************
     */
    private static void cadastraPesquisaRemovePlaca() {
        Veiculo veiculo;
        boolean testExistePlaca = false, validaPlaca;
        String placa;
        boolean exclusao = false;
        boolean imprimir = false;
        boolean tst = (opcao == (5) || opcao == (6) ? true : false);
        Passeio passeio = null;
        Carga carga = null;
        if (ex.isLogPasseioOUcarga()) {
            passeio = new Passeio();
        } else {
            carga = new Carga();
        }
        do {
            placa = l.entDados("Informe a placa: (Ex.:ABC1234) a ser " + (ex.isLogCadastraOUpesquisa() ?
                    "cadastrada " : "pesquisada") + "? Precione <ENTER> para prosseguir.");
            validaPlaca = (ex.validaPlaca(placa));
        } while (!validaPlaca);
        (ex.isLogPasseioOUcarga() ? passeio : carga).setPlaca(placa);
        for (int i = 0; i < (ex.isLogPasseioOUcarga() ? bdVeiculos.getListaPasseio() : bdVeiculos.getListaCarga()).size(); i++) {
            if ((ex.isLogPasseioOUcarga() ? bdVeiculos.getListaPasseio() :
                    bdVeiculos.getListaCarga()).get(i).getPlaca().equalsIgnoreCase(ex.isLogPasseioOUcarga() ?
                    String.valueOf(passeio.getPlaca()) : String.valueOf(carga.getPlaca()))) {
                if (ex.isLogRemove()) {
                    (ex.isLogPasseioOUcarga() ? bdVeiculos.getListaPasseio() : bdVeiculos.getListaCarga()).remove(i);
                    exclusao = true;
                    if (ex.isLogPasseioOUcarga()) {
                        contadorPasseio--;
                    } else {
                        contadorCarga--;
                    }
                    System.out.printf("Excluido da Lista na posicao [" + i + "].");
                    l.entDados("Tecle <ENTER> para prosseguir!");
                    break;
                }
                try {
                    if (ex.isLogCadastraOUpesquisa()) {
                        testExistePlaca = true;
                        throw new VeicExistException("Ja existe veiculo com esta PLACA na posicao lista" +
                                (ex.isLogPasseioOUcarga() ? "Passeio[" : "Carga[") + i + "]. Precione <ENTER> para prosseguir.");
                    }
                } catch (VeicExistException e) {
                    l.entDados(e.getMessage());
                }
                if (ex.isLogPasseioOUcarga()) {
                    veiculo = bdVeiculos.getListaPasseio().get(i);
                    passeio = (Passeio) veiculo;
                    if (passeio != null) impPasseioCarga(passeio, carga);
                    System.out.println("________________________________________________________________");
                    imprimir = true;
                } else {
                    veiculo = bdVeiculos.getListaCarga().get(i);
                    carga = (Carga) veiculo;
                    if (carga != null) impPasseioCarga(passeio, carga);
                    System.out.println("________________________________________________________________");
                    imprimir = true;
                }
                l.entDados("Sem mais VEICULOS " + (ex.isLogPasseioOUcarga() ?
                        "PASSEIO para imprimir!" : "CARGA para imprimir! ") + "Precione <ENTER> para prosseguir.");
                break;
            }
        }
        if (ex.isLogRemove() && !testExistePlaca && !exclusao && (!tst))
            l.entDados("Placa inexistente. Precione <ENTER> para prosseguir.");
        if (!testExistePlaca && !ex.isLogRemove()) {
            if (ex.isLogCadastraOUpesquisa()) {
                if (ex.isLogPasseioOUcarga()) {
                    passeio = new Passeio();
                    passeio.setPlaca(placa);
                    bdVeiculos.setListaPasseio(recebePasseioCarga(passeio, carga));
                } else {
                    carga = new Carga();
                    carga.setPlaca(placa);
                    bdVeiculos.setListaCarga(recebePasseioCarga(passeio, carga));
                }
                System.out.println((ex.isLogPasseioOUcarga() ? "Passeio armazenado na posicao listaPasseio[" +
                        contadorPasseio++ + "]." : "Carga armazenado na posicao listaCarga[" + contadorCarga++ + "]."));
                System.out.println();
            }
        }
        if ((tst) && (imprimir != true))
            l.entDados("Placa inexistente. Precione <ENTER> para prosseguir.");
    }
    //Fim de cadastraPesquisaPlaca()

    /**
     * ___________________________________________________________________________________________
     * *
     * relacionado a tratar veiculo de Passeio e Carga
     * (receber informacoes, opcoes 1,2 do menu)
     * <p>
     * ___________________________________________________________________________________________
     */
    private static Veiculo recebePasseioCarga(Passeio passeio, Carga carga) {
        Veiculo passOUcarg = null;
        do {
            try {
                (ex.isLogPasseioOUcarga() ? passeio : carga).setMarca(l.entDados("Marca: "));
                (ex.isLogPasseioOUcarga() ? passeio : carga).setModelo(l.entDados("Modelo: "));
                (ex.isLogPasseioOUcarga() ? passeio : carga).setCor(l.entDados("Cor: "));
                (ex.isLogPasseioOUcarga() ? passeio : carga).setQtdRodas(Integer.parseInt(l.entDados("Quantidade de rodas (+ step): ")));
                (ex.isLogPasseioOUcarga() ? passeio : carga).getMotor().setQtdPist(Integer.parseInt(l.entDados("Quantidade de pistoes: ")));
                (ex.isLogPasseioOUcarga() ? passeio : carga).getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia: ")));
                (ex.isLogPasseioOUcarga() ? passeio : carga).setVelMax(Float.parseFloat(l.entDados("Velocidade Maxima: ")));
                if (ex.isLogPasseioOUcarga()) {
                    passeio.setQtdPassageiros(Integer.parseInt(l.entDados("Quantidade de Passageiros: ")));
                    passOUcarg = passeio;
                } else {
                    carga.setCargaMax(Integer.parseInt(l.entDados("Carga Maxima: ")));
                    carga.setTara(Integer.parseInt(l.entDados("Tara: ")));
                    passOUcarg = carga;
                }
                float velPadrao = (ex.isLogPasseioOUcarga() ? passeio : carga).getVelMax();
                if (velPadrao < MENORQUE || velPadrao > MAIORQUE) {
                    throw new VelocException("A velocidade maxima esta fora dos limites brasileiros!" +
                            (ex.isLogPasseioOUcarga() ? " Valor assumido para Velocidade Maxima Passeio foi de 100Km/h.\n" :
                                    " Valor assumido para Velocidade Maxima Carga foi de 90Km/h.\n") +
                            "\t\t\t\t\t\t\t\t\t\t\t Precione <ENTER> para prosseguir.");
                }
            } catch (NumberFormatException e) {
                ex.atencao();
            } catch (VelocException ve) {
                l.entDados(ve.getMessage());
                (ex.isLogPasseioOUcarga() ? passeio : carga).setVelMax(Float.parseFloat(String.valueOf(ex.isLogPasseioOUcarga() ?
                        VELNAXPASSEIO : VELNAXCARGA)));
            }
        } while (passOUcarg == null);
        return passOUcarg;
    }
//Fim de registraPasseioCarga(Passeio passeio, Carga carga)

    /**
     * ___________________________________________________________________________________________
     * *
     * relacionado a tratar impressao veiculo de Passeio e Carga (opcoes 3,4,5 e 6 do menu)
     * Metodo para imprimir atraves de println e getters...
     * <p>
     * ___________________________________________________________________________________________
     */
    private static void impPasseioCarga(Passeio passeio, Carga carga) {
        System.out.print("Placa: ");
        System.out.print((ex.isLogPasseioOUcarga() ? passeio : carga).getPlaca());
        System.out.println(".");
        System.out.print("Marca: ");
        System.out.print((ex.isLogPasseioOUcarga() ? passeio : carga).getMarca());
        System.out.println(".");
        System.out.print("Modelo: ");
        System.out.print((ex.isLogPasseioOUcarga() ? passeio : carga).getModelo());
        System.out.println(".");
        System.out.print("Cor: ");
        System.out.print((ex.isLogPasseioOUcarga() ? passeio : carga).getCor());
        System.out.println(".");
        System.out.print("Quantidade de rodas (+ step): ");
        System.out.print((ex.isLogPasseioOUcarga() ? passeio : carga).getQtdRodas());
        System.out.println(" unidades.");
        System.out.print("Quantidade de pistoes: ");
        System.out.print((ex.isLogPasseioOUcarga() ? passeio : carga).getMotor().getQtdPist());
        System.out.println(" unidades.");
        System.out.print("Potencia: ");
        System.out.print((ex.isLogPasseioOUcarga() ? passeio : carga).getMotor().getPotencia());
        System.out.println(" horse/power.");
        if (ex.isLogPasseioOUcarga()) {
            System.out.println("Quantidade de Passageiros: " + passeio.getQtdPassageiros() + " pessoas.");
            System.out.println("Cacular quantidade de Letras: " + passeio.calcular() + " letras.");
        } else {
            System.out.println("Carga Maxima: " + carga.getCargaMax() + " Ton.");
            System.out.println("Tara: " + carga.getTara() + " Ton.");
            System.out.println("Cacular soma de numeros: " + carga.calcular() + " elementos.");
        }
        System.out.print("Velocidade Maxima: ");
        System.out.print(new BigDecimal(String.valueOf((ex.isLogPasseioOUcarga() ? passeio :
                carga).calcVel((ex.isLogPasseioOUcarga() ? passeio : carga).getVelMax()))).toPlainString());
        System.out.println(ex.isLogPasseioOUcarga() ? " meter/hour." : " centimeter/hour.");
    }
    //Fim de impPasseioCarga(Passeio passeio, Carga carga)
}
//Fim da classe