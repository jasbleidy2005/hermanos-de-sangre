package com.example.Hermanos.de.sangre.services;

import com.example.Hermanos.de.sangre.models.Capitulo;
import com.example.Hermanos.de.sangre.repositories.CapituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapituloService {
    @Autowired
    private CapituloRepository capituloRepository;

    public static void save(Capitulo capitulo, Long id) {
    }


    public List<Capitulo> getAllCapitulos() {

        return capituloRepository.findAll();
    }

    public Optional<Capitulo> getCapituloById(Long id) {

        return capituloRepository.findById(id);
    }

    public Capitulo saveCapitulo(Capitulo capitulo) {

        return capituloRepository.save(capitulo);
    }

    public void deleteCapitulo(Long id) {

        capituloRepository.deleteById(id);
    }
}

