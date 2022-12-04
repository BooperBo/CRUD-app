package ru.naumen.ProjectLibrary.RestoreProjectLibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.naumen.ProjectLibrary.RestoreProjectLibrary.models.City;

import java.util.Optional;

@Repository
public interface CitiesRepository extends JpaRepository<City, Integer> {
    Optional<City> findById(int id);
}
