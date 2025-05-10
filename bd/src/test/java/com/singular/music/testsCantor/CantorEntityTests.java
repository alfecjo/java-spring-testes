package com.singular.music.testsCantor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.singular.music.model.Cantor;

public class CantorEntityTests {
    @Test
    public void testLombok() {  
        Cantor cantor = new Cantor();
        Cantor cantor1 = new Cantor(2, "U2", "Irlanda");

        Assertions.assertNotNull(cantor);
        Assertions.assertEquals(null, cantor.getCodCantor(), "CodCantor deveria ser null");
        Assertions.assertEquals(null, cantor.getNomeCantor(), "Nome do cantor deveria ser null");
        Assertions.assertEquals(null, cantor.getPais(), "País deveria ser null");

        Assertions.assertNotNull(cantor1);
        Assertions.assertEquals(2, cantor1.getCodCantor(), "CodCantor deveria ser 2");
        Assertions.assertEquals("U2", cantor1.getNomeCantor(), "Nome do cantor deveria ser U2");
        Assertions.assertEquals("Irlanda", cantor1.getPais(), "País deveria ser Irlanda");

        Assertions.assertEquals(Cantor.class, cantor.getClass(), "Classe do objeto deveria ser Cantor");
        Assertions.assertTrue(cantor instanceof Cantor, "Objeto deveria ser uma instância de Cantor");
    }

    @Test
    public void testEqualsAndHashCode() {
        Cantor cantor1 = new Cantor(1, "Marisa Monte", "Brasil");
        Cantor cantor2 = new Cantor(1, "Coldplay", "Inglaterra");
        Cantor cantor3 = new Cantor(2, "U2", "Irlanda");

        // Teste de igualdade por Id
        Assertions.assertEquals(cantor1, cantor2, "Objetos deveriam ser iguais, pois possuem o mesmo HashCode");
        Assertions.assertNotEquals(cantor1, cantor3,
                "Objetos deveriam ser diferentes, pois possuem HashCode diferentes");

        // Testando HashCode
        Assertions.assertEquals(cantor1.hashCode(), cantor2.hashCode(),
                "Objetos deveriam ser iguais, pois possuem mesmo HashCode");
        Assertions.assertNotEquals(cantor2.hashCode(), cantor3.hashCode(),
                "Objetos deveriam ser diferentes, pois possuem HashCode diferentes");
    }

}
