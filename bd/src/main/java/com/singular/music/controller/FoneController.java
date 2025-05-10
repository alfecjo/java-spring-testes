package com.singular.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singular.music.dto.FoneDTO;
import com.singular.music.model.Fone;
import com.singular.music.model.Pessoa;
import com.singular.music.service.FoneService;

@RestController
@RequestMapping("/fone")
public class FoneController {
    @Autowired
    private FoneService foneService;

    @GetMapping
    public List<Fone> findAll() {
        return foneService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoneDTO> findById(@PathVariable Integer id) {
        return foneService.findById(id)
                .map(fone -> ResponseEntity.ok(new FoneDTO(fone)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FoneDTO> createFone(@RequestBody FoneDTO foneDTO) {
        Pessoa pessoa = new Pessoa(foneDTO.pessoa().codPessoa(), foneDTO.pessoa().nomePessoa(), null);
        Fone fone = new Fone(null, foneDTO.numero(), foneDTO.tipo(), pessoa);
        Fone savedFone = foneService.save(fone);

        return ResponseEntity.ok(new FoneDTO(savedFone));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        foneService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
