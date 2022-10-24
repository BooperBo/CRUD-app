package ru.naumen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.naumen.course.models.Library;
import ru.naumen.course.models.Person;

import java.util.Optional;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
    Optional<Library> findById(int id);
}
