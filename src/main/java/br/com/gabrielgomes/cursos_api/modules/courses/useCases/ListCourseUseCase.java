package br.com.gabrielgomes.cursos_api.modules.courses.useCases;

import br.com.gabrielgomes.cursos_api.modules.courses.entities.CourseEntity;
import br.com.gabrielgomes.cursos_api.modules.courses.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListCourseUseCase {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseEntity> execute(){
        return this.courseRepository.findAll();
    }

}
