package com.singular.music.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.singular.music.model.Cantor;
import com.singular.music.repository.CantorRepository;

@Service
public class CantorService {
    private CantorRepository cantorRepository;

    public CantorService(CantorRepository cantorRepository) {
        this.cantorRepository = cantorRepository;
    }
    
    public List<Cantor> findAll() {
        return cantorRepository.findAll();
    }

    public Optional<Cantor> findById(Integer id) {
        return cantorRepository.findById(id);
    }

    public Cantor save(Cantor cantor) {
        return cantorRepository.save(cantor);
    }

    public void deleteById(Integer id) {
        cantorRepository.deleteById(id);
    }

    public List<Cantor> findByPais(String pais) {
        return cantorRepository.findByPais(pais);
    }
}
