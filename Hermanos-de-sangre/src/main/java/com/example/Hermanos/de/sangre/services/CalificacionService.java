package com.example.Hermanos.de.sangre.services;

import com.example.Hermanos.de.sangre.models.Calificacion;
import com.example.Hermanos.de.sangre.repositories.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    public List<Calificacion> getAllCalificacions(){
        return calificacionRepository.findAll();
    }

    public Optional<Calificacion> getCalificacionById(Long id){
        return calificacionRepository.findById(id);
    }

    public  Calificacion saveCalificacion(Calificacion calificacion){
        return calificacionRepository.save(calificacion);
    }

    public void deleteCalificacion(Long id){
        calificacionRepository.deleteById(id);
    }
}
