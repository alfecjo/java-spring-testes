package com.singular.music.testsFone;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.singular.music.model.Fone;
import com.singular.music.model.Pessoa;
import com.singular.music.repository.FoneRepository;
import com.singular.music.service.FoneService;

@ExtendWith(MockitoExtension.class)
public class FoneServiceTests {

    @InjectMocks
    private FoneService foneService;

    @Mock
    private FoneRepository foneRepository;

    @Test
    public void testFindAll() {

        Pessoa pessoa = new Pessoa(1, "Marisa Monte", new ArrayList<Fone>());

        Fone fone = new Fone(1, "3333-1111", "R", pessoa);
        Fone fone1 = new Fone(2, "4444-1111", "L", pessoa);
        Fone fone2 = new Fone(3, "5555-1111", "C", pessoa);

        pessoa.getTelefones().add(fone);
        pessoa.getTelefones().add(fone1);
        pessoa.getTelefones().add(fone2);

        List<Fone> mockFone = List.of(fone, fone1, fone2);

        Mockito.when(foneRepository.findAll()).thenReturn(mockFone);

        List<Fone> result = foneService.findAll();

        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("3333-1111", result.get(0).getNumero());
        assertEquals("4444-1111", result.get(1).getNumero());
        assertEquals(2, result.get(1).getCodFone());
        assertEquals("C", result.get(2).getTipo());
    }

    @Test
    public void testFindById() {
        Pessoa pessoa = new Pessoa(1, "Marisa Monte", new ArrayList<Fone>());

        Fone fone = new Fone(1, "3333-1111", "R", pessoa);
        Fone fone1 = new Fone(2, "4444-1111", "L", pessoa);

        List<Fone> mockFone = List.of(fone, fone1);

        Mockito.when(foneRepository.findById(2)).thenReturn(Optional.of(mockFone.get(1)));

        Fone result = foneService.findById(2).orElse(null);

        assertNotNull(result);
        assertEquals("4444-1111", result.getNumero());
    }

    @Test
    public void testSaveFone() {
        Pessoa pessoa = new Pessoa(1, "Marisa Monte", new ArrayList<Fone>());

        Fone foneNovo = new Fone(null, "3333-1111", "R", pessoa);
        Fone foneSalvo = new Fone(1, "3333-1111", "R", pessoa);

        Mockito.when(foneRepository.save(foneNovo)).thenReturn(foneSalvo);

        Fone result = foneService.save(foneNovo);

        assertNotNull(result);
        assertEquals(1, result.getCodFone());
    }

    @Test
    public void testDeleteById() {
        Integer foneId = 1000;

        foneService.deleteById(foneId);

        Mockito.verify(foneRepository, Mockito.times(1)).deleteById(foneId);
    }

    @Test
    public void testFindByTipo() {
        Pessoa pessoa = new Pessoa(1, "Marisa Monte", new ArrayList<Fone>());

        Fone fone = new Fone(1, "3333-1111", "R", pessoa);

        List<Fone> mockFone = List.of(fone);

        Mockito.when(foneRepository.findByTipo("R")).thenReturn(mockFone);

        List<Fone> result = foneService.findByTipo("R");

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("3333-1111", result.get(0).getNumero());
    }
}