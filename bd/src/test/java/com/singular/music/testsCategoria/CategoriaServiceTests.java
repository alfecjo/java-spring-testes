package com.singular.music.testsCategoria;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.singular.music.model.Categoria;
import com.singular.music.repository.CategoriaRepository;
import com.singular.music.service.CategoriaService;

@ExtendWith(MockitoExtension.class)
public class CategoriaServiceTests {
    @InjectMocks
    private CategoriaService categoriaService;

    @Mock
    private CategoriaRepository categoriaRepository;

    Categoria categoria1 = new Categoria(1, "MPB");
    Categoria categoria2 = new Categoria(2, "Rock");
    Categoria categoria3 = new Categoria(3, "Samba");
    Categoria categoria4 = new Categoria(4, "Sertanejo");
    List<Categoria> mockCategorias = List.of(categoria1, categoria2, categoria3, categoria4);

    @Test
    public void testFindAll() {
        Mockito.when(categoriaRepository.findAll()).thenReturn(mockCategorias);

        List<Categoria> result = categoriaService.findAll();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(4, result.size());
        Assertions.assertEquals("MPB", result.get(0).getDescCategoria(), "MPB");
        Assertions.assertEquals("Rock", result.get(1).getDescCategoria(), "Rock");
        Assertions.assertEquals("Samba", result.get(2).getDescCategoria(), "Samba");
        Assertions.assertEquals("Sertanejo", result.get(3).getDescCategoria(), "Sertanejo");
    }

    @Test
public void testFindById() {
        Categoria categoriaMock = new Categoria(1, "MPB");

        Mockito.when(categoriaRepository.findById(1)).thenReturn(java.util.Optional.of(categoriaMock));

        java.util.Optional<Categoria> result = categoriaService.findById(1);

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals("MPB", result.get().getDescCategoria());
    }

    @Test
    public void testSaveCategoria() {
        Categoria categoriaNovo = new Categoria(null, "Jazz");
        Categoria categoriaSave = new Categoria(99, "Bossa Nova");  

        Mockito.when(categoriaRepository.save(categoriaNovo)).thenReturn(categoriaSave);

        Categoria result = categoriaService.save(categoriaNovo);

        Assertions.assertNotNull(result.getCodCategoria());
        Assertions.assertEquals(99, result.getCodCategoria());
        Assertions.assertEquals("Bossa Nova", result.getDescCategoria());
    }
}