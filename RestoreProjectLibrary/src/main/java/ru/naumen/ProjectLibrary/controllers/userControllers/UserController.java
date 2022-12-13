package ru.naumen.ProjectLibrary.controllers.userControllers;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.naumen.ProjectLibrary.models.Person;
import ru.naumen.ProjectLibrary.services.PeopleService;
import ru.naumen.ProjectLibrary.util.PersonValidator;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private final PeopleService peopleService;
    private final PersonValidator personValidator;

    public UserController(PeopleService peopleService, PersonValidator personValidator) {
        this.peopleService = peopleService;
        this.personValidator = personValidator;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("people", peopleService.findAll());
        return "user/people/index";
    }

    @GetMapping("/home")
    public String getCurrentUsername(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("person", auth.getPrincipal());
        return "user/people/homepage";
    }
}
