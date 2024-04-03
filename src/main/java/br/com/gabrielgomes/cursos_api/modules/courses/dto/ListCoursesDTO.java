package br.com.gabrielgomes.cursos_api.modules.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListCoursesDTO {
    private String name;
    private String category;
    private String active;
    private String createdAt;
    private String updateAt;
}
