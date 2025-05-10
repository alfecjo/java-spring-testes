package com.singular.music.testsFone;

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

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.singular.music.controller.FoneController;
import com.singular.music.dto.FoneDTO;
import com.singular.music.dto.PessoaDTO;
import com.singular.music.model.Fone;
import com.singular.music.model.Pessoa;
import com.singular.music.service.FoneService;

public class FoneControllerTests {
    @Mock
    private FoneService foneService;

    @InjectMocks
    private FoneController foneController;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(foneController).build();
    }

    // Constatações 001
    @Test
    public void testFindAll() throws Exception {
        Pessoa pessoa = new Pessoa(1, "Marisa Monte", new ArrayList<Fone>());

        Fone fone = new Fone(1, "3333-1111", "R", null);
        Fone fone1 = new Fone(2, "4444-1111", "L", null);
        Fone fone2 = new Fone(3, "5555-1111", "C", null);

        pessoa.getTelefones().add(fone);
        pessoa.getTelefones().add(fone1);
        pessoa.getTelefones().add(fone2);

        fone.setPessoa(pessoa);
        fone1.setPessoa(pessoa);
        fone2.setPessoa(pessoa);

        List<Fone> mockFone = List.of(fone, fone1, fone2);

        Mockito.when(foneService.findAll()).thenReturn(mockFone);

        mockMvc.perform(get("/fone"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(3))
                .andExpect(jsonPath("$[0].numero").value("3333-1111"))
                .andExpect(jsonPath("$[1].numero").value("4444-1111"))
                .andExpect(jsonPath("$[1].codFone").value(2))
                .andExpect(jsonPath("$[2].tipo").value("C"));

        MvcResult result = mockMvc.perform(get("/fone")).andReturn();

        getPrettyJson(result);
    }

    @Test
    public void testFindById() throws Exception {
        Pessoa pessoa = new Pessoa(1, "Marisa Monte", new ArrayList<Fone>());
        Fone foneMock = new Fone(1, "3333-1111", "R", pessoa);

        Mockito.when(foneService.findById(1)).thenReturn(java.util.Optional.of(foneMock));

        MvcResult result = mockMvc.perform(get("/fone/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.numero").value("3333-1111"))
                .andExpect(jsonPath("$.tipo").value("R"))
                .andExpect(jsonPath("$.pessoa.nomePessoa").value("Marisa Monte"))
                .andReturn();

        getPrettyJson(result);
    }

    @Test
    public void testCreateFone() throws Exception {
        PessoaDTO pessoaDTO = new PessoaDTO(1, "Marisa Monte");
        FoneDTO foneDTO = new FoneDTO(null, "3333-1111", "R", pessoaDTO);

        Mockito.when(foneService.save(Mockito.any(Fone.class)))
                .thenReturn(new Fone(1, "3333-1111", "R", new Pessoa(1, "Marisa Monte", new ArrayList<>())));

        // 1. Teste com JSON escrito manualmente
        mockMvc.perform(post("/fone")
                .contentType(MediaType.APPLICATION_JSON)
                .content(
                        "{\"numero\":\"3333-1111\",\"tipo\":\"R\",\"pessoa\":{\"codPessoa\":1,\"nomePessoa\":\"Marisa Monte\"}}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.numero").value("3333-1111"))
                .andExpect(jsonPath("$.tipo").value("R"))
                .andExpect(jsonPath("$.pessoa.nomePessoa").value("Marisa Monte"));

        // 2. Teste com objeto serializado via ObjectMapper
        String jsonRequest = new ObjectMapper().writeValueAsString(foneDTO);

        MvcResult result = mockMvc.perform(post("/fone")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonRequest))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.numero").value("3333-1111"))
                .andExpect(jsonPath("$.tipo").value("R"))
                .andExpect(jsonPath("$.pessoa.nomePessoa").value("Marisa Monte"))
                .andReturn();

        getPrettyJson(result);
    }

    @Test
    public void testDeleteFone() throws Exception {
        Mockito.doNothing().when(foneService).deleteById(1);

        mockMvc.perform(delete("/fone/1"))
                .andExpect(status().isNoContent());

        Mockito.verify(foneService).deleteById(1);
    }

    @Test
    public void testFindById_NotFound() throws Exception {
        Mockito.when(foneService.findById(99)).thenReturn(java.util.Optional.empty());

        mockMvc.perform(get("/fone/99"))
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