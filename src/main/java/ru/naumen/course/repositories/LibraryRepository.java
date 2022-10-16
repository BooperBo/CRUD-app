package ru.naumen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.naumen.course.models.Library;

public interface LibraryRepository extends JpaRepository<Library,Integer> {
}
