package com.singular.music.testsCantor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.singular.music.model.Cantor;
import com.singular.music.repository.CantorRepository;
import com.singular.music.service.CantorService;

import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class CantorServiceTests {

    @InjectMocks
    private CantorService cantorService;
    
    @Mock
    private CantorRepository cantorRepository;

    Cantor cantor1 = new Cantor(1, "Marisa Monte", "Brasil");
    Cantor cantor2 = new Cantor(4, "Djavan", "Brasil");
    Cantor cantor3 = new Cantor(8, "Legiao Urbana", "Brasil");
    Cantor cantor4 = new Cantor(10, "Tom Jobim", "Brasil");
    List<Cantor> mockCantores = List.of(cantor1, cantor2, cantor3, cantor4);

    @Test
    public void testFindAll() {// Quando o repositório for chamado, ele irá retornar os cantores mockados
        Mockito.when(cantorRepository.findAll()).thenReturn(mockCantores);

        List<Cantor> result = cantorService.findAll();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(4, result.size());
        Assertions.assertEquals("Marisa Monte", result.get(0).getNomeCantor(), "Brasil");
        Assertions.assertEquals("Djavan", result.get(1).getNomeCantor(), "Brasil");
        Assertions.assertEquals("Brasil", result.get(1).getPais(), "Brasil");
    }

    @Test
    public void testFindById() {
        Cantor cantorMock = new Cantor(1, "Gilberto Gil", "Brasil");

        Mockito.when(cantorRepository.findById(1)).thenReturn(Optional.of(cantorMock));

        Optional<Cantor> result = cantorService.findById(1);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals("Gilberto Gil", result.get().getNomeCantor());
    }

    @Test
    public void testSaveCantor() {
        Cantor cantorNovo = new Cantor(null, "Elis Regina", "Brasil");
        Cantor cantorSave = new Cantor(99, "Elis Regina", "Brasil");

        Mockito.when(cantorRepository.save(cantorNovo)).thenReturn(cantorSave);

        Cantor result = cantorService.save(cantorNovo);

        Assertions.assertNotNull(result.getCodCantor());
        Assertions.assertEquals(99, result.getCodCantor());
        Assertions.assertEquals("Elis Regina", result.getNomeCantor());
    }

    @Test
    public void testDeleteById() {
        Integer cantorId = 1000;

        cantorService.deleteById(cantorId);

        Mockito.verify(cantorRepository, Mockito.times(1)).deleteById(cantorId);
    }

    @Test
    public void testFindByPais() {
        // Quando o repositório for chamado, ele irá retornar os cantores mockados
        Mockito.when(cantorRepository.findByPais("Brasil")).thenReturn(mockCantores);

        // Testar o serviço
        List<Cantor> result = cantorService.findByPais("Brasil");

        // Verificar se o retorno é o esperado
        Assertions.assertNotNull(result);
        Assertions.assertEquals(4, result.size());
        Assertions.assertEquals("Marisa Monte", result.get(0).getNomeCantor());
        Assertions.assertEquals("Djavan", result.get(1).getNomeCantor());
        Assertions.assertEquals("Legiao Urbana", result.get(2).getNomeCantor());
        Assertions.assertEquals("Tom Jobim", result.get(3).getNomeCantor());
    }
}