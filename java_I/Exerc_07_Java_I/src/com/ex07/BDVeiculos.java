//pacote ex_06 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex07;

import java.util.ArrayList;
import java.util.List;

//declara classe
public class BDVeiculos {
    private final List<Passeio> listaPasseio;
    private final List<Carga> listaCarga;

    //construror
    public BDVeiculos() {
        listaPasseio = new ArrayList<>();
        listaCarga = new ArrayList<>();
    }

    //getters e setters
    public List<Passeio> getListaPasseio() {
        return listaPasseio;
    }

    public void setListaPasseio(Veiculo listaPasseio) {
        this.listaPasseio.add((Passeio) listaPasseio);
    }

    public List<Carga> getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(Veiculo listaCarga) {
        this.listaCarga.add((Carga) listaCarga);
    }
}
//Fim da classe