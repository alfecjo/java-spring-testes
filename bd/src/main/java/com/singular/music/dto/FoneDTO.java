package com.singular.music.dto;

import com.singular.music.model.Fone;

public record FoneDTO(
        Integer codFone,
        String numero,
        String tipo,
        PessoaDTO pessoa
) {
    public FoneDTO(Fone fone) {
        this(
            fone.getCodFone(),
            fone.getNumero(),
            fone.getTipo(),
            new PessoaDTO(fone.getPessoa())
        );
    }
}