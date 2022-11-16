package ru.naumen.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.naumen.course.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
