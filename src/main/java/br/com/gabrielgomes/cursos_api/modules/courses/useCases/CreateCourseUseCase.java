package br.com.gabrielgomes.cursos_api.modules.courses.useCases;

import br.com.gabrielgomes.cursos_api.modules.courses.entities.CourseEntity;
import br.com.gabrielgomes.cursos_api.modules.courses.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCourseUseCase {
    @Autowired
    private CourseRepository courseRepository;

    public CourseEntity execute(CourseEntity courseEntity){
        return this.courseRepository.save(courseEntity);
    }

}
