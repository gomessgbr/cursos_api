package br.com.gabrielgomes.cursos_api.modules.courses.controllers;

import br.com.gabrielgomes.cursos_api.modules.courses.entities.CourseEntity;
import br.com.gabrielgomes.cursos_api.modules.courses.useCases.ChangeCourseUseCase;
import br.com.gabrielgomes.cursos_api.modules.courses.useCases.CreateCourseUseCase;
import br.com.gabrielgomes.cursos_api.modules.courses.useCases.ListCourseUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    @Autowired
    private CreateCourseUseCase createCourseUseCase;
    @Autowired
    private ListCourseUseCase listCourseUseCase;

    @Autowired
    private ChangeCourseUseCase changeCourseUseCase;

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

    @PutMapping("/{id}")
    public ResponseEntity<Object> put( @PathVariable UUID id, @Valid @RequestBody CourseEntity courseEntity){
            try{
                this.changeCourseUseCase.execute(id, courseEntity);
                return ResponseEntity.ok(HttpStatus.CREATED);

            }catch (Exception e){
                e.printStackTrace();
                return ResponseEntity.badRequest().body(e.getMessage());
            }
    }
}



