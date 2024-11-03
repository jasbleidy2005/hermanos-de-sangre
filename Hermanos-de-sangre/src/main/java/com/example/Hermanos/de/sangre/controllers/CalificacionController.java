package com.example.Hermanos.de.sangre.controllers;

import com.example.Hermanos.de.sangre.models.Calificacion;
import com.example.Hermanos.de.sangre.services.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Calificacions")
public class CalificacionController {


    @Autowired
    private CalificacionService calificacionService;

    @GetMapping
    public List<Calificacion> getAllCalificacions() {
        return calificacionService.getAllCalificacions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calificacion> getCalificacionById(@PathVariable Long id) {
        Optional<Calificacion> calificacion = calificacionService.getCalificacionById(id);
        return calificacion.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Calificacion createCalificacion(@RequestBody Calificacion calificacion) {
        return calificacionService.saveCalificacion(calificacion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCalificacion(@PathVariable Long id) {
        calificacionService.deleteCalificacion(id);
        return ResponseEntity.noContent().build();
    }
}
