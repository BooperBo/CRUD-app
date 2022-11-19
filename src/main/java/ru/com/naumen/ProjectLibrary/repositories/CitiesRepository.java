package ru.com.naumen.ProjectLibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.com.naumen.ProjectLibrary.models.City;

import java.util.Optional;

public interface CitiesRepository extends JpaRepository<City, Integer> {
    Optional<City> findById(int id);
}
