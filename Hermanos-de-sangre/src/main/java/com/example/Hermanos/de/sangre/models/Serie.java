package com.example.Hermanos.de.sangre.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String creador;
    private String clasificacion;
    private String descripcion;
    private String poster_url;
    private int anio_emision;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL)
    private List<Temporada> temporadas;

}
