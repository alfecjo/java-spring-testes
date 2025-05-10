package com.singular.music.testsGravacao;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.singular.music.model.Cantor;
import com.singular.music.model.Categoria;
import com.singular.music.model.Gravacao;
import com.singular.music.model.Gravadora;
import com.singular.music.model.Musica;
import com.singular.music.repository.GravacaoRepository;
import com.singular.music.service.GravacaoService;

@ExtendWith(MockitoExtension.class)
public class GravacaoServiceTests {

    @InjectMocks
    private GravacaoService gravacaoService;

    @Mock
    private GravacaoRepository gravacaoRepository;

    @Test
    public void testFindByCodCantor() {
        // Criar cantor específico para o teste
        Cantor cantor = new Cantor(1, "Marisa Monte", "Brasil");

        // Criar categoria
        Categoria categoria = new Categoria(1, "MPB");
        Categoria categoria1 = new Categoria(2, "Rock");

        // Criar outros objetos relacionados
        Gravadora gravadora = new Gravadora(1, "Sony", "Estados Unidos");
        Musica musica1 = new Musica(1, "Amor I love you", 240, categoria);
        Musica musica2 = new Musica(12, "Wave", 250, categoria1);

        // Criar gravações associadas ao cantor
        Gravacao gravacao1 = new Gravacao(1, LocalDate.of(1996, 5, 10), cantor, gravadora, musica1);
        Gravacao gravacao2 = new Gravacao(1, LocalDate.of(1996, 5, 10), cantor, gravadora, musica2);

        // Lista mockada de gravações do cantor
        List<Gravacao> mockGravacoes = List.of(gravacao1, gravacao2);

        // Simular comportamento do repositório
        Mockito.when(gravacaoRepository.findByCodCantor(1)).thenReturn(mockGravacoes);

        // Chamar o serviço
        List<Gravacao> result = gravacaoService.findByCodCantor(1);

        // Verificações
        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("Amor I love you", result.get(0).getMusica().getTitulo());
        Assertions.assertEquals("Wave", result.get(1).getMusica().getTitulo());
    }

    @Test
    public void testFindByAnoGravacao() {
        // Criar cantor específico para o teste
        Cantor cantor = new Cantor(1, "Marisa Monte", "Brasil");

        // Criar categoria
        Categoria categoria = new Categoria(1, "MPB");
        Categoria categoria1 = new Categoria(2, "Rock");

        Gravadora gravadora = new Gravadora(1, "Sony", "Estados Unidos");
        Musica musica1 = new Musica(1, "Amor I love you", 240, categoria);
        Musica musica2 = new Musica(12, "Wave", 250, categoria1);

        Gravacao gravacao1 = new Gravacao(1, LocalDate.of(1996, 5, 10), cantor, gravadora, musica1);
        Gravacao gravacao2 = new Gravacao(1, LocalDate.of(1996, 5, 10), cantor, gravadora, musica2);

        // Lista mockada de gravações do cantor
        List<Gravacao> mockGravacoes = List.of(gravacao1, gravacao2);

        // Simular comportamento do repositório
        Mockito.when(gravacaoRepository.findByAnoGravacaoAndCodCantor(LocalDate.of(1996, 5, 10), 1))
                .thenReturn(mockGravacoes);

        // Chamar o serviço
        List<Gravacao> result = gravacaoService.findByAnoGravacaoAndCodCantor(LocalDate.of(1996, 5, 10), 1);

        // Verificações
        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("Amor I love you", result.get(0).getMusica().getTitulo());
        Assertions.assertEquals("Wave", result.get(1).getMusica().getTitulo());
    }

    @Test
    public void testFindByCodCantorNotFound() {
        Mockito.when(gravacaoRepository.findByCodCantor(99)).thenReturn(List.of());

        List<Gravacao> result = gravacaoService.findByCodCantor(99);

        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void testFindByCodCantorThrowsException() {
        Mockito.when(gravacaoRepository.findByCodCantor(1))
                .thenThrow(new RuntimeException("Database error"));

        Assertions.assertThrows(RuntimeException.class, () -> {
            gravacaoService.findByCodCantor(1);
        });
    }

    @Test
public void testFindByCodCantores() {
    // Criar cantor específico para o teste
    Cantor cantor = new Cantor(1, "Marisa Monte", "Brasil");

    // Criar categoria
    Categoria categoria = new Categoria(1, "MPB");
    Categoria categoria1 = new Categoria(2, "Rock");

    // Criar gravadora e músicas
    Gravadora gravadora = new Gravadora(1, "Sony", "Estados Unidos");
    Musica musica1 = new Musica(1, "Amor I love you", 240, categoria);
    Musica musica2 = new Musica(12, "Wave", 250, categoria1);

    // Criar gravações associadas ao cantor
    Gravacao gravacao1 = new Gravacao(1, LocalDate.of(1996, 5, 10), cantor, gravadora, musica1);
    Gravacao gravacao2 = new Gravacao(1, LocalDate.of(1996, 5, 10), cantor, gravadora, musica2);

    // Lista mockada de gravações do cantor
    List<Gravacao> mockGravacoes = List.of(gravacao1, gravacao2);

    // Simular comportamento do repositório
    Mockito.when(gravacaoRepository.findByCodCantor(1)).thenReturn(mockGravacoes);

    // Chamar o serviço
    List<Gravacao> result = gravacaoService.findByCodCantor(1);

    // Verificações
    Assertions.assertNotNull(result);
    Assertions.assertEquals(2, result.size());
    Assertions.assertEquals("Amor I love you", result.get(0).getMusica().getTitulo());
    Assertions.assertEquals("Wave", result.get(1).getMusica().getTitulo());

    // Verificar se o método foi chamado exatamente uma vez com o parâmetro correto
    Mockito.verify(gravacaoRepository, Mockito.times(1)).findByCodCantor(1);
}

}