package ru.naumen.course.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "city")
public class City {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Название города не должно быть пустым")
    @Size(min = 2, max = 100, message = "Название города должно быть от 2 до 100 символов длиной")
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "owner")
    private List<Library> libraries;

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

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
}
