package com.nttDataColegio.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@Data
@EqualsAndHashCode
public class EstudianteAsignaturaId implements Serializable {

    @Column(name = "estudiante_id")
    private Integer idEstudiante;
    @Column(name = "asignatura_id")
    private Integer idAsignatura;
}
