package ru.naumen.ProjectLibrary.RestoreProjectLibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.naumen.ProjectLibrary.RestoreProjectLibrary.models.Library;
import ru.naumen.ProjectLibrary.RestoreProjectLibrary.repositories.LibraryRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class LibraryService {

    private final LibraryRepository libraryRepository;

    @Autowired
    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Library> findAll() {
        return libraryRepository.findAll();
    }

    public Library findOne(int id) {
        Optional<Library> foundLibrary = libraryRepository.findById(id);
        return foundLibrary.orElse(null);
    }

    public Optional<Library> getLibraryById(int id) {
        return libraryRepository.findById(id);
    }

    public List<Library> findByOwnerId(Integer id) {
        return libraryRepository.findByOwnerId(id);
    }
}