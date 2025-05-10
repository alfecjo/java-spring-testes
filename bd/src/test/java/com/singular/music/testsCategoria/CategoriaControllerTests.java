package com.singular.music.testsCategoria;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.singular.music.controller.CategoriaController;
import com.singular.music.model.Categoria;
import com.singular.music.service.CategoriaService;

public class CategoriaControllerTests {
    @Mock
    private CategoriaService categoriaService;

    @InjectMocks
    private CategoriaController categoriaController;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(categoriaController).build();
    }

    @Test
    public void testFindAll() throws Exception {
        List<Categoria> categorias = List.of(
                new Categoria(1, "MPB"),
                new Categoria(2, "Rock"),
                new Categoria(3, "Samba"),
                new Categoria(4, "Sertanejo"));

        Mockito.when(categoriaService.findAll()).thenReturn(categorias);

        mockMvc.perform(get("/categorias"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(4))
                .andExpect(jsonPath("$[0].descCategoria").value("MPB"))
                .andExpect(jsonPath("$[1].descCategoria").value("Rock"))
                .andExpect(jsonPath("$[2].descCategoria").value("Samba"))
                .andExpect(jsonPath("$[3].descCategoria").value("Sertanejo"));

        MvcResult result = mockMvc.perform(get("/categorias")).andReturn();

        getPrettyJson(result);
    }

    @Test
    public void testFindById() throws Exception {
        Categoria categoriaMock = new Categoria(0, "MPB");

        Mockito.when(categoriaService.findById(0)).thenReturn(java.util.Optional.of(categoriaMock));

        MvcResult result = mockMvc.perform(get("/categorias/0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.codCategoria").value(0))
                .andExpect(jsonPath("$.descCategoria").value("MPB"))
                .andReturn();

        getPrettyJson(result);
    }

    @Test
    public void testCreateCategoria() throws Exception {
        Categoria categoria = new Categoria(null, "Tango");
        Categoria saveCategoria = new Categoria(1, "Jazz");

        Mockito.when(categoriaService.save(Mockito.any(Categoria.class))).thenReturn(saveCategoria);

        // 1. Teste com JSON escrito manualmente
        MvcResult mvcResult = mockMvc.perform(post("/categorias")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"descCategoria\":\"Jazz\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.codCategoria").value(1))
                .andExpect(jsonPath("$.descCategoria").value("Jazz"))
                .andReturn();

        getPrettyJson(mvcResult);

        String categoriaJson = new ObjectMapper().writeValueAsString(categoria);

        // 2. Teste com objeto serializado via ObjectMapper
        mockMvc.perform(post("/categorias")
                .contentType(MediaType.APPLICATION_JSON)
                .content(categoriaJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.codCategoria").value(1))
                .andExpect(jsonPath("$.descCategoria").value("Jazz"));
    }

    @Test
    public void testDeleteCategoria() throws Exception {
        Mockito.doNothing().when(categoriaService).deleteById(1);

        mockMvc.perform(delete("/categorias/1"))
                .andExpect(status().isNoContent());

        Mockito.verify(categoriaService, Mockito.times(1)).deleteById(1);
    }

    @Test
    public void testFindByIdNotFound() throws Exception {
        Mockito.when(categoriaService.findById(99)).thenReturn(java.util.Optional.empty());

        mockMvc.perform(get("/categorias/99"))
                .andExpect(status().isNotFound());
    }

    private void getPrettyJson(MvcResult result)
            throws UnsupportedEncodingException, JsonProcessingException, JsonMappingException {

        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String className = stackTrace[1].getClassName();
        String methodName = stackTrace[1].getMethodName();

        System.out.println("\n" + className + "." + methodName + "()\n");

        String rawJson = result.getResponse().getContentAsString();
        ObjectMapper mapper = new ObjectMapper();
        Object json = mapper.readValue(rawJson, Object.class); // converte para objeto
        ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
        String prettyJson = writer.writeValueAsString(json);

        System.out.println(prettyJson);
    }
}