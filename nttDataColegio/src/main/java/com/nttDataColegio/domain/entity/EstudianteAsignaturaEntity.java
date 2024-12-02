package com.nttDataColegio.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estudiante_asignatura")
@Getter
@Setter
public class EstudianteAsignaturaEntity {

    @EmbeddedId
    private EstudianteAsignaturaId id;

}
