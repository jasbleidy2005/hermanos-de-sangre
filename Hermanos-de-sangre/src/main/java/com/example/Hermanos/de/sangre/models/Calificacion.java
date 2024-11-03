package com.example.Hermanos.de.sangre.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer puntaje;

    @ManyToOne
    @JoinColumn(name = "capitulo_id")
    private Capitulo capitulo;
}

