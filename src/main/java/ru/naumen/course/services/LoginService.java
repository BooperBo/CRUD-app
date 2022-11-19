package ru.naumen.course.services;

import org.springframework.stereotype.Service;
import ru.naumen.course.dto.LoginForm;

import java.util.logging.Logger;

@Service("singleTransactionsService")
public class LoginService {

    public boolean authenticate(LoginForm loginForm) {
        return loginForm.getUsername().equals("root") && loginForm.getPassword().equals("123");
    }
}
