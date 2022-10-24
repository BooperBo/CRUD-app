package ru.naumen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.naumen.course.models.City;
import ru.naumen.course.models.Library;

import java.util.Optional;

public interface CitiesRepository extends JpaRepository<City, Integer> {
    Optional<City> findById(int id);
}
