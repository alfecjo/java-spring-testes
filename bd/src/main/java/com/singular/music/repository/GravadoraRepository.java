package com.singular.music.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.singular.music.model.Gravadora;

public interface GravadoraRepository extends JpaRepository<Gravadora, Integer> {

    public List<Gravadora> findGravadoraAll();

}
