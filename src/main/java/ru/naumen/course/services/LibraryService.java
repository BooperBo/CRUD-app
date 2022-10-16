package ru.naumen.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.naumen.course.repositories.LibraryRepository;
import ru.naumen.course.models.Library;

import java.util.List;

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
}
