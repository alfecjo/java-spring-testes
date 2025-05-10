package com.singular.music.testsMusica;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.singular.music.model.Categoria;
import com.singular.music.model.Musica;
import com.singular.music.repository.MusicaRepository;
import com.singular.music.service.MusicaService;

@ExtendWith(MockitoExtension.class)
public class MusicaServiceTests {

    @InjectMocks
    private MusicaService musicaService;

    @Mock
    private MusicaRepository musicaRepository;

    @Test
    public void testFindMusicAll() {
        Categoria categoria = new Categoria(1, "MPB");

        Musica music = new Musica(1, "Amor I love you", 240, categoria);
        Musica music1 = new Musica(2, "Nao e facil", 300, categoria);
        Musica music2 = new Musica(3, "Gentileza", 250, categoria);

        List<Musica> mockMusica = List.of(music, music1, music2);

        Mockito.when(musicaRepository.findAll()).thenReturn(mockMusica);

        List<Musica> result = musicaService.findAll();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Amor I love you", result.get(0).getTitulo());
        Assertions.assertEquals("Nao e facil", result.get(1).getTitulo());
        Assertions.assertEquals("Gentileza", result.get(2).getTitulo());
    }
}