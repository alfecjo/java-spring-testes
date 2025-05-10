package com.singular.music.testsCategoria;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.singular.music.model.Categoria;

public class CategoriaEntityTests {
    @Test
    public void testLombok() {
        Categoria categoria = new Categoria();
        Categoria categoria1 = new Categoria(0, "Rock");

        Assertions.assertNotNull(categoria);
        Assertions.assertEquals(null, categoria.getCodCategoria());
        Assertions.assertEquals(null, categoria.getDescCategoria());

        Assertions.assertNotNull(categoria1);
        Assertions.assertEquals(0, categoria1.getCodCategoria());
        Assertions.assertEquals("Rock", categoria1.getDescCategoria());

        Assertions.assertEquals(Categoria.class, categoria.getClass(), "Classe do objeto deveria ser Categoria");
        Assertions.assertTrue(categoria instanceof Categoria, "Objeto deveria ser uma instância de Categoria");
    }

    @Test
    public void testEqualsAndHashCode() {
        Categoria categoria1 = new Categoria(1, "Sertanejo");
        Categoria categoria2 = new Categoria(1, "Sertanejo");
        Categoria categoria3 = new Categoria(2, "Samba");

        Assertions.assertEquals(categoria1, categoria2,
                "Objetos deveriam ser iguais, pois possuem o mesmo HashCode");
        Assertions.assertNotEquals(categoria1, categoria3,
                "Objetos deveriam ser diferentes, pois possuem HashCode diferentes");

        Assertions.assertEquals(categoria1.hashCode(), categoria2.hashCode(),
                "Objetos deveriam ser iguais, pois possuem mesmo HashCode");
        Assertions.assertNotEquals(categoria2.hashCode(), categoria3.hashCode(),
                "Objetos deveriam ser diferentes, pois possuem HashCode diferentes");
    }
}