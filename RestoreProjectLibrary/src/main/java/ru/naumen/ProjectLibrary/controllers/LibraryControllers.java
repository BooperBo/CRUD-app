package ru.naumen.ProjectLibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.naumen.ProjectLibrary.services.LibraryService;

@Controller
@RequestMapping("/libraries")
public class LibraryControllers {

    private final LibraryService libraryService;

    @Autowired
    public LibraryControllers(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("library", libraryService.findAll());
        return "libraries/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("library", libraryService.findOne(id));
        model.addAttribute("library", libraryService.getLibraryById(id));

        return "libraries/show";
    }

    /*@GetMapping("/owner/{id}")
    public String showByOwnerId(@PathVariable("id") int id, Model model) {
        model.addAttribute("library", libraryService.findByOwnerId(id));
        return "libraries/show";
    }*/
}

