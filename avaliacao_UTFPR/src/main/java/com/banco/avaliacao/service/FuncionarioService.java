package com.banco.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.avaliacao.entity.Funcionario;
import com.banco.avaliacao.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public void saveFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    public void deleteFuncionarioById(Integer id) {
        funcionarioRepository.deleteById(id);
    }

    public List<Funcionario> findAllFuncionariosOrderByNomeAsc() {
        return funcionarioRepository.findAllOrderByNomeAsc();
    }

    public List<Funcionario> listaTodosFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Integer quantidadeDeFuncionarios() {
        return funcionarioRepository.countFuncionarios();
    }
}
