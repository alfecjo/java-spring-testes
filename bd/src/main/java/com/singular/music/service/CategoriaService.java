package com.singular.music.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.singular.music.model.Categoria;
import com.singular.music.repository.CategoriaRepository;

@Service
public class CategoriaService {
    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }
    
    public Optional<Categoria> findById(Integer id) {
        return categoriaRepository.findById(id);
    }

      
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deleteById(Integer id) {
        categoriaRepository.deleteById(id);
    }

    public List<Categoria> findByCategoria(String categoria) {
        return categoriaRepository.findByCategoria(categoria);
    }
}
