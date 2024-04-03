package br.com.gabrielgomes.cursos_api.modules.courses.useCases;


import br.com.gabrielgomes.cursos_api.modules.courses.entities.CourseEntity;
import br.com.gabrielgomes.cursos_api.modules.courses.repositories.CourseRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ChangeCourseUseCase {
    @Autowired
    private CourseRepository courseRepository;


    public void execute(UUID id, CourseEntity courseEntity){
        var course = this.courseRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Não foi possível achar esse curso"));
        if(courseEntity.getName() != null){
            course.setName(courseEntity.getName());
        }
        else if(courseEntity.getCategory() != null){
            course.setCategory(courseEntity.getCategory());

        }

        this.courseRepository.save(course);


    }


}
