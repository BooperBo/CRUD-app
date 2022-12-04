package ru.naumen.ProjectLibrary.RestoreProjectLibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.naumen.ProjectLibrary.RestoreProjectLibrary.services.CitiesService;
import ru.naumen.ProjectLibrary.RestoreProjectLibrary.services.LibraryService;

@Controller
@RequestMapping("/cities")
public class CitiesController {

    private final CitiesService citiesService;
    private final LibraryService libraryService;

    @Autowired
    public CitiesController(CitiesService citiesService, LibraryService libraryService) {
        this.citiesService = citiesService;
        this.libraryService = libraryService;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("city", citiesService.findAll());
        return "cities/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("city", citiesService.findOne(id));
        model.addAttribute("library", libraryService.findByOwnerId(id));
        return "cities/show";
    }
}
