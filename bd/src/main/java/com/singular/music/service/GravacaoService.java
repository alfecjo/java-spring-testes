package com.singular.music.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.singular.music.model.Gravacao;
import com.singular.music.repository.GravacaoRepository;

@Service
public class GravacaoService {
    
    private GravacaoRepository gravacaoRepository;

    public GravacaoService(GravacaoRepository gravacaoRepository) {
        this.gravacaoRepository = gravacaoRepository;
    }

    public List<Gravacao> findByAnoGravacao(Integer anoGravacao) {
        return gravacaoRepository.findByAnoGravacao(anoGravacao);
    }

    public List<Gravacao> findByCodGravadora(Integer codGravadora) {
        return gravacaoRepository.findByCodGravadora(codGravadora);
    }

    public List<Gravacao> findByCodCantor(Integer codCantor) {
        return gravacaoRepository.findByCodCantor(codCantor);
    }

    public List<Gravacao> findByCodCategoria(Integer codCategoria) {
        return gravacaoRepository.findByCodCategoria(codCategoria);
    }

    public List<Gravacao> findByCodGravacao(Integer codGravacao) {
        return gravacaoRepository.findByCodGravacao(codGravacao);
    }

    public List<Gravacao> findByTituloGravacao(String tituloGravacao) {
        return gravacaoRepository.findByTituloGravacao(tituloGravacao);
    }

    public List<Gravacao> findByDuracaoGravacao(Integer duracaoGravacao) {
        return gravacaoRepository.findByDuracaoGravacao(duracaoGravacao);
    }

    public List<Gravacao> findByAnoGravacaoAndCodGravadora(LocalDate dataGravacao, Integer codGravadora) {
        return gravacaoRepository.findByAnoGravacaoAndCodGravadora(dataGravacao, codGravadora);
    }

    public List<Gravacao> findByAnoGravacaoAndCodCantor(LocalDate dataGravacao, Integer codCantor) {
        return gravacaoRepository.findByAnoGravacaoAndCodCantor(dataGravacao, codCantor);
    }

    public List<Gravacao> findByAnoGravacaoAndCodCategoria(LocalDate dataGravacao, Integer codCategoria) {
        return gravacaoRepository.findByAnoGravacaoAndCodCategoria(dataGravacao, codCategoria);
    }

    public List<Gravacao> findByAnoGravacaoAndCodGravacao(LocalDate dataGravacao, Integer codGravacao) {
        return gravacaoRepository.findByAnoGravacaoAndCodGravacao(dataGravacao, codGravacao);
    }

    public List<Gravacao> findByAnoGravacaoAndTituloGravacao(LocalDate dataGravacao, String tituloGravacao) {
        return gravacaoRepository.findByAnoGravacaoAndTituloGravacao(dataGravacao, tituloGravacao);
    }

    public List<Gravacao> findByAnoGravacaoAndDuracaoGravacao(LocalDate dataGravacao, Integer duracaoGravacao) {
        return gravacaoRepository.findByAnoGravacaoAndDuracaoGravacao(dataGravacao, duracaoGravacao);
    }

    public List<Gravacao> findByAnoGravacaoAndCodGravadoraAndCodCantor(LocalDate dataGravacao, Integer codGravadora,
            Integer codCantor) {
        return gravacaoRepository.findByAnoGravacaoAndCodGravadoraAndCodCantor(dataGravacao, codGravadora, codCantor);
    }

    public List<Gravacao> findByAnoGravacaoAndCodGravadoraAndCodCategoria(LocalDate dataGravacao, Integer codGravadora,
            Integer codCategoria) {
        return gravacaoRepository.findByAnoGravacaoAndCodGravadoraAndCodCategoria(dataGravacao, codGravadora,
                codCategoria);
    }

    public List<Gravacao> findByAnoGravacaoAndCodGravadoraAndCodGravacao(LocalDate dataGravacao, Integer codGravadora,
            Integer codGravacao) {
        return gravacaoRepository.findByAnoGravacaoAndCodGravadoraAndCodGravacao(dataGravacao, codGravadora,
                codGravacao);
    }

    public List<Gravacao> findByAnoGravacaoAndCodGravadoraAndTituloGravacao(LocalDate dataGravacao,
            Integer codGravadora, String tituloGravacao) {
        return gravacaoRepository.findByAnoGravacaoAndCodGravadoraAndTituloGravacao(dataGravacao, codGravadora,
                tituloGravacao);
    }

    public List<Gravacao> findByAnoGravacaoAndCodGravadoraAndDuracaoGravacao(LocalDate dataGravacao,
            Integer codGravadora, Integer duracaoGravacao) {
        return gravacaoRepository.findByAnoGravacaoAndCodGravadoraAndDuracaoGravacao(dataGravacao, codGravadora,
                duracaoGravacao);
    }

    public List<Gravacao> findByAnoGravacaoAndCodCantorAndCodCategoria(LocalDate dataGravacao, Integer codCantor,
            Integer codCategoria) {
        return gravacaoRepository.findByAnoGravacaoAndCodCantorAndCodCategoria(dataGravacao, codCantor, codCategoria);
    }

    public List<Gravacao> findAll() {
        return gravacaoRepository.findAll();
    }

    public Gravacao findById(Integer id) {
        return gravacaoRepository.findById(id).orElse(null);
    }

    public Gravacao save(Gravacao gravacao) {
        return gravacaoRepository.save(gravacao);
    }

    public void deleteById(Integer id) {
        gravacaoRepository.deleteById(id);
    }
}
