package ru.naumen.ProjectLibrary.RestoreProjectLibrary.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "Library")
public class Library {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Название библиотеки не должно быть пустым")
    @Size(min = 2, max = 100, message = "Название библиотеки должно быть от 2 до 100 символов длиной")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Название адреса не должно быть пустым")
    @Size(min = 2, max = 100, message = "Название адреса должно быть от 2 до 100 символов длиной")
    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City owner;

    @OneToMany(mappedBy = "ownerLibrary")
    private List<Book> libraryBooks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getOwner() {
        return owner;
    }

    public void setOwner(City owner) {
        this.owner = owner;
    }

    public List<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public void setLibraryBooks(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }
}
