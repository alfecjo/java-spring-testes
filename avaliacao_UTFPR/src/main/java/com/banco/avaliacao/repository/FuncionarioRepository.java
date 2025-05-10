package com.banco.avaliacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banco.avaliacao.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    @Query("SELECT f FROM Funcionario f ORDER BY f.nome ASC")
    List<Funcionario> findAllOrderByNomeAsc();

    @Query("SELECT COUNT(f) FROM Funcionario f")
    int countFuncionarios();
}
