package com.example.Hermanos.de.sangre.controllers;

import com.example.Hermanos.de.sangre.models.Personaje;
import com.example.Hermanos.de.sangre.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeService.getAllPersonajes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personaje> getPersonajeById(@PathVariable Long id) {
        Optional<Personaje> personaje = personajeService.getPersonajeById(id);
        return personaje.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Personaje createPersonaje(@RequestBody Personaje personaje) {
        return personajeService.savePersonaje(personaje);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonaje(@PathVariable Long id) {
        personajeService.deletePersonaje(id);
        return ResponseEntity.noContent().build();
    }


}

