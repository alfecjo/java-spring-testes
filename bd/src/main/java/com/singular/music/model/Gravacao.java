package com.singular.music.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "gravacao", schema = "dml")
public class Gravacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codGravacao;
    private LocalDate dataGravacao;

    @ManyToOne
    @JoinColumn(name = "cod_cantor", nullable = false)
    private Cantor cantor;

    @ManyToOne
    @JoinColumn(name = "cod_gravadora", nullable = false)
    private Gravadora gravadora;

    @ManyToOne
    @JoinColumn(name = "cod_musica", nullable = false)
    private Musica musica;
    // Getters e Setters
}

