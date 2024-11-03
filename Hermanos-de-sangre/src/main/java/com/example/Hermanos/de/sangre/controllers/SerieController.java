package com.example.Hermanos.de.sangre.controllers;

import com.example.Hermanos.de.sangre.models.Serie;
import com.example.Hermanos.de.sangre.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping
    public List<Serie> getAllSeries() {
        return serieService.getAllSeries();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> getSerieById(@PathVariable Long id) {
        Optional<Serie> serie = serieService.getSerieById(id);
        return serie.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Serie createSerie(@RequestBody Serie serie) {
        return serieService.saveSerie(serie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSerie(@PathVariable Long id) {
        serieService.deleteSerie(id);
        return ResponseEntity.noContent().build();
    }

}

