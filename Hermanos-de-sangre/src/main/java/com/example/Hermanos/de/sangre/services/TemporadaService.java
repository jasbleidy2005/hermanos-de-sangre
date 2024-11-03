package com.example.Hermanos.de.sangre.services;

import com.example.Hermanos.de.sangre.models.Temporada;
import com.example.Hermanos.de.sangre.repositories.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemporadaService {
    @Autowired
    private TemporadaRepository temporadaRepository;

    public List<Temporada> getAllTemporadas() {

        return temporadaRepository.findAll();
    }

    public Optional<Temporada> getTemporadaById(Long id) {

        return temporadaRepository.findById(id);
    }

    public Temporada saveTemporada(Temporada temporada) {

        return temporadaRepository.save(temporada);
    }

    public void deleteTemporada(Long id) {

        temporadaRepository.deleteById(id);
    }


}

