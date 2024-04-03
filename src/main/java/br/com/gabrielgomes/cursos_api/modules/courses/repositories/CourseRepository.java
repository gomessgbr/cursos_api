package br.com.gabrielgomes.cursos_api.modules.courses.repositories;

import br.com.gabrielgomes.cursos_api.modules.courses.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;


public interface CourseRepository extends JpaRepository<CourseEntity, UUID> {
    Optional<CourseEntity> findByNameOrCategory(String name, String category);

}
