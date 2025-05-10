package com.banco.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.banco.avaliacao.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {

}
