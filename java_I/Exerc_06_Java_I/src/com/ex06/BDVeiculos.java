//pacote ex_06 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex06;

//declara classe
public class BDVeiculos {
    private final int ELEMENTOS = 6;
    private final Passeio[] listaPasseio;
    private final Carga[] listaCarga;

    //construror
    public BDVeiculos() {
        listaPasseio = new Passeio[ELEMENTOS];
        listaCarga = new Carga[ELEMENTOS];
    }

    //getters e setters
    public Passeio[] getListaPasseio() {
        return listaPasseio;
    }

    public void setListaPasseio(Veiculo listaPasseio, int i) {
        this.listaPasseio[i] = (Passeio) listaPasseio;
    }

    public Carga[] getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(Veiculo listaCarga, int i) {
        this.listaCarga[i] = (Carga) listaCarga;
    }

    public int getELEMENTOS() {
        return ELEMENTOS;
    }

    /************************************************************************************************
     *
     * relativo a pesquisa Placa.
     *
     *************************************************************************************************
     */
    public int procuraPlaca(boolean passeioOUcarga, String valPlaca) {
        int achou = ELEMENTOS;
        Passeio passeio = null;
        Carga carga = null;
        int index = achaVaga(passeioOUcarga);
        if (passeioOUcarga) {
            passeio = new Passeio();
        } else {
            carga = new Carga();
        }
        (passeioOUcarga ? passeio : carga).setPlaca(valPlaca);
        for (int i = 0; i < index; i++) {
            if ((passeioOUcarga ? listaPasseio[i] : listaCarga[i]).getPlaca().equalsIgnoreCase(passeioOUcarga ?
                    String.valueOf(passeio.getPlaca()) : String.valueOf(carga.getPlaca()))) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tBDVeiculos.........");
                achou = i;
                break;
            }
        }
        return achou;
    }
    //Fim de public int procuraPlaca(boolean passeioOUcarga, String valPlaca)

    /************************************************************************************************
     *
     * relativo a retornar posicao vago no array/vetor.
     *
     *************************************************************************************************
     */
    public int achaVaga(boolean passeioOUcarga) {

        for (int i = 0; i < (passeioOUcarga ? listaPasseio.length : listaCarga.length); i++) {
            if ((passeioOUcarga ? listaPasseio[i] : listaCarga[i]) == null) {
                return i;
            }
        }
        return 1;
    }
    //Fim de achaVago()

    /************************************************************************************************
     *
     * relativo persistir no array/vetor.
     *
     *************************************************************************************************
     */
    public void getDadosPasseioCarga(Passeio passeio, Carga carga, int i, boolean logPasseioOUcarga, String placa) {
        if (logPasseioOUcarga) {
            this.listaPasseio[i] = passeio;
            this.listaPasseio[i].setPlaca(placa);
        } else {
            this.listaCarga[i] = carga;
            this.listaCarga[i].setPlaca(placa);
        }
    }
    //Fim de public void getDadosPasseioCarga(Passeio passeio, Carga carga, int i, boolean logPasseioOUcarga, String placa)

    /************************************************************************************************
     *
     * relativo a imprimir array/vetor.
     *
     *************************************************************************************************
     */
    public Passeio impPlacaPasseio(int respIndex) {
         return listaPasseio[respIndex];
            }

    public Carga impPlacaCarga(int respIndex) {
        return listaCarga[respIndex];
    }
    //Fim de metodos para impressao na tela
}
//Fim da classe