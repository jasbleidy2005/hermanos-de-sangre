package com.example.Hermanos.de.sangre.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String fotoUrl;

    private String detalle_adicional;

    @ManyToOne
    @JoinColumn(name = "temporada_id")
    private Temporada temporada;
}
