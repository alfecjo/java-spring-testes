package com.banco.avaliacao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_funcionario", nullable = false)
    private Integer codFuncionario;

    @Column(nullable = false, length = 70)
    private String nome;

    @Column(length = 10)
    private String sexo;

    @Column(length = 20)
    private String telefone;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cod_cargo", nullable = false)
    private Cargo cargo;

    @Override
    public String toString() {
        return "\nFuncionario: " + this.nome +
                "\nSexo: " + this.sexo +
                "\nTelefone: " + this.telefone +
                "\nCargo: " + this.cargo;
    }
}