package br.com.gabrielgomes.cursos_api.modules.courses.useCases;

import br.com.gabrielgomes.cursos_api.modules.courses.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteCourseUseCase {
    @Autowired
    private CourseRepository courseRepository;

    public void execute(UUID id){
     this.courseRepository.deleteById(id);

    }

}
