package com.example.Hermanos.de.sangre.controllers;

import com.example.Hermanos.de.sangre.models.Capitulo;
import com.example.Hermanos.de.sangre.services.CapituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/capitulos")
public class CapituloController {

    @Autowired
    private CapituloService capituloService;

    @GetMapping
    public List<Capitulo> getAllCapitulos() {
        return capituloService.getAllCapitulos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Capitulo> getCapituloById(@PathVariable Long id) {
        Optional<Capitulo> serie = capituloService.getCapituloById(id);
        return serie.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Capitulo createCapitulo(@RequestBody Capitulo capitulo) {
        return capituloService.saveCapitulo(capitulo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCapitulo(@PathVariable Long id) {
        capituloService.deleteCapitulo(id);
        return ResponseEntity.noContent().build();
    }


}
