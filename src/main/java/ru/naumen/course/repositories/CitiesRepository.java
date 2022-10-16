package ru.naumen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.naumen.course.models.City;

public interface CitiesRepository extends JpaRepository<City, Integer> {
}
