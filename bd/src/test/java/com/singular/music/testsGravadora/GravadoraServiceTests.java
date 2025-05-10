package com.singular.music.testsGravadora;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.singular.music.model.Gravadora;
import com.singular.music.repository.GravadoraRepository;
import com.singular.music.service.GravadoraService;

@ExtendWith(MockitoExtension.class)
public class GravadoraServiceTests {

    @InjectMocks
    private GravadoraService gravadoraService;

    @Mock
    private GravadoraRepository gravadoraRepository;

    @Test
    public void testGravadoraFindAll() {

        Gravadora gravadora = new Gravadora(1, "Sony", "Estados Unidos");
        Gravadora gravadora1 = new Gravadora(2, "Som livre", "Brasil");
        Gravadora gravadora2 = new Gravadora(3, "EMI", "Estados Unidos");
        List<Gravadora> mockGravadora = List.of(gravadora, gravadora1, gravadora2);

        Mockito.when(gravadoraRepository.findGravadoraAll()).thenReturn(mockGravadora);

        List<Gravadora> result = gravadoraService.findGravadoraAll();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Sony", result.get(0).getNomeGravadora());
        Assertions.assertEquals("Brasil", result.get(1).getPais());
        Assertions.assertEquals(2, result.get(1).getCodGravadora());
    }
}
