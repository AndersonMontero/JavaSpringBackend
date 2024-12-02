package com.nttDataColegio.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AsignaturaEstudiantesDto {
    private Integer asignaturaId;
    private String asignaturaNombre;
    private Integer curso;
    private List<EstudianteDto> estudiantes;
}
