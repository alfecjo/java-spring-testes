package com.singular.music.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.singular.music.model.Fone;

public interface FoneRepository extends JpaRepository<Fone, Integer> {
    public List<Fone> findByTipo(String string);
}
