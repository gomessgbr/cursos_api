package br.com.gabrielgomes.cursos_api.modules.courses.controllers;

import br.com.gabrielgomes.cursos_api.modules.courses.entities.CourseEntity;
import br.com.gabrielgomes.cursos_api.modules.courses.useCases.CreateCourseUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    @Autowired
    private CreateCourseUseCase createCourseUseCase;

        @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CourseEntity courseEntity){
        try{
            var result = this.createCourseUseCase.execute(courseEntity);
            return ResponseEntity.ok().body(result);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
