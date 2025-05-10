package com.singular.music.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.singular.music.model.Gravacao;

@Repository
public interface GravacaoRepository extends JpaRepository<Gravacao, Integer> {
        List<Gravacao> findByCodCantor(Integer codCantor);

        List<Gravacao> findByAnoGravacao(Integer anoGravacao);

        List<Gravacao> findByCodGravadora(Integer codGravadora);

        List<Gravacao> findByCodCategoria(Integer codCategoria);

        List<Gravacao> findByCodGravacao(Integer codGravacao);

        List<Gravacao> findByTituloGravacao(String tituloGravacao);

        List<Gravacao> findByDuracaoGravacao(Integer duracaoGravacao);

        List<Gravacao> findByAnoGravacaoAndCodGravadora(LocalDate dataGravacao, Integer codGravadora);

        List<Gravacao> findByAnoGravacaoAndCodCantor(LocalDate dataGravacao, Integer codCantor);

        List<Gravacao> findByAnoGravacaoAndCodCategoria(LocalDate dataGravacao, Integer codCategoria);

        List<Gravacao> findByAnoGravacaoAndCodGravacao(LocalDate dataGravacao, Integer codGravacao);

        List<Gravacao> findByAnoGravacaoAndTituloGravacao(LocalDate dataGravacao, String tituloGravacao);

        List<Gravacao> findByAnoGravacaoAndDuracaoGravacao(LocalDate dataGravacao, Integer duracaoGravacao);

        List<Gravacao> findByAnoGravacaoAndCodGravadoraAndCodCantor(LocalDate dataGravacao, Integer codGravadora,
                        Integer codCantor);

        List<Gravacao> findByAnoGravacaoAndCodGravadoraAndCodCategoria(LocalDate dataGravacao, Integer codGravadora,
                        Integer codCategoria);

        List<Gravacao> findByAnoGravacaoAndCodGravadoraAndCodGravacao(LocalDate dataGravacao, Integer codGravadora,
                        Integer codGravacao);

        List<Gravacao> findByAnoGravacaoAndCodGravadoraAndTituloGravacao(LocalDate dataGravacao, Integer codGravadora,
                        String tituloGravacao);

        List<Gravacao> findByAnoGravacaoAndCodGravadoraAndDuracaoGravacao(LocalDate dataGravacao, Integer codGravadora,
                        Integer duracaoGravacao);

        List<Gravacao> findByAnoGravacaoAndCodCantorAndCodCategoria(LocalDate dataGravacao, Integer codCantor,
                        Integer codCategoria);
}
