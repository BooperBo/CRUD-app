package ru.naumen.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.naumen.course.models.City;
import ru.naumen.course.repositories.CitiesRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CitiesService {

    private final CitiesRepository citiesRepository;

    @Autowired
    public CitiesService(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    public List<City> findAll() {
        return citiesRepository.findAll();
    }

    public City findOne(int id) {
        Optional<City> foundCity = citiesRepository.findById(id);
        return foundCity.orElse(null);
    }

}