package com.nttDataColegio.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfesorAsignaturasEstudiantesDto {

    private Integer profesorId;
    private String profesorNombre;
    private List<AsignaturaEstudiantesDto> asignaturas;

}
