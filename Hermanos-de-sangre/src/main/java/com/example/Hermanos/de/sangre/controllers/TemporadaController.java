package com.example.Hermanos.de.sangre.controllers;

import com.example.Hermanos.de.sangre.models.Capitulo;
import com.example.Hermanos.de.sangre.models.Temporada;
import com.example.Hermanos.de.sangre.services.TemporadaService;
import com.example.Hermanos.de.sangre.services.CapituloService;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class TemporadaController {

    @Autowired
    private TemporadaService temporadaService;

    @GetMapping("/temporadas")
    public String showTemporadas(Model model) {
        List<Temporada> temporadas = temporadaService.getAllTemporadas();
        model.addAttribute("temporadas", temporadas);
        return "temporadas";
    }

    @GetMapping("/temporadas/{id}/capitulos")
    public String showCapitulos(@PathVariable Long id, Model model) {
        Temporada temporada = temporadaService.getTemporadaById(id).orElse(null);
        model.addAttribute("temporada", temporada);
        model.addAttribute("capitulos", temporada.getCapitulos());
        return "capitulos";
    }

    @GetMapping("/temporadas/nueva")
    public String showNuevaTemporadaForm(Model model) {
        model.addAttribute("temporada", new Temporada());
        return "nueva-temporada";
    }

    @PostMapping("/temporadas/nueva")
    public String agregarNuevaTemporada(@ModelAttribute Temporada temporada) {
        temporadaService.saveTemporada(temporada);
        return "redirect:/temporadas";
    }

    @GetMapping("/temporadas/{id}/nuevo-capitulo")
    public String showNuevoCapituloForm(@PathVariable Long id, Model model) {
        Temporada temporada = temporadaService.getTemporadaById(id).orElse(null);
        model.addAttribute("temporada", temporada);
        model.addAttribute("capitulo", new Capitulo());
        return "nuevo-capitulo";
    }

    @PostMapping("/temporadas/{id}/nuevo-capitulo")
    public String agregarNuevoCapitulo(@PathVariable Long id, @ModelAttribute Capitulo capitulo) {

        CapituloService.save(capitulo, id);
        return "redirect:/temporadas/" + id + "/capitulos";
    }
}
