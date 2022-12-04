package ru.naumen.ProjectLibrary.RestoreProjectLibrary.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.naumen.ProjectLibrary.RestoreProjectLibrary.models.Person;
import ru.naumen.ProjectLibrary.RestoreProjectLibrary.services.PeopleService;

@Component
public class PersonValidator implements Validator {
   /* private final PersonDetailsService personDetailsService;
    @Autowired
    public PersonValidator(PersonDetailsService personDetailsService) {
        this.personDetailsService = personDetailsService;
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }
    @Override
    public void validate(Object o, Errors errors) {
        Person person = (Person) o;
        try {
            personDetailsService.loadUserByUsername(person.getUsername());
        } catch (UsernameNotFoundException ignored) {
            return; // все ок, пользователь не найден
        }
        errors.rejectValue("username", "", "Человек с таким именем пользователя уже существует");
    }*/

    private final PeopleService peopleService;

    @Autowired
    public PersonValidator(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Person person = (Person) o;

        if (peopleService.getFindByUsername(person.getUsername()).isPresent())
            errors.rejectValue("username", "", "Человек с таким именем пользователя уже существует");
    }

}
