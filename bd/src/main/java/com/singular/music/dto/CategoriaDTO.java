package com.singular.music.dto;

import com.singular.music.model.Categoria;

public record CategoriaDTO(Integer codCategoria, String descCategoria) {
    public CategoriaDTO(Categoria categoria) {
        this(categoria.getCodCategoria(), categoria.getDescCategoria());
    }
}
