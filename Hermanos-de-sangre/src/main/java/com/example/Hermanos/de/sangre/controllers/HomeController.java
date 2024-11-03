package com.example.Hermanos.de.sangre.controllers;

import com.example.Hermanos.de.sangre.models.Serie;
import com.example.Hermanos.de.sangre.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private SerieService serieService;

    @GetMapping("/")
    public String showHomePage(Model model) {
        // Obtener la serie con sus datos básicos
        Serie serie = serieService.getAllSeries().get(0); // Suponiendo que solo hay una serie
        model.addAttribute("serie", serie);
        return "index";
    }
}
