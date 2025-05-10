package com.singular.music.dto;

import com.singular.music.model.Cantor;

public record CantorDTO(Integer codCantor, String nomeCantor, String pais) {
    public CantorDTO(Cantor cantor) {
        this(cantor.getCodCantor(), cantor.getNomeCantor(), cantor.getPais());
    }
}
