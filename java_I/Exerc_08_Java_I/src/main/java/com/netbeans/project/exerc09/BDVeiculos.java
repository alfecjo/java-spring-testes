package com.netbeans.project.exerc09;

import java.util.ArrayList;
import java.util.List;

//declara classe
public class BDVeiculos {

//    Passeio passeio;
    private List<Passeio> listaPasseio = new ArrayList<>();
    private List<Carga> listaCarga = new ArrayList<>();

    //construror
    public BDVeiculos() {
    }

    public List<Passeio> getListaPasseio() {
        return listaPasseio;
   }//fim getListaPasseio

    public List<Carga> getListaCarga() {
        return listaCarga;
  }//fim getListaCarga

    public Passeio cadastroPasseio(Passeio passeio) {
        if (consultaPlacaPasseio(passeio) == null) {
            listaPasseio.add(passeio);
            return passeio;
        } else {
            return null;
        }
    }//fim cadastroPasseio

    public Carga cadastroCarga(Carga carga) {
        if (consultaPlacaCarga(carga) == null) {
            listaCarga.add(carga);
            return carga;
        } else {
            return null;
        }
    }//fim cadastroCarga

    public Passeio consultaPlacaPasseio(Passeio pes) {
        for (int i = 0; i < listaPasseio.size(); i++) {
            if (listaPasseio.get(i).getPlaca().equalsIgnoreCase(String.valueOf(pes.getPlaca()))) {
                return listaPasseio.get(i);
            }
        }
        return null;
    }//fim consultaPlacaPasseio

    public Carga consultaPlacaCarga(Carga carga) {
        for (int i = 0; i < listaCarga.size(); i++) {
            if (listaCarga.get(i).getPlaca().equalsIgnoreCase(String.valueOf(carga.getPlaca()))) {
                return listaCarga.get(i);
            }
        }
        return null;
    }//fim consultaPlacaCarga

    public Passeio removePlacaPasseio(Passeio pes) {
        pes = consultaPlacaPasseio(pes);
        if (pes != null) {
            listaPasseio.remove(pes);
            return null;
        } else {
            return pes;
        }
    }//fim removePlacaPasseio

    public void removeTodosPasseio() {
        listaPasseio.removeAll(listaPasseio);
    }//fim removeTodosPasseio

    public void removeTodosCarga() {
        listaCarga.removeAll(listaCarga);
    }//fim removeTodosCarga

    public Carga removePlacaCarga(Carga carga) {
        carga = consultaPlacaCarga(carga);
        if (carga != null) {
            listaCarga.remove(carga);
            return null;
        } else {
            return carga;
        }
    }//fim removePlacaCarga
}
//Fim da classe
