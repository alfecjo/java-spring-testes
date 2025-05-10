package com.singular.music.dto;

import com.singular.music.model.Pessoa;

public record PessoaDTO(
        Integer codPessoa,
        String nomePessoa
) {
    public PessoaDTO(Pessoa pessoa) {
        this(pessoa.getCodPessoa(), pessoa.getNomePessoa());
    }
}
