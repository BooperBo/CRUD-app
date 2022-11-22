package ru.naumen.ProjectLibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.naumen.ProjectLibrary.models.Library;

import java.util.List;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
    List<Library> findByOwnerId(Integer ownerId);
}
