package com.singular.music.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.singular.music.model.Musica;
import com.singular.music.repository.MusicaRepository;

@Service
public class MusicaService {

    private final MusicaRepository musicaRepository;

    public MusicaService (MusicaRepository musicaRepository){
        this.musicaRepository = musicaRepository;
    }

    public List<Musica> findAll() {
        return musicaRepository.findAll();
    }

}
