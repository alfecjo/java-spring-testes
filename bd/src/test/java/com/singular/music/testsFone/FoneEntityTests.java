package com.singular.music.testsFone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.singular.music.model.Fone;
import com.singular.music.model.Pessoa;

public class FoneEntityTests {
    @Test
    public void testLombok() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCodPessoa(1);
        pessoa.setNomePessoa("João");

        Fone fone = new Fone();
        Fone fone1 = new Fone(1, "3333-1111", "R", pessoa);

        Assertions.assertNotNull(fone);
        Assertions.assertEquals(null, fone.getCodFone(), "CodFone deveria ser null");
        Assertions.assertEquals(null, fone.getNumero(), "Número do fone deveria ser null");
        Assertions.assertEquals(null, fone.getTipo(), "Tipo deveria ser null");

        Assertions.assertNotNull(fone1);
        Assertions.assertEquals("3333-1111", fone1.getNumero(), "Número do fone deveria ser 3333-1111");
        Assertions.assertEquals(1, fone1.getCodFone(), "CodFone deveria ser 2");
        Assertions.assertEquals("R", fone1.getTipo(), "Tipo deveria ser R");
        Assertions.assertEquals(1, fone1.getPessoa().getCodPessoa(), "Código da Pessoa relativo ao Fone de CodFone 1");
        Assertions.assertEquals("João", fone1.getPessoa().getNomePessoa(),
                "Nome da Pessoa deveria ser igual a pessoa criada");

        Assertions.assertEquals(Fone.class, fone.getClass(), "Classe do objeto deveria ser Fone");
        Assertions.assertTrue(fone instanceof Fone, "Objeto deveria ser uma instância de Fone");
    }

    @Test
    public void testEqualsAndHashCode() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCodPessoa(1);
        pessoa.setNomePessoa("João");

        //A título do teste não está correto, pois o código não está testando a classe Fone, mas sim a classe Pessoa.
        // pessoa.getTelefones().add(new Fone(1, "3333-1111", "R", pessoa));
        // pessoa.getTelefones().add(new Fone(1, "3333-2222", "R", pessoa));
        // pessoa.getTelefones().add(new Fone(3, "3333-3333", "R", pessoa));

        Fone fone1 = new Fone(1, "3333-1111", "R", pessoa);
        Fone fone2 = new Fone(1, "3333-2222", "R", pessoa);
        Fone fone3 = new Fone(2, "3333-3333", "R", pessoa);

        Assertions.assertEquals(fone1, fone2, "Objetos deveriam ser iguais, pois possuem o mesmo HashCode");
        Assertions.assertNotEquals(fone1, fone3,
                "Objetos deveriam ser diferentes, pois possuem HashCode diferentes");

        Assertions.assertEquals(fone1.hashCode(), fone2.hashCode(),
                "Objetos deveriam ser iguais, pois possuem mesmo HashCode");
        Assertions.assertNotEquals(fone2.hashCode(), fone3.hashCode(),
                "Objetos deveriam ser diferentes, pois possuem HashCode diferentes");
    }
}
