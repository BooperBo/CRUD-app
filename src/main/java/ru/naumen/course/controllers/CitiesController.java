package ru.naumen.course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.naumen.course.services.CitiesService;

@Controller
@RequestMapping("/cities")
public class CitiesController {

    private final CitiesService citiesService;

    @Autowired
    public CitiesController(CitiesService citiesService) {
        this.citiesService = citiesService;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("city", citiesService.findAll());
        return "cities/index";
    }

}
