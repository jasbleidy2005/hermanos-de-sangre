package com.example.Hermanos.de.sangre.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Capitulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numero;
    private String nombre;
    private String descripcion;
    private String imagenUrl;

    @ManyToOne
    @JoinColumn(name = "temporada_id", nullable = false)
    private Temporada temporada;


    @OneToMany(mappedBy = "capitulo", cascade = CascadeType.ALL)
    private List<Calificacion> calificaciones;
}

