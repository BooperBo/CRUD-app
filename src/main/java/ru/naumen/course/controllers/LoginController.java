package ru.naumen.course.controllers;

import ru.naumen.course.dto.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.naumen.course.services.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @GetMapping
    public String login(Model model){
        model.addAttribute("loginForm", new LoginForm());
        return "login_page";
    }

    @PostMapping("/auth")
    public String authenticate(LoginForm loginForm){
        if(loginService.authenticate(loginForm))
            return "redirect:/people";
        else
            return "redirect:/login";
    }
}
