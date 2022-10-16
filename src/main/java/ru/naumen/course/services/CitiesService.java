package ru.naumen.course.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.naumen.course.models.City;
import ru.naumen.course.repositories.CitiesRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CitiesService {

    private final CitiesRepository citiesRepository;

    public CitiesService(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    public List<City> findAll() {
        return citiesRepository.findAll();
    }

}
