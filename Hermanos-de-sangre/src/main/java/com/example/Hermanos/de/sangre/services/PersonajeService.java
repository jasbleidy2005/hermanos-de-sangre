package com.example.Hermanos.de.sangre.services;

import com.example.Hermanos.de.sangre.models.Personaje;
import com.example.Hermanos.de.sangre.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }

    public Optional<Personaje> getPersonajeById(Long id) {
        return personajeRepository.findById(id);
    }

    public Personaje savePersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public void deletePersonaje(Long id) {
        personajeRepository.deleteById(id);
    }
}
