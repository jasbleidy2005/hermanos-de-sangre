package com.example.Hermanos.de.sangre.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numero;
    private String descripcion;
    private String imagenUrl;

    @ManyToOne
    @JoinColumn(name = "serie_id", nullable = false)
    private Serie serie;

    @OneToMany(mappedBy = "temporada", cascade = CascadeType.ALL)
    private List<Capitulo> capitulos;
}
