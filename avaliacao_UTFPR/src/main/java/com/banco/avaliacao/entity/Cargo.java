package com.banco.avaliacao.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_cargo", nullable = false)
    private Integer codCargo;

    @Column(name = "cargo", nullable = false, length = 50)
    private String cargoAtual;

    @OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public String toString() {
        return "\nId: " + this.codCargo +
                " - " + this.cargoAtual;
    }
}