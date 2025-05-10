package com.banco.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.avaliacao.entity.Cargo;
import com.banco.avaliacao.repository.CargoRepository;

@Service
public class CargoService {
    @Autowired
    private CargoRepository cargoRepository;

    public void saveCargo(Cargo cargo) {
        cargoRepository.save(cargo);
    }

    public void deleteCargoById(Integer id) {
        cargoRepository.deleteById(id);
    }

    public List<Cargo> listaTodosCargos() {
        return cargoRepository.findAll();
    }
}
