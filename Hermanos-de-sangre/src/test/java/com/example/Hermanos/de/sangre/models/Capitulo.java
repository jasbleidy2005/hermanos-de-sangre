package com.example.Hermanos.de.sangre.models;

import jakarta.persistence.*;
import javax.validation.constraints.*;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Capitulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(1)
    private int numeroCapitulo;

    @NotBlank
    @Size(max = 255)
    private String nombre;

    @NotBlank
    private String descripcion;

    @NotBlank
    private String imagen1Url;

    @NotBlank
    private String imagen2Url;

    @DecimalMin("0.0")
    @DecimalMax("10.0")
    private double calificacion;

    @ManyToOne
    @JoinColumn(name = "temporada_id", nullable = false)
    private Temporada temporada;
}





