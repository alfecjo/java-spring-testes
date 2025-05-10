package com.singular.music.testsCantor;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.singular.music.controller.CantorController;
import com.singular.music.model.Cantor;
import com.singular.music.service.CantorService;

public class CantorControllerTests {
    @Mock
    private CantorService cantorService;

    @InjectMocks
    private CantorController cantorController;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(cantorController).build();
    }

    @Test
    public void testFindAll() throws Exception {
        List<Cantor> cantores = List.of(
                new Cantor(1, "Gilberto Gil", "Brasil"),
                new Cantor(2, "Milton Nascimento", "Brasil"),
                new Cantor(3, "Caetano Veloso", "Brasil"),
                new Cantor(4, "U2", "Irlanda"));

        Mockito.when(cantorService.findAll()).thenReturn(cantores);

        mockMvc.perform(get("/cantores"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(4))

                .andExpect(jsonPath("$[0].nomeCantor").value("Gilberto Gil"))
                .andExpect(jsonPath("$[0].pais").value("Brasil"))
                .andExpect(jsonPath("$[1].nomeCantor").value("Milton Nascimento"))
                .andExpect(jsonPath("$[1].pais").value("Brasil"))
                .andExpect(jsonPath("$[2].nomeCantor").value("Caetano Veloso"))
                .andExpect(jsonPath("$[2].pais").value("Brasil"))
                .andExpect(jsonPath("$[3].nomeCantor").value("U2"))
                .andExpect(jsonPath("$[3].pais").value("Irlanda"));

        MvcResult result = mockMvc.perform(get("/cantores")).andReturn();

        getPrettyJson(result);
    }

    @Test
    void testFindById() throws Exception {
        Cantor cantorMock = new Cantor(0, "Gilberto Gil", "Brasil");

        Mockito.when(cantorService.findById(0)).thenReturn(Optional.of(cantorMock));

        MvcResult result = mockMvc.perform(get("/cantores/0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nomeCantor").value("Gilberto Gil"))
                .andExpect(jsonPath("$.pais").value("Brasil"))
                .andExpect(jsonPath("$.length()").value(3))
                .andReturn();

        getPrettyJson(result);
    }

    @Test
    public void testCreateCantor() throws Exception {
        Cantor cantor = new Cantor(null, "Caetano Veloso", "Brasil");
        Cantor savedCantor = new Cantor(1, "Caetano Veloso", "Brasil");

        Mockito.when(cantorService.save(Mockito.any(Cantor.class))).thenReturn(savedCantor);
        
        // 1. Teste com JSON escrito manualmente
        mockMvc.perform(post("/cantores")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"nomeCantor\":\"Caetano Veloso\",\"pais\":\"Brasil\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.codCantor").value(1))
                .andExpect(jsonPath("$.nomeCantor").value("Caetano Veloso"))
                .andExpect(jsonPath("$.pais").value("Brasil"));

        String cantorJson = new ObjectMapper().writeValueAsString(cantor);
        
        // 2. Teste com objeto serializado via ObjectMapper
        MvcResult result = mockMvc.perform(post("/cantores")
                .contentType(MediaType.APPLICATION_JSON)
                .content(cantorJson))
                .andExpect(status().isOk())
                .andReturn();

        getPrettyJson(result);

    }

    @Test
    public void testDeleteCantor() throws Exception {
        Mockito.doNothing().when(cantorService).deleteById(1);

        mockMvc.perform(delete("/cantores/1"))
                .andExpect(status().isNoContent());

        Mockito.verify(cantorService, Mockito.times(1)).deleteById(1);
    }

    @Test
    public void testFindById_NotFound() throws Exception {
        Mockito.when(cantorService.findById(99)).thenReturn(Optional.empty());

        mockMvc.perform(get("/cantores/99"))
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