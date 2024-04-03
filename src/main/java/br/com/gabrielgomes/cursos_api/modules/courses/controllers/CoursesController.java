package br.com.gabrielgomes.cursos_api.modules.courses.controllers;

import br.com.gabrielgomes.cursos_api.modules.courses.entities.CourseEntity;
import br.com.gabrielgomes.cursos_api.modules.courses.useCases.CreateCourseUseCase;
import br.com.gabrielgomes.cursos_api.modules.courses.useCases.ListCourseUseCase;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    @Autowired
    private CreateCourseUseCase createCourseUseCase;
    @Autowired
    private ListCourseUseCase listCourseUseCase;

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

    @GetMapping("/")
    public ResponseEntity<Object> get(){
            try{
                var result = this.listCourseUseCase.execute();
                return ResponseEntity.ok().body(result);
            }catch(Exception e){
                e.printStackTrace();
                return ResponseEntity.badRequest().body(e.getMessage());
            }
    }
}
