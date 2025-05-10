package com.singular.music.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singular.music.dto.CantorDTO;
import com.singular.music.model.Cantor;
import com.singular.music.service.CantorService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cantores")
public class CantorController {
    @Autowired
    private CantorService cantorService;

    @GetMapping
    public List<Cantor> findAll() {
        return cantorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CantorDTO> findById(@PathVariable Integer id) {
        return cantorService.findById(id)
                .map(cantor -> ResponseEntity.ok(new CantorDTO(cantor)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cantor createCantor(@RequestBody Cantor cantor) {
        return cantorService.save(cantor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        cantorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
