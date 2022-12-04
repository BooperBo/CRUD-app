package ru.naumen.ProjectLibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.naumen.ProjectLibrary.models.Library;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {
    List<Library> findByOwnerId(Integer ownerId);
}
