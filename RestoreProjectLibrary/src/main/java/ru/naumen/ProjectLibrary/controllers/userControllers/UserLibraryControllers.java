package ru.naumen.ProjectLibrary.controllers.userControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.naumen.ProjectLibrary.services.LibraryService;

@Controller
@RequestMapping("/user-libraries")
public class UserLibraryControllers {

    private final LibraryService libraryService;

    @Autowired
    public UserLibraryControllers(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("library", libraryService.findAll());
        return "/user/people/libraries/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("library", libraryService.findOne(id));
        model.addAttribute("library", libraryService.getLibraryById(id));

        return "/user/people/libraries/show";
    }

    /*@GetMapping("/owner/{id}")
    public String showByOwnerId(@PathVariable("id") int id, Model model) {
        model.addAttribute("library", libraryService.findByOwnerId(id));
        return "libraries/show";
    }*/
}

