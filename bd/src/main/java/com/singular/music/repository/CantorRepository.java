package com.singular.music.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.singular.music.model.Cantor;

@Repository
public interface CantorRepository extends JpaRepository<Cantor, Integer> {
    List<Cantor> findByPais(String pais);
}
