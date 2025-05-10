package com.singular.music.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.singular.music.model.Gravadora;
import com.singular.music.repository.GravadoraRepository;

@Service
public class GravadoraService {

    private GravadoraRepository gravadoraRepository;

    public GravadoraService(GravadoraRepository gravadoraRepository){
        this.gravadoraRepository = gravadoraRepository;
    }

    public List<Gravadora> findGravadoraAll() {
        return gravadoraRepository.findGravadoraAll();
    }
}
