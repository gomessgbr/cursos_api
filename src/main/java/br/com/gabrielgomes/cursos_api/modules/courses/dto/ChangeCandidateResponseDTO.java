package br.com.gabrielgomes.cursos_api.modules.courses.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangeCandidateResponseDTO {

    private String name;
    private String category;

}
