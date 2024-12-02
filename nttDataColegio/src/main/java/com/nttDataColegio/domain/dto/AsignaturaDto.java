package com.nttDataColegio.domain.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AsignaturaDto {
    private Integer id;
    private String nombre;
    private Integer idProfesor;
    private Integer idCurso;
}
