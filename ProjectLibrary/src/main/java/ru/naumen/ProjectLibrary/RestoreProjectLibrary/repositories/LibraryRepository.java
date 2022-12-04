package ru.naumen.ProjectLibrary.RestoreProjectLibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.naumen.ProjectLibrary.RestoreProjectLibrary.models.Library;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {
    List<Library> findByOwnerId(Integer ownerId);
}
