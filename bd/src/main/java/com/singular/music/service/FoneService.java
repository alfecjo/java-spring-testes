package com.singular.music.service;

import java.util.List;
import java.util.Optional;

import com.singular.music.model.Fone;
import com.singular.music.repository.FoneRepository;

public class FoneService {

    private FoneRepository foneRepository;

    public FoneService (FoneRepository foneRepository){
        this.foneRepository = foneRepository;
    }

    public List<Fone> findAll(){
        return foneRepository.findAll();
    }

    public Optional<Fone> findById(int i) {
        return foneRepository.findById(i);
    }

    public Fone save(Fone foneNovo) {
        return foneRepository.save(foneNovo);
    }

    public void deleteById(Integer foneId) {
        foneRepository.deleteById(foneId);
    }

    public List<Fone> findByTipo(String string) {
        return foneRepository.findByTipo(string);
    }
}
